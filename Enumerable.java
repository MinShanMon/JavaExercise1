public class Enumerable {
        private Rank rank;
        private Suit suit;

        public Enumerable(Rank rank, Suit suit) 
        {
            this.rank = rank;
            this.suit = suit;
        }
        public Rank getRank() 
        {
            return this.rank;
        } 
        public Suit getSuit() 
        {
            return this.suit;
        }

        public boolean isThreeClubs() 
        {
            return rank == Rank.THREE && 
            suit == Suit.CLUBS;
        }
        
        //test the value with enum typed variable
        public String getColor()
        {
            if(suit == Suit.SPADES || suit == Suit.CLUBS)
            {
                return "black";
            }
            else if (suit == Suit.DIAMONDS || suit == Suit.HEARTS)
            {
                return "red";
            }
            else{
                return null;
            }
        }

        //don't use Suit.SPADES, Suit.CLUBS, etc.
        public String getColorS()
        {
            switch(suit)
            {
                case SPADES:
                case CLUBS:
                    return "black";
                
                case DIAMONDS:
                case HEARTS:
                    return "red";
                
                default:
                    return null;
            }
        }
    public static void main(String[] args)
    {
        Suit spades = Suit.SPADES;
        Rank four = Rank.FOUR;
        Enumerable card1 = new Enumerable(four, spades);
        Enumerable card2 = new Enumerable(Rank.FOUR, Suit.SPADES);

        System.out.println(card1.getColorS());
        System.out.println(card2.getColor());
    }
}

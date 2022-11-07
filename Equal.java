
public class Equal {
    private int id;
    private String firstName;
    private String lastName;

    Equal(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public boolean equals(Object anotherE){
        if(!(anotherE instanceof Equal)){
            return false;
        }
        Equal anotherEqual = (Equal) anotherE;
        return anotherEqual.firstName == this.firstName &&
        anotherEqual.lastName == this.lastName &&
        anotherEqual.id == this.id;
    }

    public static void main(String[] args){
        Equal e1 = new Equal(1, "Bing", "Chandler");
        Equal e2 = new Equal(1, "Bing", "Chandler");

        if (e1.equals(e2)) {
            System.out.println("Equal.");
            } else {
            System.out.println("Oh! Why?");
            }
            
        // if (e1.eequals(e2)) {
        //     System.out.println("Equal.");
        //     } else {
        //     System.out.println("Oh! Why?");
        //     }
    }
}

package datetime;
public class DateTimeUnix {
    public static void main(String[] args){
        long startTS = System.currentTimeMillis();
        System.out.println(Fib(40));
        long endTS = System.currentTimeMillis();
        System.out.println("It takes "+ (endTS - startTS)+ "milliseconds");
    }

    public static int Fib(int n)
    {
        if (n <= 1)
        {
            return n;
        }
        else
        {
            return Fib(n - 1) + Fib(n - 2);
        }
    }
    
}

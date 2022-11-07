package statics;
public class MyMath {
    public static int max(int num1, int num2)
    {
        if(num1 > num2)
        {
            return num1;
        }
        return num2;
    }

    public static void main(String args[]){
        System.out.println(MyMath.max(1, 2));
    }
}

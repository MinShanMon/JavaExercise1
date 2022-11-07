package statics;
public class MyMathNonStatic {
    public int max (int num1, int num2){
        if(num1>num2){
            return num1;
        }
        return num2;
    }

    public static void main(String args[]){
        MyMathNonStatic myMath = new MyMathNonStatic();
        System.out.println(myMath.max(1,2));
    }
}

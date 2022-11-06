public class hello {
    public static void main(String[] args){
        System.out.println("hello");
    }

    public static boolean isTriangle(int side1, int side2, int side3){
        return side1 + side2 > side3 && side2 + side3 >side1 && side1+side3>side2;
    }

    
}
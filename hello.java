public class hello {
    public static void main(String[] args){
        System.out.println("hello");

        displayTriangleType(2, 2, 2);
        System.out.print(getDaysInMonth(2, 2022));
    }

    public static boolean isTriangle(int side1, int side2, int side3){
        return side1 + side2 > side3 && side2 + side3 >side1 && side1+side3>side2;
    }

    public static boolean isEquilateral(int side1, int side2, int side3){
        return isTriangle(side1, side2, side3) && side1 == side2 && side1==side3;
    }

    public static boolean isIsosceles(int side1, int side2, int side3){
        return isTriangle(side1, side2, side3) &&
        ((side1 == side2 && side1!=side3)||
        (side2 == side3 && side3!=side2)||
        (side1 == side3 && side1 != side2));
    }

    public static boolean isScalene(int side1, int side2, int side3){
        return isTriangle(side1, side2, side3)&&
        side1 != side2 && side1 != side3 && side2 != side3;
    }

    public static void displayTriangleType(int side1, int side2, int side3){
        if (!isTriangle(side1, side2, side3)){
            System.out.println("Not a triangle");
        }

        else if(isEquilateral(side1, side2, side3)){
            System.out.println("Equilateral");
        }

        else if(isIsosceles(side1, side2, side3)){
            System.out.println("is Isolceles");
        }

        else if(isScalene(side1, side2, side3)){
            System.out.println("Scalene");
        }
    }

    public static int getDaysInMonth(int month, int year){
        int numDays = 0;
        switch(month){
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                boolean isLeap =
                    (year % 400 == 0) ||
                    (year % 100 != 0 && year % 4 == 0);
                numDays = isLeap ? 29 : 28;
                break;
            default:
                numDays = 31;
                break;
        }
        return numDays;
    }
}
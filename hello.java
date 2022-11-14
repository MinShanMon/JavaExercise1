import java.util.Scanner;

public class hello {
    public static void main(String[] args){
        // System.out.println("hello");

        // displayTriangleType(2, 2, 2);
        // System.out.print(getDaysInMonth(2, 2022));
        // int k = 6;
        // System.out.println();
        // for(int i = 0; i <6; i++){
            
        //     for(int j = 1; j<=k;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        //     k-=1;
        // }
         
        testComparison();
    }


    public static boolean isTriangle(int side1, int side2, int side3)
    {
        return side1 + side2 > side3 && side2 + side3 >side1 && side1+side3>side2;
    }

    public static boolean isEquilateral(int side1, int side2, int side3)
    {
        return isTriangle(side1, side2, side3) && side1 == side2 && side1==side3;
    }

    public static boolean isIsosceles(int side1, int side2, int side3)
    {
        return isTriangle(side1, side2, side3) &&
        ((side1 == side2 && side1!=side3)||
        (side2 == side3 && side3!=side2)||
        (side1 == side3 && side1 != side2));
    }

    public static boolean isScalene(int side1, int side2, int side3)
    {
        return isTriangle(side1, side2, side3)&&
        side1 != side2 && side1 != side3 && side2 != side3;
    }

    public static void displayTriangleType(int side1, int side2, int side3){
        if (!isTriangle(side1, side2, side3))
        {
            System.out.println("Not a triangle");
        }

        else if(isEquilateral(side1, side2, side3))
        {
            System.out.println("Equilateral");
        }

        else if(isIsosceles(side1, side2, side3))
        {
            System.out.println("is Isolceles");
        }

        else if(isScalene(side1, side2, side3))
        {
            System.out.println("Scalene");
        }
    }

    //USE CASE
    public static int getDaysInMonth(int month, int year)
    {
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

    //MODULAR LOOP
    public static void displayParamid1(int n) 
    {
        for (int line = 1; line <= n; line++) 
        {
        displayLine(line, n);
        }
    }
    
    public static void displayLine(int lineNo, int n) 
    {
        for (int i = 1; i <= n - (lineNo - 1); i++) 
        {
        System.out.print(i + " ");
        }
        System.out.println(); // New line
    }

    public static void displayParamid2(int n) 
    {
        for (int maxToDisplay = n; maxToDisplay >=1; maxToDisplay--) 
        {
        displayLine2(maxToDisplay);
        }
    }

    public static void displayLine2(int maxToDisplay)
    {
        for (int i = 1; i <= maxToDisplay; i++) 
        {
        System.out.print(i + " ");
        }
        System.out.println(); // New line
    }
//foreach in java
    static void traverseArray1(String[] names)
    {
        for(String name: names)
        {
            System.out.println(name);
        }
    }


    static void displayMaxAndMaxTimes(int[] arr) 
    {
        int max = getMax(arr);
        int maxTimes = getMaxTimes(arr, max);
        System.out.println(max + " (" + maxTimes + " elements)");
    }

    static int getMax(int[] arr) 
    {
        int max = arr[0];
        for (int i=1; i < arr.length; i++) 
        {
            if (arr[i] > max) 
            {
                max = arr[i];
            }
        }
        return max;
    }

    static int getMaxTimes(int[] arr, int max) 
    {
        int maxTimes = 0;
        for (int number : arr) 
        {
            if (number == max) 
            {
                maxTimes++;
            }
        }
        return maxTimes;
    }

    static void displayTotal2(int []arr) {
        int evenTotal = 0;
        int oddTotal = 0;
        for (int number: arr) 
        {
            if (number % 2 == 0) 
            {
                evenTotal += number;
            } 
            else 
            {
            oddTotal += number;
            }
        }
        System.out.println(evenTotal);
        System.out.println(oddTotal);
    }

    static void testComparison() 
    {
        String s1 = "Hi, SA students!";
        String s2 = new String("hi, sa students!");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(
        s1.equalsIgnoreCase(s2));
    }

    static void testEmpty() 
    {
        String s1 = "Not empty";
        String s2 = "";
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
    }
}
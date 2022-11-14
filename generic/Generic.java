package generic;
import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Generic {
    static <T> void printArr(T[] arr){
        for(int i=0; i<arr.length; i++){
            T t = arr[i];
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Integer[] intArr = {1,2,3};
        printArr(intArr);

        Double[] doubleArr = {1.2, 2.2, 3.3};
        printArr(doubleArr);

        String[] stringArr={"aa", "bb", "cc"};
        printArr(stringArr);

        
        System.out.print(getElement(stringArr, 1));
        System.out.println(isContained(stringArr, "bb"));

        makeNoiseNTimes(new GenericCat("cat"), 2);

        //Interface
        System.out.println(max(1, 2, 3));
        System.out.println(max(1.1, 3.3, 2.2));
        System.out.println(max("cc", "aa", "cc"));

        //before wild card
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println(sum(intList));
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        doubleList.add(3.3);
        System.out.println(sum(doubleList));

        //generic class using
        GenericClass <Integer> intg = new GenericClass<Integer>();
        intg.setData(10);
        System.out.println(intg.getData());

        //generic type pair
        GenericPair<String> fruits = new GenericPair<String>("apple", "orange");
        System.out.println(fruits.getElement1() + " " +fruits.getElement2());
        System.out.println(fruits);
        GenericPair<Integer> acamiableNumbers = new GenericPair<Integer>(220, 280);
        System.out.println(acamiableNumbers.getElement1() + acamiableNumbers.getElement2());
        System.out.println(acamiableNumbers);
    }
    //generic 
    static <T> T getElement(T[] arr, int index){
        if(index <= arr.length -1){
            return arr[index];
        }
        return null;
    }
    //generic return
    static <T> boolean isContained(T[] arr, T element){
        for(T item: arr){
            if(item.equals(element)){
                return true;
            }
        }
        return false;
    }
    //generic extends bounded generic type
    static <T extends GenericAnimal> void makeNoiseNTimes(T myAni, int N){
        for(int i = 0; i <N ; i++){
            myAni.makeSound();
        }
    }

    //generic interface 
    static <T extends Comparable<T>> T max(T e1, T e2, T e3) 
    {
        T max = e1;
        if ( e2.compareTo(max) > 0) {
            max = e2;
        }
        if (e3.compareTo(max) > 0) {
            max = e3;
        }
        return max;
    }

//     Because doubleValue() method is from class Number, 
// polymorphism with Number has been already good enough
// Alternative to sum(), use the simpler version sum2()

    static <T extends Number> double sum(List<T> list){
        double sum = 0;
        // for (T e: list){
        //     sum += e.doubleValue();
        // }
        for (Number e: list){
            sum += e.doubleValue();
        }
        return sum;
    }
    //generic wild card same with up method
    static double sum1(List<? extends Number> list){
        double sum = 0;
        for(Number e: list){
            sum += e.doubleValue();
        }
        return sum;
    }

    //generic wild card cannot use
    public <T extends GenericShape> void addIfPretty(List<T> shapes, T shape){
        
            if(shape.isPretty()){
                shapes.add(shape);
            }
        
    }

    //generic wild card can use
    public <T extends GenericShape> void printArr(List<T> arr){
        for(T e: arr){
            System.out.println(e);
        }
    }

    //beside static method, we can use generic types in the class level

    //pracitce arraylist
    static void testArrayList(){
        String name1 = "Wolfgang Amadeus";
        String name2 = "Ludwing";

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add(0, name1);
        // nameList.put(0, name2);
        
    }

    static void testHashMap(){
        String name1 = "Wolfgang Amadeus Mozart";
        String name2 = "Ludwig van Beethoven";

        HashMap<String, Integer> nameToLength = new HashMap<>();
        nameToLength.put(name1, name1.length());
        nameToLength.put(name2, name2.length());
    }
}

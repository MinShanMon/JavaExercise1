package collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CollectionCircle implements Comparable<CollectionCircle>{
    public double radius;

    public CollectionCircle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }
    @Override
    public int compareTo(CollectionCircle other){
        if(this.radius< other.radius){
            return -1;
        }

        else if(this.radius>other.radius){
            return 1;
        }
        
        else{
            return 0;
        }
    }

    @Override
    public String toString(){
        return String.format("Radius: %s", this.radius);
    }
    public static void sortCircles(){
        CollectionCircle[] myCircles = {
            new CollectionCircle(3.0),
            new CollectionCircle(5.0),
            new CollectionCircle(1.0)
        };

    
        Arrays.sort(myCircles);

        for(CollectionCircle myCircle: myCircles){
            System.out.print(myCircle + " ");
        }
    }

    public void orderCicle(){
        CollectionCircle[] myC = { new CollectionCircle(3.0), new CollectionCircle(5.0), new CollectionCircle(1.0)};
        Arrays.sort(myC, new Comparator<CollectionCircle>(){
            @Override
            public int compare(CollectionCircle c1, CollectionCircle c2){
                if(c1.getRadius() < c2.getRadius()){
                    return -1;
                }
                else if(c1.getRadius() > c2.getRadius()){
                    return 1;
                }
                else{
                    return 0;
                }
            }
        });
        for (CollectionCircle myCircle : myC){
            System.out.print(myCircle + " " );
        }
    }

    public static void main(String[] args){
        sortCircles();
    }
}

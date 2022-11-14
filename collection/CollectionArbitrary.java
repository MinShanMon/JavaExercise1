package collection;
import java.util.Comparator;

public class CollectionArbitrary implements Comparator<CollectionStudent>{
    @Override
    public int compare(CollectionStudent s1, CollectionStudent S){
        return s1.getName().compareTo(S.getName());
    }


}

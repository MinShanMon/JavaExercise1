package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionMyClass {

    List<CollectionStudent> su = new ArrayList<>();
    public void addStudent(CollectionStudent stu){
        su.add(stu);
    }

    //calling arbitrary
    // public void orderByName(){
    //     List<CollectionStudent> studentList = new ArrayList<>(su);
    //     Collections.sort(studentList, new CollectionArbitrary());
    //         for(CollectionStudent stud : studentList){
    //             System.out.println(stud);
    //         }
    // }

    public void orderByName(){
        List<CollectionStudent> studentList = new ArrayList(su);
        Collections.sort(studentList, new Comparator<CollectionStudent>(){
            @Override
            public int compare(CollectionStudent o1, CollectionStudent o2){
                return o1.getName().compareTo(o2.getName());
            }
        });
        for(CollectionStudent stud: studentList){
            System.out.println(stud);
        }
    }
    public void displayAllOrderByMatricNumber(){
        List<CollectionStudent> studentList = new ArrayList<>(su);
        Collections.sort(studentList);

        for (CollectionStudent stud: studentList){
            System.out.println(stud);
        }
    }


    public static void main(String[] args){
        CollectionMyClass mc = new CollectionMyClass();
        mc.addStudent(new CollectionStudent("A0000005D", "Iron Man"));
        mc.addStudent(new CollectionStudent("A0000002B", "Captain America"));
        mc.addStudent(new CollectionStudent("A0000001A", "Black Widow"));
        mc.addStudent(new CollectionStudent("A0000004D", "Captain Marvel"));
        mc.addStudent(new CollectionStudent("A0000003C", "Spider Man"));

        // mc.displayAllOrderByMatricNumber();

        mc.orderByName();
    }
}

package inheritances.parent.child.main;
import inheritances.parent.child.InheritanceChild;

public class mainInheritance {
    public static void main(String[] args){
        InheritanceChild child = new InheritanceChild("oscar", 5000, "pro");
        System.out.println(child.getDepartment());
    }

}

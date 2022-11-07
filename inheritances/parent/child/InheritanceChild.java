package inheritances.parent.child;
import java.util.ArrayList;
import java.util.List;

import inheritances.parent.Inheritance;

public class InheritanceChild extends Inheritance {
    private String department;
    private List<Inheritance> subordinates;

    public InheritanceChild(String name, double monthlySalary, String department){
        super(name, monthlySalary);
        subordinates = new ArrayList<>();
        this.setDepartment(department);
    }

    public void setDepartment(String dep){
        this.department = dep;
    }

    public String getDepartment(){
        return this.department;
    }

    @Override
    public double getAnnualSalary(double bonus){
        double annual = super.getAnnualSalary(bonus);
        double stockOption = annual * 0.15;
        return annual + stockOption;
    }

}

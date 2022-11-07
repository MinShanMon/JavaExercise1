package inheritances.parent;
public class Inheritance {
    private String name;
    private double monthlySalary;
    public Inheritance(String name, double monthlySalary){
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public double getAnnualSalary(double bonus){
        return monthlySalary * 12 + bonus;
    }
}

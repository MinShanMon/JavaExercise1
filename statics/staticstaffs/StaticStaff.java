package statics.staticstaffs;

public class StaticStaff {
    private String name;
    private double salary; 
    public StaticStaff(String name, double salary) {
        this.setName(name);
        this.salary = salary;
    }

    public static double increaseSalary(double salary, double amount) {
        return salary + amount;
    }

    public static String toString(String name, double salary) {
        return "Employee[name=" + name + ",salary=" + salary + "]";
    }

    //can't use static with this.name
    public void setSalary(double name){
        this.salary = name;
    }

    //can't use static with this.name
    public double getSalary(){
        return this.salary;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    // public static void main(String[] args){

    // }
    public static void main(String args[]){
        StaticStaff staff = new StaticStaff("oscar", 4000);
        double newSal = StaticStaff.increaseSalary(staff.getSalary(), 2000);
        staff.setSalary(newSal);

        System.out.println(StaticStaff.toString( staff.getName(), staff.getSalary()));
    }
}

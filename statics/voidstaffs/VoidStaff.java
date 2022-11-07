package statics.voidstaffs;
import java.lang.System;
public class VoidStaff {
    private String name;
    private double salary; 
    public VoidStaff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void increaseSalary(double amount) {
        this.salary += amount;
    }
    public String toString() {
        return "Employee[name=" + name + ",salary=" + salary + "]";
    }

    public static void main(String args[]){
        VoidStaff staff = new VoidStaff("oscar",5000 );
        staff.increaseSalary(4000);
        System.out.println(staff.toString());
    }
}

public class Employee {
    public int id;

    private String name;
    public Employee(int id, String name) {
    this.id = id;
    this.name = name;
    }
    
    @Override
    public String toString() {
    return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    //static need return because it is getter and setter 
    public void ttt(int id){
        this.id = id;
    }

    public static void main(String[] args) 
    {
        //ref type value change
        Employee emp = new Employee(1, "Alex Tan");
        changeValue(emp);
        System.out.println(emp);
        //primitive type value cannot change
        int num1 = 1;
        int num2 = 2;
        swap(num1, num2);
        System.out.println("After calling swap, " + 
        "num1 is " + num1 + 
        " and num2 is " + num2);

        //ref type value swap using method
        Employee emp1 = new Employee(1, "Alex Tan");
        Employee emp2 = new Employee(2, "Mike Ng");
        swap(emp1, emp2);
        System.out.println(emp1);
        System.out.println(emp2);

    }

    //ref type value change
    static void changeValue(Employee e) 
    {
        e.setName("Brian Goh");
        System.out.println(e);
    }

    //privitive type value cannot change
    public static void swap(int n1, int n2) {
        int tmp = n1;
        n1 = n2;
        n2 = tmp;
        System.out.println("n1 is " + n1
        + " and n2 is " + n2);
    }

    static void swap(Employee e1, Employee e2) 
    {
        Employee tmp = e1;
        e1 = e2;
        e2 = tmp;
        System.out.println(e1);
        System.out.println(e2);
    }
}

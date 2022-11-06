class test{
    public int id;
    private String name;
    public test(int id, String name) {
    this.id = id;
    this.name = name;
    }
    public override String toString() {
    return name;
    }

    public static void tt(){
        System.Console.WriteLine("testing");
    }

    public static void ttt(int id){
        this.id = id;
    }
}
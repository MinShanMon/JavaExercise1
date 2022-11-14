package generic;
public class GenericAnimal {
    private String name;
    public GenericAnimal(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    protected void makeSound(){
        System.out.println("lol");
    }


}

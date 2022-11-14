package generic;

public class GenericCat extends GenericAnimal {
    public GenericCat(String name){
        super(name);        
    }

    @Override
    public void makeSound(){
        System.out.println("woof");
    }
}

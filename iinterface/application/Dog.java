package iinterface.application;
public class Dog extends Animal implements IPet{
    public void makeSound(){
        System.out.print("woof");
    }
    public void beFriendly(){
        System.out.println("Implementation details omitted");
    }

    public void play(){
        System.out.println("Implementation details omitted");
    }
}

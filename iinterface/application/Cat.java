package iinterface.application;

public class Cat extends Animal implements IPet  {
    public void makeSound(){
        System.out.print("meow");
    }
    public void beFriendly(){
        System.out.println("Implementation details omitted");
    }

    public void play(){
        System.out.println("Implementation details omitted");
    }
}

package iinterface.application;
public class main {
    public static void main(String[] args) 
    {
        AnimalChoir aniChoir = 
        new AnimalChoir();
        aniChoir.addMember(
        new Cat());
        aniChoir.addMember(new Dog());
        aniChoir.addMember(
        new Cat());
        aniChoir.sing();
    }

}

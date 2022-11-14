import java.util.ArrayList;
import java.util.List;
import iinterface.application.*;
public class PetShop {
    private List<IPet> pets;
    public PetShop() 
    {
        pets = new ArrayList<>();
    }
    public void addPet(IPet a) 
    {
        pets.add(a);
    }
    public void allPetDemo() {
        for (IPet pet : pets) 
        {
            pet.beFriendly();
            pet.play();
        }
    }
    public static void main(String args[]){
        main();
    }
    public static void main() {
        PetShop ps = new PetShop();
        ps.addPet(new Cat());
        ps.addPet(new Dog());
        ps.addPet(new VirtualPet("PC"));
        ps.addPet(new VirtualPet("Mobile"));
    }
        
}

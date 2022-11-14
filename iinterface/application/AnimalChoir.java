package iinterface.application;

import java.util.ArrayList;
import java.util.List;

public class AnimalChoir {
    private List<Animal> members;
    public AnimalChoir(){
        members= new ArrayList<>();
    }
    public void addMember(Animal a){
        members.add(a);
    }
    public void sing(){
        for(Animal a : members){
            a.makeSound();
        }
    }
}

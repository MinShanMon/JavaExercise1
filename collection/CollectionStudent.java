package collection;
public class CollectionStudent implements Comparable<CollectionStudent>{
    private String name;
    private String _matricNumber;
    public CollectionStudent(String _matricNumber, String newName) {
        setName(newName);
        setM(_matricNumber);
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setM(String m){
        this._matricNumber = m;
    }
    public String getName(){
        return this.name;
    }
    public String getM(){
        return this._matricNumber;
    }
    //collection sort override
    @Override
    public int compareTo(CollectionStudent other){
        return _matricNumber.compareTo(other._matricNumber);
    }
    
    @Override
    public String toString(){
        return String.format("%s (%s)", getName(), getM());
    }



}

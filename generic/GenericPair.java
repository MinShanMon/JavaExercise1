package generic;
public class GenericPair <T> {
    private T e1;
    private T e2;

    public GenericPair(T e1, T e2){
        this.setE1(e1);
        this.setE2(e2);
    }

    public void setE1(T e1){
        this.e1 = e1;
    }

    public void setE2(T e2){
        this.e2 = e2;
    }

    public T getElement1(){
        return e1;
    }

    public T getElement2(){
        return e2;
    }

    @Override
    public String toString(){
        return String.format("Element1: %s, Element2: %s ", getElement1(), getElement2());
    }
}

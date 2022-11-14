package generic;
public class GenericClass <T>{
    private T data;
    public GenericClass(){

    }

    public void setData(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }
}

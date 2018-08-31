package generic;

public class generictypeold<T> {

    private T t;

    public T get(){
        return t;
    }

    public void set(T t)
{this.t=t;}

    public static void main(String[] args) {

        generictypeold<String> type=new generictypeold<>();
        type.set("Ann");
        String str=type.get();
    }


}

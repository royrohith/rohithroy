package third;

import java.util.HashMap;
import java.util.Map;

public class MapStudent {

    int age;
    String name;
    String addr;

    public MapStudent(int age, String name, String addr) {
        this.age = age;
        this.name = name;
        this.addr = addr;
    }

    public static void main(String[] args) {

        HashMap<Integer,MapStudent> st=new HashMap<>();

        st.put(16,new MapStudent(10,"A","qwe"));
        st.put(2,new MapStudent(11,"B","asd"));
        st.put(31,new MapStudent(12,"C","zxc"));

        for (Map.Entry obj:st.entrySet())
        {
            MapStudent value= (MapStudent) obj.getValue();

            System.out.println("ID is "+obj.getKey()+" Name is "+value.name+" Address is "+value.addr+" Age is "+value.age);

        }


    }
}

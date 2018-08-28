package third;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

    public static void main(String[] args) {

        TreeMap<Integer,String> tm=new TreeMap<>();

        tm.put(2,"wqe");
        tm.put(456,"tyu");
        tm.put(98,"adf");

        for (Map.Entry obj:tm.entrySet())
        {
            System.out.println(" Key is "+obj.getKey()+" Value is "+obj.getValue());
        }


    }
}

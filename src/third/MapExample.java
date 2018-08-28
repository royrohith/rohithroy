package third;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        HashMap<String,Integer> hmap=new HashMap<>();

        hmap.put("A",22);
        hmap.put("B",55);
        hmap.put("T",33);
        hmap.put("D",32);
        hmap.put("A",27);
        hmap.remove("A");


        for (Map.Entry obj:hmap.entrySet()){

            System.out.println("Key is "+obj.getKey());
            System.out.println("Value "+obj.getValue());

        }



    }



}

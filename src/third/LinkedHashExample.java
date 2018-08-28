package third;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashExample {

    int age;
    String addr;
    String name;

    public LinkedHashExample(int age, String addr, String name) {
        this.age = age;
        this.addr = addr;
        this.name = name;
    }

    public static void main(String[] args) {

        LinkedHashMap<Integer,LinkedHashExample> link=new LinkedHashMap<>();

        link.put(3,new LinkedHashExample(2,"qwe","A"));
        link.put(5, new LinkedHashExample(4,"asd","B"));
        link.put(6, new LinkedHashExample(6,"axc","C"));

        System.out.println(link.containsKey(5));
        System.out.println(link.containsValue("A"));

        for (Map.Entry obj:link.entrySet())
        {
            LinkedHashExample e= (LinkedHashExample) obj.getValue();
            System.out.println();
        }


    }
}

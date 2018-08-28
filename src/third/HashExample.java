package third;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashExample {

    public static void main(String[] args) {

        HashSet<String> set=new HashSet<>();

        set.add("Abc");
        set.add("zsksja");
        set.add("Fsgshjaask");
        set.add("uiwpwmc");



        for (String obj:set)
        {
            System.out.println(obj);
        }

        LinkedHashSet<String> linkedhash=new LinkedHashSet<>();
        linkedhash.add("AB");
        linkedhash.add("BN");
        linkedhash.add("AB");
        linkedhash.add("C");

        for (String obj:linkedhash)
        {
            System.out.println(obj);
        }

        //Treeset

        TreeSet<String> ts=new TreeSet<>();
        ts.add("anu");
        ts.add("zen");
        ts.add("liya");
        ts.add("anu");

        for (String obj:ts)
        {
            System.out.println(obj);
        }

    }

}

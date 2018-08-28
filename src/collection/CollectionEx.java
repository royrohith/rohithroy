package collection;

import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class CollectionEx {

    public static void main(String[] args) {

        ArrayDeque<String> obj=new ArrayDeque<>();

        obj.add("anu");
        obj.add("alan");
        obj.addFirst("AAA");
        obj.add("anju");
        obj.add("ammu");
        obj.addLast("ert");
        obj.add("amy");


        System.out.println(obj);

        System.out.println(" Head "+obj.peek());//returns first element
        System.out.println(" Removed first "+obj.pollFirst());//reomve and return
        //first element and returns null if empty
        System.out.println(" Removed last "+obj.pollLast());//remove and return
        //last element return null if empty
        System.out.println("After removal"+obj);
        System.out.println(obj.remove());//remove first
        System.out.println(obj.removeFirst());//remove and return
        //first element
        System.out.println(obj.removeLast());//remove and return
        //last elemtn
        System.out.println(obj);

    }

}

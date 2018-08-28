package third;

import java.util.LinkedList;

public class Example {

    public static void main(String[] args) {
        LinkedList<String> linked=new LinkedList<>();
        linked.add("A");
        linked.add("B");

        linked.addFirst("C");//add to first position
        linked.addLast("D");//add to end of a queue

        linked.add(null);
        linked.removeLast();
        linked.remove("B");
        linked.remove("B");

        for (String obj:linked)
        {
            System.out.print(obj);
        }

    }
}

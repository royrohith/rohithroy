package FunctionalInterface;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamEx {

    public static void main(String[] args) {

        ArrayList<Integer> al=new ArrayList<>();
        al.add(2);
        al.add(4);
        al.add(3);
        Stream<Integer> s=al.stream();
        s.map(item->item*item).forEach(z->{
            System.out.println(z);
        });
        //x called predicate
       // s.filter(x->x>2).forEach(m->{
       //     System.out.println(m);
        //});

        ArrayList<String> al1=new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        //e predicate
        al1.stream().filter(e->e.contains("t")).forEach(q->{
            System.out.println(q);
        });

    }
}

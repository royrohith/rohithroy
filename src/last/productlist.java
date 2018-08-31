package last;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class productlist {
    int price;
    String name;
    int pid;

    public productlist(int price, String name, int pid) {
        this.price = price;
        this.name = name;
        this.pid = pid;
    }

    public static void main(String[] args) {

        List<productlist> p1=new ArrayList<>();
        p1.add(new productlist(23000,"hp",1));
        p1.add(new productlist(33000,"dell",2));
        p1.add(new productlist(32000,"lenovo",3));
        p1.add(new productlist(43000,"sony",4));
        p1.add(new productlist(53000,"samsung",5));

        List<String> p2=p1.stream().filter(p->p.price>30000)//filtering data
        .map(p->p.name)//fetching price
        .collect(Collectors.toList());//collecting as list

        System.out.println(p2);
        System.out.println("****************************");
        p2.stream().forEach(p-> System.out.println(p));


    }
}

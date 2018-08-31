package last;

import java.util.ArrayList;
import java.util.stream.Stream;

public class product {

    int price;
    String name;
    int pid;

    public product(int price, String name, int pid) {
        this.price = price;
        this.name = name;
        this.pid = pid;
    }


    public static void main(String[] args) {

        ArrayList<product> al=new ArrayList<>();
        al.add(new product(1200,"shirt",112));
        al.add(new product(1600,"jeans",113));
        al.add(new product(800,"tshirt",110));

        Stream<product> s=al.stream();
        s.filter(x->x.price>1000).forEach(z->{
            System.out.println(z.name+" "+z.price+" "+z.pid);
        });




    }
}
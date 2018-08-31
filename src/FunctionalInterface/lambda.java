package FunctionalInterface;

public class lambda {

    public static void main(String[] args) {

        int width=10;
        //with lambda
        Drawable d2=(x)->{
            System.out.println("drawing "+width+"\nname "+x);
        };
        d2.draw("square");
    }
}

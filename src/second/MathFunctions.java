package second;

import java.util.Random;

import static java.lang.Math.*;

public class MathFunctions {

    public static void main(String[] args) {

        System.out.println(atan(-1));
        System.out.println(max(134,89));
        System.out.println(floorMod(12,1));

        Random num=new Random();
        int i=num.nextInt(10);
        System.out.println(i);
    }

}

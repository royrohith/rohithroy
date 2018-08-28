package third;

import java.util.Scanner;

public class FactRecur {

    int f=0;

    public static int fact(int n)
    {

            if (n==0)
            {
                return 1;
            }
            else if (n==1)
            {
                return 1;
            }
            else
            {
                return fact(n-1)*n;
            }



    }

    public static void main(String[] args) {

        System.out.println("ENter number");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        System.out.println(fact(num));
    }

}

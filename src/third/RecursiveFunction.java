package third;

import java.util.Scanner;

public class RecursiveFunction {

    public static int getfib(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        }
        return getfib(n - 1) + getfib(n - 2);
    }


    public static void main(String[] args) {

        System.out.printf("Enter number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(getfib(num));


    }
}
package last;

public class array_split {

    public static void main(String[] args) {

        int a[]={12,45,33,21,56,77,53,89,91,43};
        int b;
        int c[]=new int[10];
        int d[]=new int[10];
        b=(a.length)/2;
        System.out.println("First Half ");
        for(int i=0;i<b;i++){

            c[i]=a[i];
        }
        for(int i=0;i<b;i++){

            System.out.print(c[i]+" ");;
        }

        System.out.println("\nSecond Half ");
        for (int i=b,j=0;i<a.length;i++,j++){

            d[j]=a[i];
        }

        for(int i=0;i<b;i++){

            System.out.print(d[i]+" ");
        }

    }
}

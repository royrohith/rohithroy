package last;

public class max_test {

    public static void main(String[] args) {

        int a[]={10,78,95,67,32,12,7,87};
        int l1=0,l2=0;
        for (int i=0;i<a.length;i++){

            if(a[i]>l1){

                l1=a[i];
            }
        }

        System.out.println("Largest no. is"+l1);
        ;


        for (int i=0;i<a.length;i++) {

            if ((a[i] >l2) && (a[i] < l1)) {

                l2 = a[i];
            }
        }

            System.out.println("Second largest no is"+l2);
        }

    }


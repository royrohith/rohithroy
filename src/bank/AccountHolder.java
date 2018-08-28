package bank;

import java.util.Scanner;

public class AccountHolder extends Bank {

    int account_no,amount;
    String name;

    public void display()
    {
        System.out.println("Ifsc is"+ifsc+" Bank name is "+bname+" Account holder is "+name+" Account number is "+account_no+" Amount is "+amount);
    }

    public void display(AccountHolder array[], int accno)
    {
        for (AccountHolder obj:array) {
            if (accno == obj.account_no)
            {
                System.out.println("Account number is " + account_no + "Account holder is " + obj.name + "Amount is " + obj.amount);
            }
        }

    }

    public static void deposit(AccountHolder array[],int newamnt,int acno)
    {
        for (AccountHolder obj:array)
        {
            if (obj.account_no==acno)
            {
                obj.amount=newamnt+obj.amount;
            }

        }

    }

    public static void retrieve(AccountHolder array[],int rtrvamnt, int acno)
    {
        for (AccountHolder obj:array)
        {
            if ((obj.account_no==acno)&&(obj.amount>=rtrvamnt))
            {
                obj.amount=obj.amount-rtrvamnt;
            }

        }
    }

    public static void balance(AccountHolder array[])
    {
        for (AccountHolder obj:array) {
            System.out.println("Account holder " + obj.name + " Balance " +obj.amount);
        }

    }

    AccountHolder(int ifs,int id,String bname,int acno, String name, int amnt)
    {
        super(ifs,id,bname);
        account_no=acno;
        this.name=name;
        amount=amnt;
    }

    public static void main(String[] args)
    {
        AccountHolder a1=new AccountHolder(1076,1,"sbi",123,"A",1000);
        AccountHolder a2=new AccountHolder(1076,1,"sbi",345,"B",100);
        AccountHolder a3=new AccountHolder(1078,2,"axis",789,"C",230);

        AccountHolder array[]={a1,a2,a3};

        for (AccountHolder obj:array)
        {
            obj.display();
        }

        a1.display(array,123);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ac no");
        int acnouser=sc.nextInt();
        System.out.println("Enter the amnt");
        int amntuser=sc.nextInt();
        System.out.println("ENter acno to rtrve");
        int rtrvuser=sc.nextInt();
        System.out.println("Enter rtrv amnt");
        int ramntuser=sc.nextInt();

        deposit(array,amntuser,acnouser);
        retrieve(array,ramntuser,rtrvuser);
        balance(array);




    }
}

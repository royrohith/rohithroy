package bank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AccountHolderArray extends BankArray{

    int acno,amnt;
    String name;

    public AccountHolderArray(int ifsc, int bid, String bname, int acno, int amnt, String name) {
        super(ifsc, bid, bname);
        this.acno = acno;
        this.amnt = amnt;
        this.name = name;
    }

    public void display()
    {
        System.out.println("Ifsc is"+ifsc+" Bank name is "+bname+" Account holder is "+name+" Account number is "+acno+" Amount is "+amnt);
    }

    public void display(AccountHolderArray ob, int acno)
    {
        if (ob.acno==acno)
        System.out.println("Ifsc is"+ifsc+" Bank name is "+bname+" Account holder is "+name+" Account number is "+acno+" Amount is "+amnt);

    }

    public static void deposit(AccountHolderArray ob,int newamnt,int acno)
    {
        if (ob.acno==acno)
        {

            ob.amnt=newamnt+ob.amnt;
        }
    }

    public static void retrive(AccountHolderArray ob,int rtrvamnt,int acno)
    {
        if ((ob.acno==acno)&&(ob.amnt>=rtrvamnt))
        {

            ob.amnt=ob.amnt-rtrvamnt;
        }
    }

    public static void display1(ArrayList<AccountHolderArray> a)
    {
        for (AccountHolderArray obj:a)
        {
            System.out.println("IFSC is"+obj.ifsc+"Account number is "+obj.acno+"Amount is "+obj.amnt+"Name is"+obj.name);
        }
    }







    public static void main(String[] args) {

        AccountHolderArray a1=new AccountHolderArray(1076,1,"sbi",123,1000,"A");
        AccountHolderArray a2=new AccountHolderArray(1076,1,"sbi",345,500,"B");
        AccountHolderArray a3=new AccountHolderArray(1078,2,"axis",789,400,"C");

        ArrayList<AccountHolderArray> ah=new ArrayList<>();
        ah.add(a1);
        ah.add(a2);
        ah.add(a3);

        for (AccountHolderArray obj:ah)
        {
            obj.display();
        }

        Iterator itr=ah.iterator();
        while (itr.hasNext())
        {
            AccountHolderArray o=(AccountHolderArray) itr.next();
            o.display(o,123);
        }

        Scanner sc=new Scanner(System.in);
        //deposit
        System.out.println("Enter the ac no");
        int acnouser=sc.nextInt();
        System.out.println("Enter the amnt");
        int amntuser=sc.nextInt();

        for (AccountHolderArray obj:ah)
        {
            obj.deposit(obj,amntuser,acnouser);
        }

        //display
        for (AccountHolderArray obj:ah)
        {
            obj.display(obj,acnouser);
        }

        //rtrv
        System.out.println("Enter the account number to rtrv");
        int acnouserr=sc.nextInt();
        System.out.println("Enter the amount");
        int rtrvamnt=sc.nextInt();
        for (AccountHolderArray obj:ah)
        {
            obj.retrive(obj,rtrvamnt,acnouserr);
        }
        //display
        for (AccountHolderArray obj:ah)
        {
            obj.display(obj,acnouserr);
        }

        //remove
        System.out.println("Enter account number to close");
        int acnoclose=sc.nextInt();
        for (AccountHolderArray obj:ah)
        {
            if (obj.acno==acnoclose)
            {
                ah.remove(obj);
                break;
            }
        }

        //display
        display1(ah);







    }



}

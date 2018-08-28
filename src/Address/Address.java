package Address;

import sun.reflect.generics.tree.Tree;
import third.TreeMapEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Address {

    String hname;
    String psname;
    int hid;

    public Address(String hname, String psname, int hid) {
        this.hname = hname;
        this.psname = psname;
        this.hid = hid;
    }

    //delete
    public static void delete(TreeMap<Integer, Address> hmap, Integer no)
    {
        for (Map.Entry obj:hmap.entrySet())
        {
            if (obj.getKey()==no)
            {
                hmap.remove(obj.getKey());
                break;
            }


        }

    }
    //update
    public static void update(TreeMap<Integer, Address> hmap,Integer no)
    {
        for (Map.Entry obj:hmap.entrySet())
        {
            if (obj.getKey()==no)
            {
                hmap.put(no, new Address("E","a4",12502));
            }
        }
    }
    //search
    public static void search(TreeMap<Integer,Address> hmap, Integer h)
    {
        for (Map.Entry obj:hmap.entrySet())
        {
            if (obj.getKey()==h)
            {
                System.out.println("Search Result");
                Address a= (Address) obj.getValue();
                System.out.println("House name is"+a.hname+" Person Name is "+a.psname+" House id is "+a.hid);
            }
        }
    }



    public static void main(String[] args) {

        TreeMap<Integer,Address> hmap=new TreeMap<>();

        hmap.put(123,new Address("A","a1",12301));
        hmap.put(124, new Address("B", "a2",12401));
        hmap.put(125, new Address("C","a3",12501));


        Scanner sc=new Scanner(System.in);

        //Delete
        System.out.println("Enter house number to delete");
        int n=sc.nextInt();
        delete(hmap,n);
        System.out.println("House number "+n+" Deleted");

        //display
        System.out.println("Display");
        for (Map.Entry obj:hmap.entrySet())
        {
            Address a= (Address) obj.getValue();
            System.out.println(" House  id "+a.hid+" House name "+a.hname+" Person name "+a.psname);
        }

        //update
        update(hmap,124);

        //display
        System.out.println("Display ");
        for (Map.Entry obj:hmap.entrySet())
        {
            Address a= (Address) obj.getValue();
            System.out.println(" House  id "+a.hid+" House name "+a.hname+" Person name "+a.psname);
        }

        //search
        System.out.println("Enter house number to search");
        int hnum=sc.nextInt();
        search(hmap,hnum);




    }



}

package parking;

import java.util.ArrayList;

public class Parking1 {
    int type;
    String slotname;
    int time;

    public Parking1(int type, String slotname, int time) {
        this.type = type;
        this.slotname = slotname;
        this.time = time;
    }

    public static void addVehicle(ArrayList<Parking1> p, Parking1 obj)
    {
        if (p.size()<3)
        {
            p.add(obj);
        }
        else
        {
            System.out.println("Parking slot is full");
        }

    }

    public static void removeVehicle(ArrayList<Parking1> p, String slotnum)
    {
      for (Parking1 obj:p)
        {
            if (obj.slotname==slotnum)
            {
                p.remove(obj);
                if (obj.type==2)
                {
                int amount=obj.time*50;
                System.out.println("Parking Fee of 2 whlr is "+amount);
                break;
                }
                else
                {
                    int amount=obj.time*150;
                    System.out.println("Parking Fee of 4 whlr is "+amount);
                    break;
                }
            }
            else
            {
                //System.out.println("Enter correct parking slot");
            }
        }
    }

    public static void main(String[] args) {

        Parking1 v1=new Parking1(2,"101",1);
        Parking1 v2=new Parking1(2,"102",3);
        Parking1 v3=new Parking1(2,"103",5);

        ArrayList<Parking1> slot2=new ArrayList<>();

        Parking1 v4=new Parking1(4,"104",2);
        Parking1 v5=new Parking1(4,"105",4);
        Parking1 v6=new Parking1(4,"106",6);

        ArrayList<Parking1> slot4=new ArrayList<>();

        Parking1 x=new Parking1(2,"101",5);
        Parking1 y=new Parking1(4,"104",6);

        addVehicle(slot2,v1);
        addVehicle(slot2,v2);
        addVehicle(slot2,v3);
        addVehicle(slot2,x);

        removeVehicle(slot2,"101");

        addVehicle(slot2,x);

        addVehicle(slot4,v4);
        addVehicle(slot4,v5);
        addVehicle(slot4,v6);
        addVehicle(slot4,y);

        removeVehicle(slot4,"106");





    }


}
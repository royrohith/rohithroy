package test;

public class TypeCaste {

    public static void main(String[] args) {

        byte b=10;
        int x=b;//upcasting or implicit type casting
        System.out.println(x);

        int z=10;
        float f=z;
        float f1=10.9f;
        int y=(int)f1;//explicit type casting
        System.out.println(f);
        System.out.println(y);

        int p=101;
        byte q=(byte)p;
        System.out.println(q);

        boolean b1=true;

        Integer i=Integer.valueOf(x);//Integer to object or autoboxing
        Boolean obj=Boolean.valueOf(b1);
        Boolean b2=new Boolean(obj);//unboxing
        System.out.println(i);
        System.out.println(obj);

        String s="123";

        Integer intv=Integer.parseInt(s);
        //String s="abc";
        //Integer ints=Integer.parseInt(s);//number formait excption

        String d="true";
        System.out.println(Boolean.parseBoolean(d));



    }

}

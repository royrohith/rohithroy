package generic;

public class Student {
    public <T extends Number> void print(T mark1,T mark2){

        double result=mark1.doubleValue()+mark2.doubleValue();
        System.out.println("sum="+result);
    }

    public static void main(String[] args) {
        Student m=new Student();
        m.print(10,20);
        m.print(10.0f,30.0f);
        m.print(30.00d,40.09d);

    }
}

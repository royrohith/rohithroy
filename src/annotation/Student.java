package annotation;

import java.lang.reflect.Method;

public class Student {

    @myannotation(name = "aswanth", location = "thrissur")
    public void getInfo() {

    }

    @myannotation(name = "jishnu", location = "pappady")
    public void getdata() {

    }

    public static void main(String[] args) {
        try {
            Method m = Student.class.getMethod("getInfo");
            Method s = Student.class.getMethod("getdata");
            myannotation an = (myannotation) m.getAnnotation(myannotation.class);
            myannotation as = (myannotation) s.getAnnotation(myannotation.class);
            if (an != null) {
                System.out.println("name :" + an.name());
                System.out.println("location :" + an.location());
                System.out.println("........................");
            }
            System.out.println(as.name());
            System.out.println(as.location());
        } catch (NoSuchMethodException e) {
            System.out.println("no such method exception");

        }


    }
}

package last;

import first.Student;

import java.lang.reflect.Field;

public class Java_Reflections {
    public static void main(String[] args) {

        Class m= Student.class;
        Field[] fields=m.getDeclaredFields();
        for (Field f:fields){

            System.out.println(f.getName());
        }
    }
}

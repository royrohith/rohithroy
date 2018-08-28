package third;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Student implements Comparable<Student> {

    int rollno;
    String name;
    int age;

    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        TreeSet<Student> obj = new TreeSet<>();

        obj.add(new Student(11, "athira11", 23));
        obj.add(new Student(7, "zen7", 22));
        obj.add(new Student(4, "ali4", 33));

       for (Student o:obj)
        {
            System.out.println(o.name);
        }


        /*HashSet<String> hash=new HashSet<>();
        hash.add("kjhfsdkjh11111");
        hash.add("cx,nmvhdkj2");
        hash.add("eewodsmds33");
        LinkedHashSet<String> linkedhash=new LinkedHashSet<>();
        linkedhash.add("kjhfsdkjh11111");
        linkedhash.add("cx,nmvhdkj2");
        linkedhash.add("eewodsmds33");

        for (String o:linkedhash)
        {
            System.out.println(o);
        }*/



    }

    @Override
    public int compareTo(@NotNull Student o) {
        if (rollno > o.rollno) {
            System.out.println("greater"+rollno);
            return 1;
        } else if (rollno < o.rollno) {
            System.out.println("less"+rollno);
            return -1;
        } else {
            return 0;
        }
    }

    }
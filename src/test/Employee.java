package test;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee {

    String empname;
    float salary;
    String dept;

    public Employee(String empname, float salary, String dept) {
        this.empname = empname;
        this.salary = salary;
        this.dept = dept;
    }

    public static void main(String[] args) {


        ArrayList<Employee> ae = new ArrayList<>();

        Employee e1 = new Employee("A", 5689.09f, "CSE");
        Employee e2 = new Employee("B", 84746.0f, "ME");
        Employee e3 = new Employee("C",5678.78f,"CSE");

        ae.add(e1);
        ae.add(e2);
        ae.add(e3);

        for (Employee obj:ae)
        {
            System.out.println(obj.dept+obj.empname+obj.salary);
        }

        Iterator itr=ae.iterator();

        while (itr.hasNext())
        {
            Employee obj= (Employee) itr.next();
            System.out.println(obj.empname+obj.salary+obj.dept);
        }
    }

}

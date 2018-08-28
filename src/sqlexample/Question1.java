package sqlexample;

import java.sql.*;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");

        Statement statement=connection.createStatement();
        //salary
        CallableStatement cs=connection.prepareCall(""+"{call company.avgsalary(?)}");
        cs.registerOutParameter(1,Types.FLOAT);
        cs.execute();
        int j=cs.getInt(1);
        System.out.println("Average salary is ");
        System.out.println(j);

        //Product Details
        ResultSet rs=statement.executeQuery("SELECT * from company.Product ORDER BY name ASC");
        System.out.println("Product details are");
        while (rs.next())
            {
             System.out.println("ID is "+rs.getInt("productid")+" name is "+rs.getString("name")+" price is "+rs.getInt("price")+" Quantity is "+rs.getInt("quantity"));
            }

        //Employee Details
        ResultSet rs1=statement.executeQuery("SELECT * from company.Employee where salary>15000 and gender='male';");
        System.out.println("Employee details are");
        while (rs1.next())
        {
            System.out.println("ID is "+rs1.getInt("id")+" name is "+rs1.getString("name")+" Gender  "+rs1.getString("gender")+" Salary is "+rs1.getInt("salary"));
        }

        //Maximum Salary
        CallableStatement cs1=connection.prepareCall(""+"{call company.maxsalary(?)}");
        cs1.registerOutParameter(1,Types.FLOAT);
        cs1.execute();
        int y=cs1.getInt(1);
        System.out.println("Maximum salary is ");
        System.out.println(y);

        //update
        CallableStatement cs2=connection.prepareCall(""+"{call company.updateproduct(?,?)}");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Product id to update");
        int i=sc.nextInt();

        System.out.println("Enter New name of Product");
        Scanner sc1=new Scanner(System.in);
        String s=sc1.nextLine();
        cs2.setInt(1,i);
        cs2.setString(2,s);
        cs2.execute();

        ResultSet rs2=statement.executeQuery("SELECT * from company.Product");
        System.out.println("Product details are");
        while (rs2.next())
        {
            System.out.println("ID is "+rs2.getInt("productid")+" name is "+rs2.getString("name")+" price is "+rs2.getInt("price")+" Quantity is "+rs2.getInt("quantity"));
        }











        connection.close();



    }


}

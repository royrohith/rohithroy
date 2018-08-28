package sqlexample;

import java.sql.*;

public class DBConnection {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");

        Statement statement=connection.createStatement();

        //statement.executeUpdate("update student set id=?, name='updated' where id=?");
        //statement.executeUpdate("delete from student where id=2");

        //PreparedStatement ps=connection.prepareStatement("insert into student values(?,?)");
        //ps.setInt(1,2);
        //ps.setString(2,"prep");

        PreparedStatement ps=connection.prepareStatement("select * from student where id=?");
        ps.setInt(1,5);

        ResultSet rs=ps.executeQuery();
        if (rs.next())
        {
          //  System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }


        //ResultSet rs=statement.executeQuery("select * from student");

        //while (rs.next())
        //{
          //  System.out.println(rs.getInt("id")+" "+rs.getString("name"));
        //}

        CallableStatement cs=connection.prepareCall(""+"{call test.getEmployee1(?, ?,?)}");
        cs.setInt(1,1234);
        cs.setString(2,"A");
        int j=0;
        cs.registerOutParameter(3,Types.INTEGER);
        cs.execute();


        //ResultSet rs1=cs.getResultSet();
        //while (rs1.next())
        //{
          //  System.out.println("Name is "+rs1.getString("Employeename")+" "+"salary is "+rs1.getInt("salary")+" "+j);
        //}

        j=cs.getInt(3);
        System.out.println(j);





        connection.close();

    }

}

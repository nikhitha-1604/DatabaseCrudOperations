
import java.sql.*;



public class DatabaseCrudOperations {

    public static void main(String []args) throws SQLException {

   try {

     

       DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

          

        

          Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/24WH1A0568","root","1234");

        

    

       

  

        Statement statement=connection.createStatement();

        ResultSet rs=statement.executeQuery("select * from employee");

        

        while(rs.next()) {

           // System.out.println(rs.getString("emp_name"));

           System.out.println(

                  rs.getInt("emp_id") + " | " +

                  rs.getString("emp_name") + " | " +

                  rs.getString("salary")

              );

        }

     }catch(SQLException e) {

       e.printStackTrace();

     }

        

    }

}

import java.sql.*;

    public class DeleteEmp {

        public static void main(String []args) throws SQLException {

       try {

           DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

              Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/24WH1A0568","root","1234");

          
            Statement statement=connection.createStatement();

            int nor = statement.executeUpdate("DELETE FROM employee WHERE emp_id = 3");

            System.out.println("Rows deleted: " + nor);

            ResultSet rs=statement.executeQuery("select * from employee");

            while(rs.next()) {

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










     

 




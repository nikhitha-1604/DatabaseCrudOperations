

import java.sql.*;

public class UpdateEmp {
    public static void main(String[] args) {
        try {

            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/24WH1A0568",
                "root",
                "1234"
            );

            Statement st = con.createStatement();

            int rows = st.executeUpdate(
                "UPDATE employee SET salary = 65000 WHERE id = 2"
            );

            System.out.println("Rows updated: " + rows);

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

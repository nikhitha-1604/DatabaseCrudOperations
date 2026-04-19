

import java.sql.*;

public class InsertEmp {
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
                "INSERT INTO employee VALUES (5, 'Anil', 55000, 'TCS')"
            );

            System.out.println("Rows inserted: " + rows);

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

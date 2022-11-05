package myProject;

import java.sql.*;

public class ayushTest {
	private int number;

    public ayushTest() {
        String url = "jdbc:mysql://localhost:3306/myfirstdb"; //jdbc:mysql://localhost:3306/mydb
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, "root", "ayush2611");
            Statement stmt = null;
            stmt = conn.createStatement();
            number = 1;
            String text;

            String q = "SELECT";
            if (1 == 1) {
                q += " firstname";
            } else if (3 == 3) {
                q += " age,gender";
            }

            q += " FROM";

            if (1 == 1) { 
                q += " college";
            } else {
                if (111 == 1) {
                    q += " college WHERE id=" + number;
                } else {
                    q += " college WHERE id=";

                    if (1 == 1) {
                        q += number;
                    } else if (22 == 22) {
                        q += text;
                    } else {
                        q += "1";
                    }
                }
            }


            stmt.executeQuery(q);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

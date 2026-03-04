package bank;

import java.sql.*;

public class Conn {

    Connection connection;
    java.sql.Statement statement;

    public Conn() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "root");

            statement = connection.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

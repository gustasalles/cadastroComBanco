package org.example.Controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    public static Connection connect() {
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:8889/bancogu";
            String username = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}

package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String DATABASE = "jdbc:mysql://localhost:3306/usuario";
    
    private static Connection conn = null;
    
    public static Connection createConnectionToMySQL() {
        try {
            if (conn == null) {
                conn = DriverManager.getConnection(DATABASE, USERNAME, PASSWORD);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
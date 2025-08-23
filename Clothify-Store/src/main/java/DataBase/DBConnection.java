package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
  private static DBConnection instance;
  private Connection connection;

  private DBConnection(){
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
      } catch (ClassNotFoundException e) {
          throw new RuntimeException(e);
      }
      try {
          connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clothifyStore", "root", "1234");
      } catch (SQLException e) {
          throw new RuntimeException(e);
      }

  }

    public Connection getConnection() {
        return connection;
    }

    public static DBConnection getInstance() {
        if(instance==null) {
            return instance=new DBConnection();
        }
        return instance;
    }
}

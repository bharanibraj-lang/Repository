package src;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySqlDBConnection {

    public static Connection getConnection() throws SQLException,IOException, ClassNotFoundException
    {
        Properties prop=new Properties();

        FileInputStream fis=new FileInputStream("db.properties");
        prop.load(fis);
        Class.forName(prop.getProperty("DRIVER_CLASS"));
        Connection con=DriverManager.getConnection(prop.getProperty("DB_URL"), 
                                                    prop.getProperty("DB_USERNAME"),
                                                    prop.getProperty("DB_PASSWORD"));

        return con;
        
    }


}
// Customer
//CustomerMain
//MySqlDbConnection
// static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
//     static final String db_url="jdbc:mysql://localhost:3306/lululemon";
//     static final String username="root";
//     static final String password="root";

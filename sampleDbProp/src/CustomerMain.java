package src;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerMain {
public static void main(String[] args) throws ClassNotFoundException, IOException {
   

    try{
String query="select *from customer";
Connection con=MySqlDBConnection.getConnection();
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(query);
while (rs.next()) {
    System.out.println("Customer Details are ");
    System.out.println("CustomerId"+rs.getInt(1));
    System.out.println("Customer Name"+rs.getString(2));
    System.out.println("customer address"+rs.getString(3));
    
}

    }catch(SQLException e)
    {
        System.out.println(e.getMessage() );

    }

}

}

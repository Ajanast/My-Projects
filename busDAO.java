package busres;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class busDAO {
    public void displayBusInfo() throws SQLException {
        String query ="select * from bus";
        Connection con= dbconnection.getconnection();
        Statement st=con.createStatement();
        ResultSet rs= st.executeQuery(query);
        while (rs.next()){
            System.out.println("Bus No : "+rs.getInt(1));
            System.out.println("AC : "+rs.getBoolean(2));
            System.out.println("Capacity : "+ rs.getInt(3));
        }
    }
    public int getcapacity(int id) throws SQLException {
        String query="select capacity from bus where bus_no="+id;
        Connection con =  dbconnection.getconnection();
        Statement st=con.createStatement();
        ResultSet rs= st.executeQuery(query);
        rs.next();
        return rs.getInt(1);
    }
}

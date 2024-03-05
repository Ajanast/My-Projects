package busres;

import java.sql.*;
import java.util.Date;

public class bookingDAO {
public int getbookedcount(int busno,Date date) throws SQLException{
    String query="select count(pas_name) from booking where bus_no=? and travel_date=?";
    Connection con= dbconnection.getconnection();
    PreparedStatement pst=con.prepareStatement(query);
    pst.setInt(1,busno);
    java.sql.Date sqldate=new java.sql.Date(date.getTime());
    pst.setDate(2,sqldate);
    ResultSet rs=pst.executeQuery();
    rs.next();
    return rs.getInt(1);
}
public void setbooked(Booking booking)throws  SQLException{
    String query="Insert into booking values(?,?,?)";
    Connection con= dbconnection.getconnection();
    java.sql.Date sqldate=new java.sql.Date(booking.date.getTime());
    PreparedStatement pst=con.prepareStatement(query);

    pst.setString(1,booking.Name);
    pst.setInt(2,booking.busNo);
    pst.setDate(3,sqldate);
    pst.executeUpdate();
}
}

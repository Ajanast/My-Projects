package busres;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class Booking{
    String Name;
    int busNo;
    Date date;
    Scanner scanner=new Scanner(System.in);
    Booking(){
        System.out.println("Enter your name :");
        Name=scanner.next();
        System.out.println("Enter your bus no :");
        busNo=scanner.nextInt();
        System.out.println("Enter date in the form of dd-mm-yyyy");
        String dateInput=scanner.next();
        SimpleDateFormat dateformat=new SimpleDateFormat("dd-mm-yyyy");
        try{
            date=dateformat.parse(dateInput);
        }catch (ParseException e){
         e.printStackTrace();
        }

    }

    public boolean isAvailable()throws SQLException {
      int  capacity=0;
      busDAO busdao=new busDAO();
      bookingDAO bookingdao=new bookingDAO();
      capacity=busdao.getcapacity(busNo);

      int booked=0;
        booked=bookingdao.getbookedcount(busNo, date);

     return booked<capacity;
    }

}
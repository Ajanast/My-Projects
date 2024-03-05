package busres;
import java.util.*;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args)  {

     try {
         busDAO busdao = new busDAO();
         busdao.displayBusInfo();

         int choice = 1;
         Scanner scanner = new Scanner(System.in);
         while (choice == 1) {
             System.out.println("Enter booking to 1 reject 2");
             choice = scanner.nextInt();
             if (choice == 1) {
                 Booking booking = new Booking();
                 if (booking.isAvailable()) {
                     bookingDAO bookingdao = new bookingDAO();
                     bookingdao.setbooked(booking);
                     System.out.println("Your booking is conform");
                 } else
                     System.out.println("The Bus is full try another bus or date ");
             } else {
                 System.out.println("Thanks for coming :");
             }
         }


     }
     catch (Exception e){
         e.printStackTrace();
     }
    }
}
import com.engeto.homework.hotel.Booking;
import com.engeto.homework.hotel.Guest;
import com.engeto.homework.hotel.Room;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Guest guest1 = new Guest("Adéla", "Malíková",
                LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Jan", "Dvořáček",
                LocalDate.of(1995, 5, 5));

        guest2.setBirthDate(LocalDate.of(1995, 4, 5));

        System.out.println(guest2.getDescription());


        Room room1 = new Room(1, 1, true,
                true, new BigDecimal(1000));
        Room room2 = new Room(2, 1, true,
                true, new BigDecimal(1000));
        Room room3 = new Room(3, 3, false,
                true, new BigDecimal(2400));


        Booking booking1 = new Booking(guest1, room1, LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 26), false);
        Booking booking2 = new Booking(guest1, room3, LocalDate.of(2021, 9, 1),
                LocalDate.of(2021, 9, 14), false);
        booking2.addOtherGuest(guest2);

        
        List<Booking> bookingList = new ArrayList<>();
        bookingList.add(booking1);
        bookingList.add(booking2);

        System.out.println("Výpis všech rezervací v systému");
        for (Booking booking: bookingList) {
            System.out.println(booking.getBookingDescription());
        }

    }
}


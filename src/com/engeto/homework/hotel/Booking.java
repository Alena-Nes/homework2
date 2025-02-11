package com.engeto.homework.hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private Guest guest;
    private Room room;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private List<Guest> otherGuest = new ArrayList<>();
    private boolean isWorkingStay;

    public Booking(Guest guest, Room room, LocalDate checkIn, LocalDate checkOut, boolean isWorkingStay) {
        this.guest = guest;
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.isWorkingStay = isWorkingStay;

    }
    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public List<Guest> getOtherGuest() {
        return otherGuest;
    }

    public void setOtherGuest(List<Guest> otherGuest) {
        this.otherGuest = otherGuest;
    }

    public boolean isWorkingStay() {
        return isWorkingStay;
    }

    public void setWorkingStay(boolean workingStay) {
        isWorkingStay = workingStay;
    }


    public void addOtherGuest(Guest guest2) {
        this.guest = guest2;

    }


    public String getBookingDescription() {
            StringBuilder result = new StringBuilder("Rezervace pro: " + guest.getDescription() + " na: " + room.getRoomNumber()
                    + " termín: " + checkIn + " - " + checkOut
                    + " pracovní pobyt: " + (isWorkingStay ? "ano" : "ne"));
        if (! otherGuest.isEmpty()) {
                result.append(", další hosté: \n");
                for (Guest guest : otherGuest) {
                    result.append(guest.getDescription()).append("\n");
                }
            }
            return result.toString();
    }
}

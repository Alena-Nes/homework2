import java.math.BigDecimal;

public class Room {
    private int roomNumber;
    private int capacity;
    private boolean hasBalcony;
    private boolean hasSeaView;
    private BigDecimal pricePerNight;

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public boolean isHasSeaView() {
        return hasSeaView;
    }

    public void setHasSeaView(boolean hasSeaView) {
        this.hasSeaView = hasSeaView;
    }

    public BigDecimal getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(BigDecimal pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public Room(int roomNumber, int capacity, boolean hasBalcony,
                boolean hasSeaView, BigDecimal pricePerNight){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this. hasBalcony= hasBalcony;
        this.hasSeaView = hasSeaView;
        this.pricePerNight= pricePerNight;




    }

}

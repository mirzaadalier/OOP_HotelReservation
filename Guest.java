public class Guest {
    private String guestName;
    private int roomNumber;

    public Guest(String guestName, int roomNumber) {
        this.guestName = guestName;
        this.roomNumber = roomNumber;
    }


    public void displayGuestInfo() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Number: " + roomNumber);
    }


    public String getGuestName() {
        return guestName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}

package Lectures.L_8;

public class Hotel extends Housing{
    String name;
    int singleRoom;
    int doubleRoom;

    public int getCapacity() {
        return singleRoom + doubleRoom * 2;
    }

    public String getPrintable() {
        return id + ". " + "Hotel " + name + " with capacity of " + getCapacity();
    }
}

package Lectures.L_8;

public class Hotel_Info {
    public static void main(String[] args) {
        Hotel tourist = new Hotel();
        tourist.id = 1;
        tourist.name = "Tourist";
        tourist.singleRoom = 10;
        tourist.doubleRoom = 30;

//        System.out.println(tourist.name + ": " + tourist.getCapacity());

        Hotel hilton = new Hotel();
        hilton.id = 2;
        hilton.name = "Hilton";
        hilton.singleRoom = 100;
        hilton.doubleRoom = 200;

//        System.out.println(hilton.name + ": " + hilton.getCapacity());

        House jakcs = new House();
        jakcs.id = 15;
        jakcs.ownersName = "Jack";
        jakcs.bedrooms = 10;

//        Hotel[] allHotels = new Hotel[] {tourist, hilton};
//        accomadations.hotels = allHotels;
        Accomadations accomadations = new Accomadations();
        // or 19 and 21 same = 23
        accomadations.housings = new Housing[] {tourist, hilton, jakcs};

//        System.out.println(accomadations.totalCapacity());


        accomadations.printAll();

        System.out.println(accomadations.findForGroup(100).getPrintable());
        System.out.println(accomadations.findForGroup(50).getPrintable());

        Housing hotel = accomadations.findForGroup(500);
        if (hotel != null) {
            System.out.println(hotel.getPrintable());
        } else {
            System.out.println("Nothing found");
        }
    }
}

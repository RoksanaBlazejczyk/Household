import nlc.cMcCaig.member.*;
import nlc.rsneddon.outside.*;
import nlc.rblazejczyk.room.*;



import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Main myApp = new Main();
        myApp.runProject();
        //Occupants
        Adult a1 = new Adult("Bob", "Harris", "23/09/2002", 'M', 123, "Super busy", 123000);
        Child c1 = new Child("Alice", "Harris", "15/05/2015", 'F', 456, "Greenwood Primary", "Grade 4");
        ArrayList<Member> totalHousehold = new ArrayList<>();
        totalHousehold.add(a1); // at least one Adult
        totalHousehold.add(c1);

        //Household
        Household hh = new Household("32 Pheonix Drive", "GH7 PP", "Glasgow",
                "Mansion", "South Lanarkshire", 1920, 800.99, totalHousehold);

        //Room items
        ArrayList<String> masterBedroomItems = new ArrayList<>(Arrays.asList("King Bed", "Wardrobe", "Nightstand"));
        ArrayList<String> bedroomItems = new ArrayList<>(Arrays.asList("Queen Bed", "Desk", "Chair"));

        //Add rooms dynamically with validation
        hh.addRoom(new MasterBedroom("Master Bedroom", 22.5, 2, masterBedroomItems, true, true));
        hh.addRoom(new Bedroom("Guest Bedroom", 18.0, 2, bedroomItems, 1, true));

        hh.addRoom(new Bedroom("Bad Bedroom", 10, 1, bedroomItems, 1, false)); //throw exception

        //Display results
        hh.displayRooms();
        hh.validateRooms();
    }




    public void runProject() {
        //Create Members (Adult + Child)
        Adult a1 = new Adult("boib", "wwww", "23/09/2002", 'M', 123, "Super busy", 123000);
        Child c1 = new Child("Alice", "Harris", "15/05/2015", 'F', 456, "Greenwood Primary", "Grade 4");

        ArrayList<Member> totalHousehold = new ArrayList<>();
        totalHousehold.add(a1); //at least one Adult required
        totalHousehold.add(c1);

        //Predefined Room Items
        ArrayList<String> masterBedroomItems = new ArrayList<>(Arrays.asList("King Bed", "Wardrobe", "Nightstand"));
        ArrayList<String> bedroomItems = new ArrayList<>(Arrays.asList("Queen Bed", "Desk", "Chair"));
        ArrayList<String> kitchenItems = new ArrayList<>(Arrays.asList("Fridge", "Oven", "Dishwasher"));
        ArrayList<String> bathroomItems = new ArrayList<>(Arrays.asList("Sink", "Toilet", "Mirror"));
        ArrayList<String> extraSpaceItems = new ArrayList<>(Arrays.asList("Storage Box", "Bookshelf"));

        //Create Household (validation will check for at least one Adult)
        Household household = new Household(
                "32 Pheonix Drive", "GH7 PP", "Glasgow",
                "Mansion", "South Lanarkshire",
                1920, 800.99, totalHousehold
        );

        //Create Rooms
        MasterBedroom masterBedroom = new MasterBedroom("Master Bedroom", 22.5, 2, masterBedroomItems, true, true);
        Bedroom bedroom = new Bedroom("Guest Bedroom", 18.0, 2, bedroomItems, 1, true);
        Kitchen kitchen = new Kitchen("Kitchen", 15.0, 1, kitchenItems, true);
        Bathroom bathroom = new Bathroom("Bathroom", 10.0, 1, bathroomItems, true, true);
        ExtraSpace extraSpace = new ExtraSpace("Attic", 12.0, 3, extraSpaceItems, true, false);
        BackGarden backgarden = new BackGarden(52.25, "grass", true, true, false, false);
        Driveway driveway = new Driveway(32.15, "concrete", false, 3, "slabs", false);
        FrontGarden frontgarden = new FrontGarden(20, "Grass", true, new ArrayList<>(java.util.Arrays.asList("10x Rose", "6x Tulip", "3x Daisy")), true, false);

        //Display Household
        System.out.println(household);
        System.out.println();

        System.out.println(backgarden.getOutsideDetails());
        System.out.println();
        System.out.println(driveway.getOutsideDetails());
        System.out.println();
        System.out.println(frontgarden.getOutsideDetails());

        //Display All Rooms
        displayRoomInfo(masterBedroom);
        System.out.println();
        displayRoomInfo(bedroom);
        System.out.println();
        displayRoomInfo(kitchen);
        System.out.println();
        displayRoomInfo(bathroom);
        System.out.println();
        displayRoomInfo(extraSpace);
    }

    /**
     *
     * @param room
     */
    public static void displayRoomInfo(Room room) {
        System.out.println("Room Name: " + room.getRoomName());
        System.out.println("Area (sq m): " + room.getAreaSqM());
        System.out.println("Floor: " + room.getFloor());
        System.out.println("Items: " + String.join(", ", room.getItems()));

        //Display additional properties based on room type
        if (room instanceof MasterBedroom mb) {
            System.out.println("Has Ensuite: " + mb.isHasEnsuite());
            System.out.println("Walk-in Closet: " + mb.isWalkInCloset());
        } else if (room instanceof Bedroom b) {
            System.out.println("Bed Count: " + b.getBedCount());
            System.out.println("Has Balcony: " + b.isHasBalcony());
        } else if (room instanceof Kitchen k) {
            System.out.println("Has Island: " + k.isHasIsland());
        } else if (room instanceof Bathroom ba) {
            System.out.println("Has Bathtub: " + ba.isHasBathtub());
            System.out.println("Has Shower: " + ba.isHasShower());
        } else if (room instanceof ExtraSpace es) {
            System.out.println("Has Loft: " + es.isHasLoft());
            System.out.println("Has Basement: " + es.isHasBasement());
        }
    }
}
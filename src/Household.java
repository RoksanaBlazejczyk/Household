import nlc.rblazejczyk.room.*;
import nlc.cMcCaig.member.Member;
import nlc.cMcCaig.member.Adult;

import java.util.ArrayList;
import java.util.List;


public class Household {
    private String address;
    private String postcode;
    private String city;
    private String typeOfHouse;
    private String county;
    private int yearBuilt;
    private double totalArea;
    private List<Member> occupants;
    private List<Room> rooms;

    public Household(String address,
                     String postcode,
                     String city,
                     String typeOfHouse,
                     String county,
                     int yearBuilt,
                     double totalArea,
                     List<Member> occupants) {

        //Validate at least one Adult
        boolean hasAdult = false;
        for (Member m : occupants) {
            if (m instanceof Adult) {
                hasAdult = true;
                break;
            }
        }
        if (!hasAdult) {
            throw new IllegalArgumentException("Household must have at least one Adult occupant.");
        }

        this.address = address;
        this.postcode = postcode;
        this.city = city;
        this.typeOfHouse = typeOfHouse;
        this.county = county;
        this.yearBuilt = yearBuilt;
        this.totalArea = totalArea;
        this.occupants = occupants;

        this.rooms = new ArrayList<>(); // initialise rooms list
    }

    //Add a Room to the household
    public void addRoom(Room room) {

        if (room instanceof Bedroom b) {
            if (b.getBedCount() <= 0) {
                throw new IllegalArgumentException("Bedroom must have at least one bed.");
            }
            if (b.getAreaSqM() <= 0) {
                throw new IllegalArgumentException("Bedroom area must be > 0.");
            }
        }
        rooms.add(room);
    }
    public void validateRooms() {
        boolean hasMasterBedroom = false;

        for (Room room : rooms) {
            if (room instanceof MasterBedroom) {
                hasMasterBedroom = true;
                break;
            }
        }

        if (!hasMasterBedroom) {
            throw new IllegalStateException("Household must have at least one Master Bedroom MATE!. No house available.");
        }
    }


    //Show all rooms
    public void displayRooms() {
        for (Room room : rooms) {
            System.out.println("Room Name: " + room.getRoomName());
            System.out.println("Area (sq m): " + room.getAreaSqM());
            System.out.println("Floor: " + room.getFloor());
            System.out.println("Items: " + String.join(", ", room.getItems()));

            if (room instanceof MasterBedroom mb) {
                System.out.println("Has Ensuite: " + mb.isHasEnsuite());
                System.out.println("Walk-in Closet: " + mb.isWalkInCloset());
            } else if (room instanceof Bedroom b) {
                System.out.println("Bed Count: " + b.getBedCount());
                System.out.println("Has Balcony: " + b.isHasBalcony());
            } else if (room instanceof ExtraSpace es) {
                System.out.println("Has Loft: " + es.isHasLoft());
                System.out.println("Has Basement: " + es.isHasBasement());
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Whole Household Details:\n" +
                "Address: " + address + "\n" +
                "Postcode: " + postcode + "\n" +
                "City: " + city + "\n" +
                "Housetype: " + typeOfHouse + "\n" +
                "County: " + county + "\n" +
                "Year built: " + yearBuilt + "\n" +
                "Total area: " + totalArea + "\n" +
                "Occupants: " + occupants;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Member> getOccupants() {
        return occupants;
    }
}

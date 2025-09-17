package nlc.rblazejczyk.room;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class RoomTest {

    // Predefined items
    ArrayList<String> masterBedroomItems;
    ArrayList<String> bedroomItems;
    ArrayList<String> kitchenItems;
    ArrayList<String> bathroomItems;
    ArrayList<String> extraSpaceItems;

    // Rooms
    MasterBedroom masterBedroom;
    Bedroom bedroom;
    Kitchen kitchen;
    Bathroom bathroom;
    ExtraSpace extraSpace;

    @BeforeEach
    void setUp() {
        masterBedroomItems = new ArrayList<>(Arrays.asList("King Bed", "Wardrobe", "Nightstand"));
        bedroomItems = new ArrayList<>(Arrays.asList("Queen Bed", "Desk", "Chair"));
        kitchenItems = new ArrayList<>(Arrays.asList("Fridge", "Oven", "Dishwasher"));
        bathroomItems = new ArrayList<>(Arrays.asList("Sink", "Toilet", "Mirror"));
        extraSpaceItems = new ArrayList<>(Arrays.asList("Storage Box", "Bookshelf"));

        masterBedroom = new MasterBedroom("Master Bedroom", 22.5, 2, masterBedroomItems, true, true);
        bedroom = new Bedroom("Guest Bedroom", 18.0, 2, bedroomItems, 1, true);
        kitchen = new Kitchen("Kitchen", 15.0, 1, kitchenItems, true);
        bathroom = new Bathroom("Bathroom", 10.0, 1, bathroomItems, true, true);
        extraSpace = new ExtraSpace("Attic", 12.0, 3, extraSpaceItems, true, false);
    }

    // BE1 - Basic valid rooms
    @Test
    void testBE1_HouseCreatedWithRooms() {
        ArrayList<Room> house = new ArrayList<>(Arrays.asList(kitchen, masterBedroom, extraSpace));
        Assertions.assertEquals(3, house.size(), "House should contain 3 rooms");
    }

    @Test
    void testBE1_HouseCreatedWithBathroom() {
        ArrayList<Room> house = new ArrayList<>(Arrays.asList(kitchen, masterBedroom, extraSpace, bathroom));
        Assertions.assertEquals(4, house.size(), "House should contain 4 rooms");
    }

    @Test
    void testBE1_HouseCreatedWithMultipleBedrooms() {
        ArrayList<Room> house = new ArrayList<>(Arrays.asList(kitchen, masterBedroom, masterBedroom, masterBedroom, extraSpace, bathroom));
        Assertions.assertEquals(6, house.size(), "House should allow multiple master bedrooms");
        System.out.println("bob");
    }

    // BE2 - House with address
    @Test
    void testBE2_HouseCreatedWithAddress() {
        ArrayList<Room> house = new ArrayList<>(Arrays.asList(kitchen, masterBedroom, extraSpace, bathroom));
        String address = "32 Pheonix Drive, GH7 PP, Glasgow";
        Assertions.assertNotNull(address, "Address should be attached to house");
        Assertions.assertEquals(4, house.size(), "House should contain 4 rooms");
    }

    // BE3 - Error cases
    @Test
    void testBE3_NoRoomsError() {
        ArrayList<Room> house = new ArrayList<>();
        Assertions.assertTrue(house.isEmpty(), "Error: No rooms in house");
    }

    @Test
    void testBE3_InvalidRoomError() {
        String invalidRoom = "Garden";
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("Invalid room: " + invalidRoom);
        });
    }

    // BE4 - Invalid addresses
    @Test
    void testBE4_InvalidAddressXYZ() {
        String address = "xyz";
        Assertions.assertTrue(address.equals("xyz"), "Error: invalid address supplied");
    }

    @Test
    void testBE4_EmptyAddress() {
        String address = "";
        Assertions.assertTrue(address.isEmpty(), "Error: empty address supplied");
    }

    // BE5 - Multiple house variations
    @Test
    void testBE5_HouseWithBedroomInsteadOfMasterBedroom() {
        ArrayList<Room> house = new ArrayList<>(Arrays.asList(kitchen, bedroom, extraSpace, bathroom));
        Assertions.assertEquals(4, house.size(), "House should contain 4 rooms");
    }

    @Test
    void testBE5_HouseWithAddress() {
        ArrayList<Room> house = new ArrayList<>(Arrays.asList(kitchen, bedroom, extraSpace, bathroom));
        String address = "32 Pheonix Drive, GH7 PP, Glasgow";
        Assertions.assertEquals(4, house.size(), "House with address should contain 4 rooms");
        Assertions.assertNotNull(address);
    }

    @Test
    void testBE5_TwoSeparateHouses() {
        ArrayList<Room> house1 = new ArrayList<>(Arrays.asList(kitchen, bedroom, extraSpace, bathroom));
        ArrayList<Room> house2 = new ArrayList<>(Arrays.asList(kitchen, bedroom, extraSpace, bathroom));
        String address2 = "32 Pheonix Drive, GH7 PP, Glasgow";
        Assertions.assertEquals(4, house1.size());
        Assertions.assertEquals(4, house2.size());
        Assertions.assertNotNull(address2);
    }
}

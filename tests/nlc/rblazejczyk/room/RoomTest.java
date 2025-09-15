package nlc.rblazejczyk.room;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    // Predefined items
    ArrayList<String> masterBedroomItems = new ArrayList<>(Arrays.asList("King Bed", "Wardrobe", "Nightstand"));
    ArrayList<String> bedroomItems = new ArrayList<>(Arrays.asList("Queen Bed", "Desk", "Chair"));
    ArrayList<String> kitchenItems = new ArrayList<>(Arrays.asList("Fridge", "Oven", "Dishwasher"));
    ArrayList<String> bathroomItems = new ArrayList<>(Arrays.asList("Sink", "Toilet", "Mirror"));
    ArrayList<String> extraSpaceItems = new ArrayList<>(Arrays.asList("Storage Box", "Bookshelf"));

    // Create rooms
    MasterBedroom masterBedroom = new MasterBedroom("Master Bedroom", 22.5, 2, masterBedroomItems, true, true);
    Bedroom bedroom = new Bedroom("Guest Bedroom", 18.0, 2, bedroomItems, 1, true);
    Kitchen kitchen = new Kitchen("Kitchen", 15.0, 1, kitchenItems, true);
    Bathroom bathroom = new Bathroom("Bathroom", 10.0, 1, bathroomItems, true, true);
    ExtraSpace extraSpace = new ExtraSpace("Attic", 12.0, 3, extraSpaceItems, true, false);


    @org.junit.jupiter.api.BeforeEach
    void setUp() {

    }

    @Test
    public void testArea()
    {
        Assertions.assertEquals(22.5, masterBedroom.getAreaSqM());
    }

}
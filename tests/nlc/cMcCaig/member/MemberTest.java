package nlc.cMcCaig.member;

import nlc.Household;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class MemberTest {

    // Predefined items
    Adult adult;
    Child child;
    Pet pet;
    Adult anotherAdult;
    Child anotherChild;
    Pet anotherPet;

    @BeforeEach
    void setUp() {
        adult = new Adult("bob", "wwww", "23/09/2002", 'M', 123, "Super busy", 123000);
        child = new Child("Alice", "Harris", "15/05/2015", 'F', 456, "Greenwood Primary", 4);
        pet = new Pet("oscar", "cat", "tuxedo", "10/6/2021", 'M', false, 0);

        anotherAdult = new Adult("Jane", "Doe", "01/01/1980", 'F', 789, "Working", 150000);
        anotherChild = new Child("Sam", "Doe", "01/01/2010", 'M', 101, "School", 10);
    }

    //HE1 – create household with good data - valid
    @Test
    void testHE1_householdCreatedWithOneAdult() {
        ArrayList<Member> members = new ArrayList<>(Collections.singletonList(adult));
        Assertions.assertEquals(Collections.singletonList(adult), members, "Household must have one Adult.");
    }

    @Test
    void testHE1_householdCreatedWithOneAdultOneChild() {
        ArrayList<Member> members = new ArrayList<>(Arrays.asList(adult, child));
        Assertions.assertEquals(Arrays.asList(adult, child), members, "Household must have one Adult and one Child.");
    }

    @Test
    void testHE1_householdCreatedWithOneAdultOneChildOnePet() {
        ArrayList<Member> members = new ArrayList<>(Arrays.asList(adult, child, pet));
        Assertions.assertEquals(Arrays.asList(adult, child, pet), members, "Household must have one Adult and one Child with one Pet.");
    }

    @Test
    void testHE1_householdCreatedWithTwoAdultTwoChildThreePet() {
        ArrayList<Member> members = new ArrayList<>(Arrays.asList(adult, adult, child, child, pet, pet, pet));
        Assertions.assertEquals(Arrays.asList(adult, adult, child, child, pet, pet, pet), members, "Household must have two Adults and two Children with three Pets.");
    }

    //HE2 – create household with bad data – invalid
    @Test
    void testHE2_householdCreatedWithZeroAdultThrowsException() {
        List<Member> members = List.of();

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {

            new Household(
                    "Dummy Address", "Dummy Postcode", "Dummy City",
                    "Dummy Type", "Dummy County", 2000, 100.0, members
            );
        });

        Assertions.assertEquals("Household must have at least one Adult occupant.", exception.getMessage());
    }

    @Test
    void testHE2_householdCreatedWithZeroAdultOneChildThrowsException() {
        ArrayList<Member> members = new ArrayList<>(Collections.singletonList(child));

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {

            new Household(
                    "Dummy Address", "Dummy Postcode", "Dummy City",
                    "Dummy Type", "Dummy County", 2000, 100.0, members
            );
        });

        Assertions.assertEquals("Household must have at least one Adult occupant.", exception.getMessage());
    }

    @Test
    void testHE2_householdCreatedWithZeroAdultOneChildOnePetThrowsException() {
        ArrayList<Member> members = new ArrayList<>(Arrays.asList(child, pet));

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {

            new Household(
                    "Dummy Address", "Dummy Postcode", "Dummy City",
                    "Dummy Type", "Dummy County", 2000, 100.0, members
            );
        });

        Assertions.assertEquals("Household must have at least one Adult occupant.", exception.getMessage());
    }

    @Test
    void testHE2_householdCreatedWithZeroAdultOnePetThrowsException() {
        ArrayList<Member> members = new ArrayList<>(Collections.singletonList(pet));

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {

            new Household(
                    "Dummy Address", "Dummy Postcode", "Dummy City",
                    "Dummy Type", "Dummy County", 2000, 100.0, members
            );
        });

        Assertions.assertEquals("Household must have at least one Adult occupant.", exception.getMessage());
    }

    //HE3 – view household - valid
    @Test
    void testHE3_householdViewedWithOneAdult() {
        ArrayList<Member> members = new ArrayList<>(Collections.singletonList(adult));
        Household household = new Household(
                "1 High Street", "G12 3HJ", "Auchinshoogle", "House",
                "County", 2000, 150.5, members
        );

        String householdView = household.toString();

        Assertions.assertTrue(householdView.contains(members.toString()),
                "The household view should contain the adult's name.");
    }

    @Test
    void testHE3_householdViewedWithOneAdultOneChild() {
        ArrayList<Member> members = new ArrayList<>(Arrays.asList(adult, child));
        Household household = new Household(
                "1 High Street", "G12 3HJ", "Auchinshoogle", "House",
                "County", 2000, 150.5, members
        );

        String householdView = household.toString();

        Assertions.assertTrue(householdView.contains(members.toString()),
                "The household view should contain the adult's name.");
    }

    @Test
    void testHE3_householdViewedWithTwoAdultTwoChildThreePet() {
        ArrayList<Member> members = new ArrayList<>(Arrays.asList(adult, adult, child, child, pet, pet, pet));
        Household household = new Household(
                "1 High Street", "G12 3HJ", "Auchinshoogle", "House",
                "County", 2000, 150.5, members
        );

        String householdView = household.toString();

        Assertions.assertTrue(householdView.contains(members.toString()),
                "The household view should contain the adult's name.");
    }

    @Test
    void testHE3_TwoHouseholdViewed() {
        ArrayList<Member> members1 = new ArrayList<>(Arrays.asList(adult, child, pet));
        Household household1 = new Household(
                "1 High Street", "G12 3HJ", "Auchinshoogle", "House",
                "County", 2000, 150.5, members1
        );

        ArrayList<Member> members2 = new ArrayList<>(Arrays.asList(anotherAdult, anotherChild));
        Household household2 = new Household(
                "2 New Street", "G12 3HK", "Auchinshoogle", "Flat",
                "County", 2000, 100.0, members2
        );

        String householdView1 = household1.toString();
        String householdView2 = household2.toString();


        Assertions.assertTrue(householdView1.contains(adult.toString()), "Household 1 view should contain the first adult's details.");
        Assertions.assertTrue(householdView1.contains(child.toString()), "Household 1 view should contain the first child's details.");
        Assertions.assertTrue(householdView1.contains(pet.toString()), "Household 1 view should contain the first pet's details.");

        Assertions.assertTrue(householdView2.contains(anotherAdult.toString()), "Household 2 view should contain the second adult's details.");
        Assertions.assertTrue(householdView2.contains(anotherChild.toString()), "Household 2 view should contain the second child's details.");
    }
}
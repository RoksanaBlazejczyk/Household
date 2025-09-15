package nlc.cMcCaig.member;

/**
 * class to represent household pet
 */
public class Pet extends Member {
    private String species;
    private String breed;
    private boolean microchipped;
    private int microchipNumber;

    /**
     * @return the attribute of the pet
     */
    @Override
    public String toString() {
        if (microchipped == true) {
            return "Pet Details:" +
                    "name '" + getName() + '\'' +
                    ", species '" + species + '\'' +
                    ", breed '" + breed + '\'' +
                    ", D.O.B '" + getDOB() + '\'' +
                    ", gender '" + getGender() + '\'' +
                    ", microchipped " + microchipped +
                    ", microchipNumber" + microchipNumber;
        } else {
            return "Pet Details" +
                    "name '" + getName() + '\'' +
                    ", species '" + species + '\'' +
                    ", breed '" + breed + '\'' +
                    ", D.O.B '" + getDOB() + '\'' +
                    ", gender '" + getGender() + '\'' +
                    ", microchipped " + microchipped;
        }
}

    /**
     * @param name            of the pet
     * @param species         of the pet
     * @param breed           of the pet
     * @param DOB             of the pet
     * @param gender          of the pet
     * @param microchipped    of the pet
     * @param microchipNumber of the pet
     */
    public Pet(String name, String species, String breed, String DOB, char gender, boolean microchipped, int microchipNumber) {
        setName(name);
        this.species = species;
        this.breed = breed;
        setDOB(DOB);
        setGender(gender);
        this.microchipped = microchipped;
        this.microchipNumber = microchipNumber;
    }

    public boolean isMicrochipped() {
        return microchipped;
    }

    public String getSpecies() {
        return species;
    }

    public String getBreed() {
        return breed;
    }

    public int getMicrochipNumber() {
        return microchipNumber;
    }
}

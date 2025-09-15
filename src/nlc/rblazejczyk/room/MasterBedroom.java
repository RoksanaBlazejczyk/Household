package nlc.rblazejczyk.room;

import java.util.ArrayList;

public class MasterBedroom extends Room{
    private boolean hasEnsuite;
    private boolean walkInCloset;


    public boolean isHasEnsuite() {
        return hasEnsuite;
    }
    public boolean isWalkInCloset() {
        return walkInCloset;
    }

    public MasterBedroom(String roomName, double areaSqM, int floor, ArrayList<String> items, boolean hasEnsuite, boolean walkInCloset) {
        super(roomName, areaSqM, floor, items);
        this.hasEnsuite = hasEnsuite;
        this.walkInCloset = walkInCloset;
    }
}





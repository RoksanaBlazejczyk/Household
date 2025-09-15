package nlc.rblazejczyk.room;

import java.util.ArrayList;

public class Kitchen extends Room {
    public Kitchen(String roomName, double areaSqM, int floor, ArrayList<String> items, boolean hasIsland) {
        super(roomName, areaSqM, floor, items);
        this.hasIsland = hasIsland;
    }

    public boolean isHasIsland() {
        return hasIsland;
    }

    public void setHasIsland(boolean hasIsland) {
        this.hasIsland = hasIsland;
    }

    private boolean hasIsland;

}


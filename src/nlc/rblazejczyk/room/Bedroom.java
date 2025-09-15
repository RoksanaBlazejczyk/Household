package nlc.rblazejczyk.room;

import java.util.ArrayList;

public class Bedroom extends Room {
    public int getBedCount() {
        return bedCount;
    }

    public void setBedCount(int bedCount) {
        this.bedCount = bedCount;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    private int bedCount;
    private boolean hasBalcony;



    public Bedroom(String roomName, double areaSqM, int floor, ArrayList<String> items, int bedCount, boolean hasBalcony) {
        super(roomName, areaSqM, floor, items);
        this.bedCount = bedCount;
        this.hasBalcony = hasBalcony;
    }



}

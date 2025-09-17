package nlc.rblazejczyk.room;

import java.util.ArrayList;

public class Bathroom extends Room {
    public boolean isHasBathtub() {
        return hasBathtub;
    }

    public void setHasBathtub(boolean hasBathtub) {
        this.hasBathtub = hasBathtub;
    }

    public boolean isHasShower() {
        return hasShower;
    }

    public void setHasShower(boolean hasShower) {
        this.hasShower = hasShower;
    }

    private boolean hasBathtub;
    private boolean hasShower;

    public Bathroom(String roomName, double areaSqM, int floor, ArrayList<String> items, boolean hasBathtub, boolean hasShower) {
        super(roomName, areaSqM, floor, items);
        this.hasBathtub = hasBathtub;
        this.hasShower = hasShower;
    }


}

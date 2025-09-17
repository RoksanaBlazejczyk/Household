package nlc.rblazejczyk.room;

import java.util.ArrayList;

public class ExtraSpace extends Room {
    public ExtraSpace(String roomName, double areaSqM, int floor, ArrayList<String> items, boolean hasLoft, boolean hasBasement) {
        super(roomName, areaSqM, floor, items);
        this.hasLoft = hasLoft;
        this.hasBasement = hasBasement;
    }

    public boolean isHasLoft() {
        return hasLoft;
    }

    public void setHasLoft(boolean hasLoft) {
        this.hasLoft = hasLoft;
    }

    public boolean isHasBasement() {
        return hasBasement;
    }

    public void setHasBasement(boolean hasBasement) {
        this.hasBasement = hasBasement;
    }

    private boolean hasLoft;
    private boolean hasBasement;


}

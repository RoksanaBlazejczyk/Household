package nlc.rsneddon.outside;

import java.util.ArrayList;

public class FrontGarden extends OutsideArea {
    private ArrayList<String> plants;
    private boolean hasFountain;
    private boolean hasFrontGarden;

    public FrontGarden(double areaSqM, String surfaceType, boolean fencing, ArrayList<String> plants, boolean hasFountain, boolean hasFrontGarden) {
        super(areaSqM, surfaceType, fencing);
        this.plants = plants;
        this.hasFountain = hasFountain;
        this.hasFrontGarden = hasFrontGarden;
    }

    @Override
    public String getOutsideDetails() {
        if (!hasFrontGarden) {
            return "Front Garden details:\nNo front garden available.";
        }
        return "\nFront Garden details: " + super.getOutsideDetails() + "\n" +
                "Plants: " + String.join(", ", plants) + "\n" +
                "Fountain: " + (hasFountain ? "Yes" : "No");
    }
}

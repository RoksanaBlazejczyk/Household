package nlc.rsneddon.outside;

public class BackGarden extends OutsideArea {
    private boolean hasBackGarden;
    private boolean hasPatio;
    private boolean shedSize; // or double if needed

    public BackGarden(double areaSqM, String surfaceType, boolean fencing, boolean hasPatio, boolean shedSize, boolean hasBackGarden) {
        super(areaSqM, surfaceType, fencing);
        this.hasPatio = hasPatio;
        this.shedSize = shedSize;
        this.hasBackGarden = hasBackGarden;
    }

    @Override
    public String getOutsideDetails() {
        if (!hasBackGarden) {
            return "Back Garden details:\nNo backgarden available.";
        }
        return "\nBack Garden details: \n" + super.getOutsideDetails() + "\n" +
                "Patio: " + (hasPatio ? "Yes" : "No") + "\n" +
                "Shed: " + (shedSize ? "Yes" : "No");
    }
}

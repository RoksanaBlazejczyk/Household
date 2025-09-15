package nlc.rsneddon.outside;

abstract class OutsideArea {
    private double areaSqM;
    private String surfaceType;
    private boolean fencing;

    public OutsideArea(double areaSqM, String surfaceType, boolean fencing) {
        this.areaSqM = areaSqM;
        this.surfaceType = surfaceType; //concrete, grass, slabs
        this.fencing = fencing;
    }
    public String getOutsideDetails() {
        return "Area in Square meters: " + areaSqM + "\n" +
                "Surface type is: " + surfaceType + "\n" +
                "Fenced: " + (fencing ? "yes" : "no");
    }

    public double getAreaSqM() {return areaSqM;}
    public void setAreaSqM(double areaSqM) {this.areaSqM = areaSqM;}

    public String getSurfaceType() {return surfaceType;}
    public void setSurfaceType(String surfaceType) {this.surfaceType = surfaceType;}

    public boolean isFencing() {return fencing;}
    public void setFencing(boolean fencing) {this.fencing = fencing;}
}

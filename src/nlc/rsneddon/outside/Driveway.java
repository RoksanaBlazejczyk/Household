package nlc.rsneddon.outside;

public class Driveway extends OutsideArea {
    private final boolean hasDriveway;
    private final int capacity;
    private final String material;

    public Driveway(double areaSQM, String surfaceType, boolean fencing, int capacity, String material, boolean hasDriveway) {
        super(areaSQM, surfaceType, fencing);
        this.capacity = capacity;
        this.material = material;
        this.hasDriveway = hasDriveway;
    }

    @Override
    public String getOutsideDetails() {
        if (!hasDriveway) {
            return "Driveway details:\nNo driveway available.";
        }
        return "Driveway details:\n" +
                super.getOutsideDetails() + "\n" +
                "Driveway: Yes\n" +
                "Capacity: " + capacity + " cars\n" +
                "Material: " + material;
    }
}

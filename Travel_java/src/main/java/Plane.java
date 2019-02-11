public class Plane {
    private AeroplaneType aeroplane;
    private int capacity;
    private int weight;

    public Plane(AeroplaneType aeroplane) {
        this.aeroplane = aeroplane;
        this.capacity = capacity;
        this.weight = weight;
    }

    public AeroplaneType getType() {
        return aeroplane;
    }

    public int getCapacity() {
        return this.aeroplane.getCapacityValue();
    }

    public int getTotalWeight() {
        return this.aeroplane.getWeightValue();
    }

    public int getBaggage() {
        return this.aeroplane.getBaggageValue();
    }


}

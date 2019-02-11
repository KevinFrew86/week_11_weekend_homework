public enum AeroplaneType {

    BOEING747(660, 439560, 333),
    AIRBUSA380(853, 665340, 390),
    BOEING777(450, 347400, 386),
    AIRBUSA340(475, 399950, 421);

    //private final String model;
    private final int capacity;
    private final int weight;
    private final int baggage;

    private AeroplaneType(int capacity, int weight, int baggage) {
    //    this.model = model;
        this.capacity = capacity;
        this.weight = weight;
        this.baggage = baggage;
    }

    //public String getModel() { return model; }

    public int getCapacityValue() { return capacity; }

    public int getWeightValue() { return weight; }

    public int getBaggageValue() { return baggage; }

}

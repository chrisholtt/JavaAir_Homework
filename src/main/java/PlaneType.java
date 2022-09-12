public enum PlaneType {
   BOEING747(10, 660.00),
    MIG52(2, 220.50),
    AIRBUSA380(5, 400.50);

   private final int capacity;
   private final double totalWeight;

    PlaneType(int capacity, double totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity(){
        return this.capacity;
    }
}

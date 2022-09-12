public class Plane {
    PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public int getNumberOfSeats(){
        return this.planeType.getCapacity();
    }


}

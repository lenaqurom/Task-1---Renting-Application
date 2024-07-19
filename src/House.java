
// concrete class for different property types
public class House extends RentableProperty {
    private int numFloors;
    private boolean hasGarage;

    public House(String address, String name, double size, int numFloors, boolean hasGarage) {
        super(address, name, size);
        this.numFloors = numFloors;
        this.hasGarage = hasGarage;
    }

    @Override
    public String displayInfo() {
        return "House: " + name + ", Address: " + address + ", Size: " + size + " sq.m, Floors: " + numFloors + ", Garage: " + hasGarage;
    }
}


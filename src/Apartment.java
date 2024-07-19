
// concrete class for different property types
public class Apartment extends RentableProperty {
    private int numRooms;
    private boolean hasBalcony;

    public Apartment(String address, String name, double size, int numRooms, boolean hasBalcony) {
        super(address, name, size);
        this.numRooms = numRooms;
        this.hasBalcony = hasBalcony;
    }

    @Override
    public String displayInfo() {
        return "Apartment: " + name + ", Address: " + address + ", Size: " + size + " sq.m, Rooms: " + numRooms + ", Balcony: " + hasBalcony;
    }
}


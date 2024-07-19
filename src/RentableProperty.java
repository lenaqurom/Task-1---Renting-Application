
// abstract base class for a rentable property
public abstract class RentableProperty {
    protected String address;
    protected String name;
    protected double size;

    public RentableProperty(String address, String name, double size) {
        this.address = address;
        this.name = name;
        this.size = size;
    }

    public abstract String displayInfo();
}


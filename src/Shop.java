
// concrete class for different property types
public class Shop extends RentableProperty {
    private String businessType;

    public Shop(String address, String name, double size, String businessType) {
        super(address, name, size);
        this.businessType = businessType;
    }

    @Override
    public String displayInfo() {
        return "Shop: " + name + ", Address: " + address + ", Size: " + size + " sq.m, Business Type: " + businessType;
    }
}


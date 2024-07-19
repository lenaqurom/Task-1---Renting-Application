
import java.util.ArrayList;
import java.util.List;

// customer class with aggregation (multiple rentable properties)
public class Customer {
    private String name;
    private List<RentedProperty> rentedProperties = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void rentProperty(RentableProperty property, Contract contract) {
        rentedProperties.add(new RentedProperty(property, contract));
    }

    public void displayRentedProperties() {
        for (RentedProperty rentedProperty : rentedProperties) {
            System.out.println(rentedProperty.property.displayInfo());
            System.out.println(rentedProperty.contract.displayContract());
        }
    }

    private static class RentedProperty {
        RentableProperty property;
        Contract contract;

        RentedProperty(RentableProperty property, Contract contract) {
            this.property = property;
            this.contract = contract;
        }
    }
}


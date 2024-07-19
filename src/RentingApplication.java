
import java.util.Date;

public class RentingApplication {
    public static void main(String[] args) {
        Apartment apartment = new Apartment("Rafedia St", "Luxury Apartment", 120, 3, true);
        House house = new House("Tell St", "Family House", 300, 2, true);
        Shop shop = new Shop("Juneid St", "Coffee Shop", 90, "Cafe");

        Customer customer = new Customer("John Doe");
        Contract contract1 = new Contract(new Date(2024, 7, 20), new Date(2025, 7, 20), 1200, "Paypal");
        Contract contract2 = new Contract(new Date(2024, 7, 20), new Date(2025, 7, 20), 2200, "Visa");

        customer.rentProperty(apartment, contract1);
        customer.rentProperty(house, contract2);

        customer.displayRentedProperties();
    }
}

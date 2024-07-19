
import java.util.Date;

//contract class with composition (contains rental period, price, and payment method)
public class Contract {
    private Date startDate;
    private Date endDate;
    private double price;
    private String paymentMethod;

    public Contract(Date startDate, Date endDate, double price, String paymentMethod) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.paymentMethod = paymentMethod;
    }

    public String displayContract() {
        return "Contract: Start Date: " + startDate + ", End Date: " + endDate + ", Price: " + price + ", Payment Method: " + paymentMethod;
    }
}

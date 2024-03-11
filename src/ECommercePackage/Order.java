package ECommercePackage;

import java.time.LocalDateTime;
import java.util.Date;

public class Order {
    private int orderId;


    public int getOrderId() {
        return orderId;

    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    private LocalDateTime dateTime = LocalDateTime.now();


}

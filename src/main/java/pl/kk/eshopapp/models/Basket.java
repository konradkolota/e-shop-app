package pl.kk.eshopapp.models;

public class Basket {
    private OrderLine orderLine;

    public OrderLine getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }
}

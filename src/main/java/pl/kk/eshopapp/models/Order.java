package pl.kk.eshopapp.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name = "zamowienia")
public class Order {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "koszt", precision = 10, scale = 2)
    private BigDecimal cost;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(name = "data_zlozenia_zamowienia")
    private Date orderDate;
    private enum status{
        COMPLETED, SHIPPED , IN_PROGRESS, CANCELED, ACCEPTED;

    };

    @OneToOne
    private Address deliveryAddress;
    @OneToOne
    private Address userAddress;
    @OneToOne
    private OrderLine orderLine;
    @OneToOne
    private Client client;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Address getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(Address userAddress) {
        this.userAddress = userAddress;
    }

    public OrderLine getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}

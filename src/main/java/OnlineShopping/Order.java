package OnlineShopping;

import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

public class Order {
    //DECLARACION DE VARIABLES
    private String number;
    private Date ordered;
    private Date shipped;
    private Address ship_to;
    private OrderStatus status;
    private BigDecimal total;
    //CONSTRUCTOR
    public Order(String number, Date ordered, Date shipped, Address ship_to, OrderStatus status, BigDecimal total) {
        this.number = number;
        this.ordered = ordered;
        this.shipped = shipped;
        this.ship_to = ship_to;
        this.status = status;
        this.total = total;
    }
    //MÉTODOS GETTERS Y SETTERS
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getOrdered() {
        return ordered;
    }

    public void setOrdered(Date ordered) {
        this.ordered = ordered;
    }

    public Date getShipped() {
        return shipped;
    }

    public void setShipped(Date shipped) {
        this.shipped = shipped;
    }

    public Address getShip_to() {
        return ship_to;
    }

    public void setShip_to(Address ship_to) {
        this.ship_to = ship_to;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public BigDecimal geTotal() {
        return total;
    }

    public void seTotal(BigDecimal total) {
        this.total = total;
    }



}

package OnlineShopping;

import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

public  class Account {
    //DECLARACION DE VARIABLES
    private String id;
    private Address billin_address;
    private boolean is_closed;
    private Date open;
    private Date closed;
    private Set<Payment> Payment = new LinkedHashSet<>();
    private ShoppingCart shoppingCart;
    private Customer customer;
    private Order order;
    //CONSTRUCTOR

    public Account(String id, Address billin_address, boolean is_closed, Date open, Date closed) {
        this.id = id;
        this.billin_address = billin_address;
        this.is_closed = is_closed;
        this.open = open;
        this.closed = closed;
        BigDecimal b1=new BigDecimal(12);
        Date d1=new Date();
        Payment payment=new Payment("1", d1,b1,"El pago se realizo correctamente");
        this.Payment.add(payment);
        this.shoppingCart = shoppingCart;
        this.customer = customer;
    }

    //MÉTODOS GETTERS Y SETTERS
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getBillin_address() {
        return billin_address;
    }

    public void setBillin_address(Address billin_address) {
        this.billin_address = billin_address;
    }

    public boolean isIs_closed() {
        return is_closed;
    }

    public void setIs_closed(boolean is_closed) {
        this.is_closed = is_closed;
    }

    public Date getOpen() {
        return open;
    }

    public void setOpen(Date open) {
        this.open = open;
    }

    public Date getClosed() {
        return closed;
    }

    public void setClosed(Date closed) {
        this.closed = closed;
    }

    public Set<OnlineShopping.Payment> getPayment() {
        return Payment;
    }

    public void setPayment(Set<OnlineShopping.Payment> payment) {
        Payment = payment;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}


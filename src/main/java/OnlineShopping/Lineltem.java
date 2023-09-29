package OnlineShopping;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Lineltem {
    //DECLARACION DE VARIABLES
    private Integer quantity;
    private Price price;
    private Product product;
    private Set<Product> Products=new LinkedHashSet<>();
    private Supplier supplier;
    //CONSTRUCTOR
    public Lineltem(Integer quantity, Price price) {
        this.quantity = quantity;
        this.price = price;
        this.product=new Product("1","Manzanas",supplier);
        this.Products.add(product);
    }
    //MÉTODOS GETTERS Y SETTERS

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Set<Product> getProducts() {
        return Products;
    }

    public void setProducts(Set<Product> products) {
        Products = products;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    //MÉTODOS EQUALS Y HASHCODE


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lineltem lineltem)) return false;
        return Objects.equals(quantity, lineltem.quantity) && Objects.equals(price, lineltem.price) && Objects.equals(product, lineltem.product) && Objects.equals(Products, lineltem.Products) && Objects.equals(supplier, lineltem.supplier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, price, product, Products, supplier);
    }
}

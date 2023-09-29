package OnlineShopping;

import java.util.Objects;

public class Product {
    //DECLARACION DE VARIABLES
    private String id;
    private String name;
    private Supplier supplier;

    //CONSTRUCTOR
    public Product(String id, String name, Supplier supplier) {
        this.id = id;
        this.name = name;
        this.supplier = supplier;
    }

    //MÉTODOS GETTERS Y SETTERS
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        if (!(o instanceof Product product)) return false;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

package OnlineShopping;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class ShoppingCart {
    //DECLARACION DE VARIABLES
    private Account account;
    private Set<Lineltem> lineltemSet = new LinkedHashSet<>();
    private WebUser webUser;
    private Product product;

    //CONSTRUCTOR
    public ShoppingCart(Set<Lineltem> lineltemSet, Account account) {

        this.lineltemSet = lineltemSet;
    }

    //MÉTODOS GETTERS Y SETTERS
    public Set<Lineltem> getLineltemSet() {
        return lineltemSet;
    }

    public void setLineltemSet(Set<Lineltem> lineltemSet) {
        this.lineltemSet = lineltemSet;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public WebUser getWebUser() {
        return webUser;
    }

    public void setWebUser(WebUser webUser) {
        this.webUser = webUser;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    //MÉTODOS EQUALS Y HASHCODE

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShoppingCart that)) return false;
        return Objects.equals(account, that.account) && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account, product);
    }
}

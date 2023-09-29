package OnlineShopping;


public  class WebUser {
    //DECLARACION DE VARIABLES
    private String login_id;
    private String password;
    private UserState userState;
    private Customer customer;
    private ShoppingCart shoppingCart;
    //CONSTRUCTOR

    public WebUser(String login_id, String password, UserState userState) {
        this.login_id = login_id;
        this.password = password;
        this.userState = userState;
        this.customer=customer;
        this.shoppingCart=null;

    }
    //MÉTODOS GETTERS Y SETTERS
    public String getLogin_id() {
        return login_id;
    }

    public void setLogin_id(String login_id) {
        this.login_id = login_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserState getUserState() {
        return userState;
    }

    public void setUserState(UserState userState) {
        this.userState = userState;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
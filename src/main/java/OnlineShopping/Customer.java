package OnlineShopping;



public class Customer {
    //DECLARACION DE VARIABLES
    private String id;
    private Address address;
    private Phone phone;
    private Account account;
    private WebUser webUser;
    private String email;

    //CONSTRUCTOR

    public Customer(String id, Address address, Phone phone,String email) {
        this.id = id;
        this.address = address;
        this.phone = phone;
        this.account=account;
        this.webUser=null;
        this.email=email;
    }
    //MÉTODOS GETTERS Y SETTERS
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
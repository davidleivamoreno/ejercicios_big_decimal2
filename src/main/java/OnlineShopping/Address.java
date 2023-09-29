package OnlineShopping;

public class Address {
    //DECLARACION DE VARIABLES
    private String calle;
    private int numero_calle;
    private String Ciudad;
    private String pais;
    //CONSTRUCTOR

    public Address(String calle, int numero_calle, String ciudad, String pais) {
        this.calle = calle;
        this.numero_calle = numero_calle;
        Ciudad = ciudad;
        this.pais = pais;
    }
    //MÉTODOS GETTERS Y SETTERS
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero_calle() {
        return numero_calle;
    }

    public void setNumero_calle(int numero_calle) {
        this.numero_calle = numero_calle;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}

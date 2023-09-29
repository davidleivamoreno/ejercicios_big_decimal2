package OnlineShopping;

public class Phone {
    //DECLARACION DE VARIABLES
    private String telefono_movil;
    private String telefono_fijo;
    //CONSTRUCTOR
    public Phone(String telefono_movil, String telefono_fijo) {
        this.telefono_movil = telefono_movil;
        this.telefono_fijo = telefono_fijo;
    }
    //MÉTODOS GETTERS Y SETTERS
    public String getTelefono_movil() {
        return telefono_movil;
    }

    public void setTelefono_movil(String telefono_movil) {
        this.telefono_movil = telefono_movil;
    }

    public String getTelefono_fijo() {
        return telefono_fijo;
    }

    public void setTelefono_fijo(String telefono_fijo) {
        this.telefono_fijo = telefono_fijo;
    }
}

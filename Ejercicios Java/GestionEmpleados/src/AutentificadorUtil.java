
public class AutentificadorUtil {

    private String clave;

    public boolean iniciarSesion(String clave) {
        return this.clave.equals(clave);
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}

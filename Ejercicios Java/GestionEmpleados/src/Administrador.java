
public class Administrador extends Empleado implements Autentificar {

    private AutentificadorUtil utilitario;

    public Administrador() {
        this.utilitario = new AutentificadorUtil();
    }

    @Override
    public void setClave(String clave) {
        this.utilitario.setClave(clave);
    }

    @Override
    public double getBonificacion() {
        return 0;
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.utilitario.iniciarSesion(clave);
    }

}

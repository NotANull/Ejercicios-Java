
public class Cliente implements Autentificar {

    private String nombre;
    private String documento;
    private String telefono;
    private AutentificadorUtil utilitario;

    public Cliente() {
        this.utilitario = new AutentificadorUtil();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.utilitario.iniciarSesion(clave);
    }

    @Override
    public double getBonificacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setClave(String clave) {
        this.setClave(clave);
    }

}

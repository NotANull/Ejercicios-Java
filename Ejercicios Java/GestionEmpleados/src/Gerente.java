
public class Gerente extends Empleado implements Autentificar {

    @Override
    public double getBonificacion() {
        System.out.println("Se ejecuta el método getBonificacion de la clase Gerente");
        return 2575;
    }

    @Override
    public void setClave(String clave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean iniciarSesion(String clave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

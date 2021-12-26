
public class SistemaInterno {

    //Se supone que tiene que ser la contraseña que el usuario quiera, este es un ejemplo nomás :D
    private final String clave = "cualquierClave";

    public boolean autentificar(Autentificar gerente) {
        boolean PuedeIniciarSesion = gerente.iniciarSesion(this.clave);
        if (PuedeIniciarSesion) {
            System.out.println("Login exitoso");
            return true;
        } else {
            System.out.println("Contraseña incorrecta");
            return false;
        }
    }
}

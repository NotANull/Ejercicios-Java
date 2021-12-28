
public class TestConexion {

    public static void main(String[] args) {

        try (Conexion conexion = new Conexion()) {
            conexion.leerDados();
        } catch (IllegalStateException ex) {
            System.out.println("Surgió un error en la conexión ");
        }

//        Conexion con = null;
//
//        try {
//            con = new Conexion();
//            con.leerDados();
//            con.cerrar();
//        } catch (IllegalStateException ex) {
//            System.out.println("Surgio un error en la conexión");
//        } finally {
//            con.cerrar();
//        }
    }
}

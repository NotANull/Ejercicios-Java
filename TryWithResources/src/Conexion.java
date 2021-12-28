
public class Conexion implements AutoCloseable {

    public Conexion() {
        System.out.println("Abriendo Conexion");
    }

    public void leerDados() {
        System.out.println("Recibiendo datos");
        throw new IllegalStateException();
    }

    @Override
    public void close() {
        System.out.println("Cerrando Conexion");
    }
}

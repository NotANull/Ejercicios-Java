
public abstract class Empleado {

    private String nombre;
    private double salario;
    private String documentacion;
    private int tipo;

    public Empleado() {

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        System.out.println("Se ejecuta el método getSalario de la clase Empleado");
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDocumentacion() {
        return this.documentacion;
    }

    public void setDocumentacion(String documentacion) {
        this.documentacion = documentacion;
    }

    public int getTipo() {
        return this.tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public abstract double getBonificacion();
}

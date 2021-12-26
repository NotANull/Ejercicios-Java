
public class ControlBonificacion {

    private double suma;

    public double sumaSalario(Empleado empleado) {
        this.suma = 0;
        this.suma += empleado.getBonificacion();
        System.out.println("Total bonificación: " + this.suma);
        return this.suma;
    }
}

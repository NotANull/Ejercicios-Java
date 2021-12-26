
public class TestControlBonificacion {

    public static void main(String[] args) {
        
        //Instancia de la clase padre (clase más genérica)
        //Empleado empleadoComun = new Empleado(); //Como la clase Empleado se volvió abstracta, no se puede instanciar un objeto
        Empleado empleadoContador = new Contador();
        empleadoContador.setSalario(2000);
        
        //Instancia de un objeto de la clase hija (clase más específica)
        Gerente empleadoGerente = new Gerente();
        empleadoGerente.setSalario(10000);
        
        //Instancia de una clase a la cual se le aplica polimorfismo
        ControlBonificacion controlB = new ControlBonificacion();
        controlB.sumaSalario(empleadoContador);
        controlB.sumaSalario(empleadoGerente);
    }

}

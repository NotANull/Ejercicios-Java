
public class TestEmpleado {

    public static void main(String[] args) {
        Empleado emp = new Gerente();
        emp.setNombre("Omar");
        emp.setDocumentacion("131424");
        emp.setTipo(1);
        emp.setSalario(2000);

        System.out.println(emp.getSalario());
        System.out.println(emp.getBonificacion());
    }
}

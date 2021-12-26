
public class TestGerente {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();

        gerente.setSalario(6750);
        gerente.setTipo(0);
        gerente.setClave("cualquierClave");

        System.out.println("Salario base del gerente: " + gerente.getSalario());
        System.out.println("Salario base del gerente más su 10%: " + gerente.getBonificacion());
    }
}

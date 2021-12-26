
public class TestSistemaInterno {

    public static void main(String[] args) {
        //Creo un sistema de contraseña el cual me pide qué empleado quiere ingresar
        SistemaInterno sI = new SistemaInterno();
        
        Gerente g1 = new Gerente(); //Creo un gerente
        Administrador admin = new Administrador(); //Creo un administrador
        
        sI.autentificar(g1); //Quiero que se loguee el gerente
        sI.autentificar(admin); //Quiero que se loguee el administrador
    }

}

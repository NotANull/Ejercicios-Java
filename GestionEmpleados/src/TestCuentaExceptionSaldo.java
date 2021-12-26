public class TestCuentaExceptionSaldo {

    public static void main(String[] args) {
        Cuenta cuenta = new CuentaAhorros(123, 456);

        cuenta.deposita(200); //Deposito una determinada cantidad de plata
        cuenta.saca(201); //Si quiero retirar más de lo que tengo, me debería lanzar la excepción que yo cree
    }
}

import java.util.ArrayList;

public class Array_List {

    public static void main(String[] args) {

        String variable1 = "Ejemplo 1";
        String variable2 = "Ejemplo 2";
        String variable3 = "Ejemplo 3";
        String variable4 = "Ejemplo 4";

        //Creamouns un ArrayList que va a almacenar datos de tipo String
        ArrayList<String> lista = new ArrayList<>();

        //Con el método .add(valor) sirve para agregar elementos al ArrayList
        //En este caso solamente datos de tipo String que pueden ser variables o datos puros
        lista.add(variable1);
        lista.add(variable2);
        lista.add(variable3);
        lista.add(variable4);
        lista.add("Ejemplo 5");

        System.out.println(lista);
        
        //Con el método .remove(valor) sirve para remover un elemeplo del ArrayList
        //El valor como parámetro se le puede pasar un índice o un elemento en concreto
        lista.remove(2);
        lista.remove("Ejemplo 1");
        
        System.out.println(lista);
        
        //Con el método .set(índice, valor) vamos a poder modificar el elemento que se
        //encuentra en el índice pasado por parámetro y vamos a modificar ese elemento por
        //otro que le pasamos en el segundo parámetro
        lista.set(0, "variable modificada");
        
        System.out.println(lista);
        
        //Con el método .size() nos va a retornar la cantidad de elementos que tiene
        //nuestra arrayList
        System.out.println("Tamaño del ArrayList: " + lista.size());
        
        //--------------FORMAS DE RECORRER UN ARRAYLIST--------------\\
        
        //FOR TRADICIONAL
        System.out.println("FOR TRADICIONAL");
        for (int i = 0; i < lista.size(); i++) {
            //En arrayList vamos a usar el método .get(índice) para que nos retorne
            //El elemento que se encuentra en esa posición.
            System.out.print("(" + lista.get(i) + ")-");
        }
        
        System.out.println("");
        
        //FOREACH
        System.out.println("FOR EACH");
        for (String nombreIteradora : lista) {
            System.out.print("(" + nombreIteradora + ")-");
        }
        
        System.out.println("");
        
        //FOR EACH RECURSO LAMBDA
        System.out.println("FOR RECURSO LAMBDA");
        lista.forEach(nombreIteradora -> {
            System.out.print("(" + nombreIteradora + ")-");
        });
    }
}

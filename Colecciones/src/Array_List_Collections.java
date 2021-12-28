
import java.util.ArrayList;
import java.util.Collections;


public class Array_List_Collections {

    public static void main(String[] args) {
        
        String variable1 = "Rojo";
        String variable2 = "Amarillo";
        String variable3 = "Violeta";
        String variable4 = "Gris";
        
        ArrayList<String> colores = new ArrayList<>();
        
        colores.add(variable1);
        colores.add(variable2);
        colores.add(variable3);
        colores.add(variable4);
        
        System.out.println("Colores ingresados de forma random");
        System.out.println(colores);
        
        //De la clase Collections, usamos el método .sort(ArrayList) y le pasamos
        //como parámetro nuestra ArrayList para que la ordene de menor a mayor
        Collections.sort(colores);
        
        System.out.println("\nColores ordenados de menor a mayor");
        System.out.println(colores);
        
        //De la clase Collections usamos el método .sort(nombre_ArrayList, Collection.reverseOrder())
        //Para ordenar nuestra ArrayList de mayor a menor
        Collections.sort(colores, Collections.reverseOrder());
        
        System.out.println("\nColores ordenados de mayor a menor");
        System.out.println(colores);
    }

}

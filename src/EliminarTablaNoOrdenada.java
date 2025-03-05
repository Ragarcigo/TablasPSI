/*
Se busca recorriendo el array y comparando con un if el elemento a eliminar
y luego el último valor del array ocupa el sitio del elemento a eliminar,
finalmente se reduce la longitud de una posicion en el array
 */

import java.util.Arrays;

public class EliminarTablaNoOrdenada {
    public static void main(String[] args) {
        String [] nombres={"Juanma", "Anuta","Alba","Rubén","Laura","Arturo","Irina","Dani","Pedro","Fran","Sandra","Raul"};
        System.out.println("Original Array ->"+ Arrays.toString(nombres));
        String nombreEliminar="Laura";
        int indice=-1; //guardará el índice o posicion donde se va a sustituir con el último valor.
        String ultimo=nombres[nombres.length-1]; //ultimo elemento del Array

        for(int i=0;i<nombres.length;i++){
            if(nombres[i].equals(nombreEliminar)){
                indice=i;
                break; //salgo, ya encontramos el indice
            }
        }
        if(indice!=-1) { //si el valor buscado no existe en la tabla, el indice se mantiene en -1
            nombres[indice] = ultimo;
            //recortar el Array
            nombres = Arrays.copyOf(nombres, nombres.length - 1);
            System.out.println("Nuevo Array ->" + Arrays.toString(nombres));
        }else{
            System.out.println("El nombre no existe en el Array");
        }
    }
}

import java.util.Arrays;

public class EliminarTablaOrdenada {
    public static void main(String[] args) {
        int[] numeros={3,34,45,67,567,2388,9876};
        int eliminar=567;
        int indice= Arrays.binarySearch(numeros,eliminar); //buscar el numero y devuelve el indice....->4
        if(indice>=0) {
            System.out.println(Arrays.toString(numeros));
            System.out.println("Indice encontrado: " + indice);
            System.arraycopy(numeros, indice + 1, numeros, indice, numeros.length - indice - 1);
            numeros = Arrays.copyOf(numeros, numeros.length - 1);
            System.out.println("La nueva tabla es: " + Arrays.toString(numeros));
        }else{
            System.out.println("No existe el numero a eliminar");
        }
        String[] palabras = {"Sol", "Luna", "Estrellas", "Aula", "Pájaro", "Montaña", "Baile", "Juego", "Disfraz", "Rojo", "Colores",
                "Fiesta", "Música", "Confeti", "Máscara", "Carroza", "Carpa", "Maniquí", "Gafas", "Peluca"};
        Arrays.sort(palabras);
        String pEliminar="Música";
        indice =Arrays.binarySearch(palabras,pEliminar); //buscar la palabra y devuleve el indice...->15
        if(indice>=0) {
            System.out.println(Arrays.toString(palabras));
            System.out.println("Indice encontrado: " + indice);
            System.arraycopy(palabras,indice+1,palabras,indice,palabras.length-indice-1);
            palabras=Arrays.copyOf(palabras,palabras.length-1);
            System.out.println("La nueva tabla es: " + Arrays.toString(palabras));
        }else{
            System.out.println("No existe el numero a eliminar");
        }
    }
}

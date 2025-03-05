import java.util.Scanner;
import java.util.Arrays;

public class InsertarTablaOrdenada3 {

    public static void main(String[] args) {

        String[] palabras = {"Sol", "Luna", "Estrellas", "Aula", "Pájaro", "Montaña", "Baile", "Juego", "Disfraz", "Rojo", "Colores", "Fiesta", "Música", "Confeti", "Máscara", "Carroza", "Carpa", "Maniquí", "Gafas", "Peluca"};
        Arrays.sort(palabras);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la nueva palabra para insertar en la tabla: ");
        String nuevaPalabra= entrada.nextLine();
        int indice = Arrays.binarySearch(palabras, nuevaPalabra);
        if (indice < 0) {
            indice = -Arrays.binarySearch(palabras, nuevaPalabra)-1;
        }
            System.out.println("Indice-> " + indice);
            String[] palabraT = new String[palabras.length + 1];
            System.out.println("Tabla temporal-> " + Arrays.toString(palabraT));
            System.arraycopy(palabras, 0, palabraT, 0, indice);
            System.out.println("Tabla copiando el primer tramo-> " + Arrays.toString(palabraT));
            palabraT[indice] = nuevaPalabra;
            System.out.println("Tabla insertando la nueva palabra -> " + Arrays.toString(palabraT));
            System.arraycopy(palabras, indice, palabraT, indice + 1, palabras.length - indice);
            palabras = palabraT;
            System.out.println("Tabla final con el segundo tramo -> " + Arrays.toString(palabras));

    }
}
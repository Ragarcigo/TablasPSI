import java.util.Scanner;
import java.util.Arrays;

public class InsertarTablaOrdenada2 {

    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 6, 7, 8, 9};
        Arrays.sort(numeros);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el numero para insertar en la tabla: ");
        int numeroInsertar = entrada.nextInt();
        int indice = Arrays.binarySearch(numeros, numeroInsertar);
        if (indice < 0) {
            indice = -Arrays.binarySearch(numeros, numeroInsertar)-1;
        }
        System.out.println("Indice-> " + indice);
        int[] numeroT = new int[numeros.length + 1];
        System.out.println("Tabla temporal-> " + Arrays.toString(numeroT));
        System.arraycopy(numeros, 0, numeroT, 0, indice);
        System.out.println("Tabla temporal-> " + Arrays.toString(numeroT));
        numeroT[indice] = numeroInsertar;
        System.out.println("Tabla insertando el nuevo numero -> " + Arrays.toString(numeroT));
        System.arraycopy(numeros, indice, numeroT, indice + 1,numeros.length-indice);
        numeros = numeroT;
        System.out.println("Tabla insertando el segundo tramo -> " + Arrays.toString(numeros));
    }
}

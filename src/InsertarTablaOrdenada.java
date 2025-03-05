import java.util.Scanner;
import java.util.Arrays;

public class InsertarTablaOrdenada {

    public static void main(String[] args) {

        int[] numeros={5,6,7,8,9,10,11,12,13,14,15,25,30,40};
        Arrays.sort(numeros);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero para insertar en la tabla: ");
        int numeroInsertar = entrada.nextInt();
        int indice=Arrays.binarySearch(numeros, numeroInsertar);
        //buscamos ese numero insertado con binarySearch()
        if(indice<0){ //no existe..calcula donde debe estar
            indice=-Arrays.binarySearch(numeros,numeroInsertar)-1; //genero en postitivo la posicion donde va
        }
        System.out.println("Indice-> "+ indice);
        //crear el array con una
        int[] numeroT=new int[numeros.length+1]; //la tabla temporal se crea con la longitud tabla original+1
        System.out.println("Tabla temporal-> " +Arrays.toString(numeroT));
        System.arraycopy(numeros,0,numeroT,0,indice);
        System.out.println("Tabla copiando el primer tramo-> " +Arrays.toString(numeroT));
        //insertamos el nuevo numero en el hueco
        numeroT[indice]=numeroInsertar;
        System.out.println("Tabla insertando el nuevo numero -> " +Arrays.toString(numeroT));
        //copiamos los elementos desplazados tras el hueco
        System.arraycopy(numeros,indice,numeroT,indice+1,numeros.length-indice);
        //copiamos a la tabla original
        numeros=numeroT;
        System.out.println("Tabla insertando el segundo tramo -> " +Arrays.toString(numeros));
    }
}

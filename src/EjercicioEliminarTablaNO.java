import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Crea una tabla de valores aleatorios dde 10 elementos 0-100 y luego solicita un número al usuario
 * y elimina los elementos menores al indicado por el usuario
 */



public class EjercicioEliminarTablaNO {
    public static void main(String[] args) {
        //1. Crea una tabla de 10 elementos aleatorios del 0-100
        int[]numeros=new int[10];
        for(int i=0;i<numeros.length;i++){
            numeros[i]=(int)(Math.random()*101);
        }
        System.out.println("");
        //2. Solicita al usuario un número
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indica un número del 0 al 100: ");
        int menosQue=entrada.nextInt();

        eliminarMenoresQue(numeros,menosQue);
    }
    static void eliminarMenoresQue(int[] tabla,int menorQue){
    int [] nueva=new int[tabla.length]; //donde voy a copiar los elementos que no sean menores que el numero
        nueva= Arrays.copyOf(tabla,tabla.length); //copio los valores de la original
    int i=0;
    while(i<nueva.length){
        if(tabla[i]<menorQue){ //verificamos que el valor del indice i sea menor que el valor que el usuario indique
            //si es menor, lo tenemos que eliminar de la tabla
            nueva[i]=nueva[nueva.length-1]; //copiamos el ultimo en la nueva tabla
            //decrementamos la longitud de nueva en 1... Elimina el último
            nueva=Arrays.copyOf(nueva,nueva.length-1);
            //se tiene que volver a verificar la tabla nueva[i]
        }else{
            i++; //nueva[i] se queda en la tabla
        }

    }
        System.out.println("El valor de la tabla es: "+Arrays.toString(nueva));

    }
}

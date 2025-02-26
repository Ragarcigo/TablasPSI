import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int edad[] = new int [5];
        edad[0] = 18; //indice 0
        edad[1] = 19;
        edad[2] = 20;
        edad[3] = 21;
        edad[4] = 22;
        //ya tengo la tabla completa
        /* fuera de indice! -> que la tabla solo tienes 5 posiciones, no puedo insertar una 6ta. posicion
         */
        //edad[5]=18; //fuera de rango
        for (int i = 0; i < edad.length; i++) { //nombreTabla.length -> me devuelve el tamaño de la tabla
            System.out.println(edad[i]);
        }
        System.out.println("Longitud: " +edad.length);
        //declara la variable "array", y darle los valores directamente
        String [] coches= {"Opel","Ford","BMW","Citroen","SEAT" };
        System.out.println(Arrays.toString(coches)); //muestra todos los elementos del array
       // for (int i = 0; i < edad.length; i++) {
       //     String edadT= JOptionPane.showInputDialog("Indica la Edad " +(i+1));
       //    edad[i]= Integer.parseInt(edadT);
       //  }
        System.out.println(Arrays.toString(coches));
        //Inicializacion de un Array
        int[] numeros = new int[10]; //se reserva el espacio de memoria
        numeros[7] = 18;
        System.out.println(Arrays.toString(numeros)); //0
        String apellidos []=new String[8];
        apellidos[3]="Díaz";
        System.out.println(Arrays.toString(apellidos)); //null
        boolean decision[]=new boolean[6];
        decision[5]=true;
        System.out.println(Arrays.toString(decision)); //false
        //lee desde la consola, los 10 numeros del "Array(numeros)"
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            numeros[i]++;
        }
        //lee desde la consola, los 8 numeros del "Array(apellidos)"
        System.out.println("Ingrese 8 apellidos:");
        for (int i = 0; i < apellidos.length; i++) {
            System.out.println(apellidos[i]);
            apellidos[i] = new Scanner(System.in).nextLine();

        }
        //lee desde la consola, los 6 numeros del "Array(booleano)"
        for (int i = 0; i < decision.length; i++) {
            System.out.println(decision[i]);
            decision[i]=false;

            //3 bucles for

            System.out.println(Arrays.toString(numeros));
            System.out.println(Arrays.toString(apellidos));
            System.out.println(Arrays.toString(decision));
        }
        }

        }



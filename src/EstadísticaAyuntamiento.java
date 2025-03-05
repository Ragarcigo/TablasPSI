/*El ayuntamiento de tu localidad te ha encargado una aplicación que ayude a
realizar en-cuestas estadísticas para conocer el nivel adquisitivo de los
habitantes del municipio. Para ello, tendrás que preguntar el sueldo a cada persona encuestada.
A priori, no conoces el número de encuestados. Para finalizar la entrada de datos,
introduce un sueldo con va-lor −1.Una vez terminada la entrada de datos,
muestra la siguiente información:  Todos los sueldos introducidos ordenados de forma decreciente.
El sueldo máximo y mínimo. La media de los sueldos. */


import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class EstadísticaAyuntamiento {
    public static void main(String[] args) {
        double[] sueldos=new double[0];
        double sueldoH=0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Ingrese su sueldo: [-1] para salir ");
            sueldoH=sc.nextDouble();
            if (sueldoH>0){
                sueldos= Arrays.copyOf(sueldos, sueldos.length+1); //insertamos una posicion en el array
                sueldos[sueldos.length-1]=sueldoH;
            }
        }while(sueldoH!=-1);
        //comprobamos como va la estadística
        System.out.println("Sueldos de la tabla: "+Arrays.toString(sueldos));
        //Ordeno la tabla...
        Arrays.sort(sueldos);
        //Muestro de forma decreciente
        for(int i=sueldos.length-1;i>=0;i--){
            System.out.print(sueldos[i] + " ");
        }
        System.out.println(" ");
        //sueldo maximo
        System.out.println("Mayor sueldo de los habitantes : " +sueldos[sueldos.length-1]);
        //sueldo menor
        System.out.println("Menos sueldo de los habitantes : " +sueldos[0]);

        //sumar todos los sueldos
        double aux=0;
        for(double s:sueldos){
            aux=aux+s;
        }
        System.out.println("La suma de todos los sueldos es: "+aux);
        DecimalFormat formato=new DecimalFormat("#.###");
        double aux2=aux;
        aux/=sueldos.length;
        //media de los sueldos
        //redondeo y
        System.out.println("La media de los sueldos es: "+ formato.format(aux));
        System.out.println("La media de los sueldos es: "+ String.format("%.3f",(aux2/sueldos.length)));
        System.out.println("La media de los sueldos es: "+ Math.round(aux*1000.0)/1000.0);



    }



}

import java.util.Arrays;

public class ArrayBidi {
    public static void main(String[] args) {
        int[][] miArray= new int[5][4];
        for(int i=0; i<5; i++){ //filas
            for(int j=0; j<4; j++){ //columnas
                miArray[i][j]=(int)(Math.random()*100);
                System.out.print(miArray[i][j]+" ");
            }
            System.out.println("");
        }
    }
}

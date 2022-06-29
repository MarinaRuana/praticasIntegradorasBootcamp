package praticaIntegradoraArrays;

public class Arrays {
    public static void main(String[] args) {

        int [][] matriz =  new int[3][4];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j ++) {
                matriz[i][j] = i + j;
            }
        }

        for (int[] ints : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}

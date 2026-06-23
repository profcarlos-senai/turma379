public class MainMatriz {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        // encha a matriz com as tabuadas de 1 a 10
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                matriz[i][j] = (i+1)*(j+1);
            }
        }

        // imprime o cabeçalho da tabuada
        System.out.printf("     ");
        for(int i=0; i<10; i++){
            System.out.printf("%2d ",i+1);
        }
        System.out.println();
        System.out.println("-".repeat(35));
        // imprime a matriz da tabuada
        for(int i=0; i<10; i++){
            System.out.printf("%2d | ", i+1);
            for(int j=0; j<10; j++){
                System.out.printf("%2d ",matriz[i][j]);
            }
            System.out.println();
        }
    }

}

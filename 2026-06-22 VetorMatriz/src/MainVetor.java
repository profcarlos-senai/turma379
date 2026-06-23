public class MainVetor {
    public static void main(String[] args) {
        // um jeito de declarar um vetor
        int[] meses = {31,28,31,30,31,30,31,31,30,31,30,31};

        // outro jeito
        int tamanho = 5;
        int[] numeros = new int[tamanho];
        numeros[0] = 1;
        numeros[1] = 8;
        numeros[2] = 4;
        numeros[3] = 5;
        numeros[4] = 99;

        // posso vasculhar vetores desse jeito
        System.out.println("Comprimento dos meses");
        for(int i=0; i<meses.length; i++){ // .length é o tamanho do vetor
            System.out.print(meses[i]+" ");
        }
        System.out.println();

        // também posso vasculhar desse jeito
        int soma = 0;
        for(int valor: numeros){ // coloque cada número em valor e rode o loop
            soma += valor;
        }
        System.out.println("Soma dos numeros: "+soma);


    }
}

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Coisa3 {
    public static void main(String[] args) {
        double numeroDouble = 1234.99;

        // só consigo jogar um double num int se converter
        int numeroInteiro = (int)numeroDouble;
        System.out.println("Outro: "+numeroInteiro);

        // posso jogar int dentro de double sem problema
        numeroDouble = numeroInteiro;
        System.out.println("Numero: "+numeroDouble);

        int ovos = 23;
        int duzias = 23/12;
        System.out.println(ovos+" ovos é igual a "+duzias+" duzias");


        // cálculos com inteiro produzem inteiros
        numeroDouble = ovos/12;
        System.out.println("23/12 jogado num double: "+numeroDouble);

        // se eu quero que uma divisão de inteiros dê casa decimal
        // precisa converter pra double no cálculo
        numeroDouble = (double)ovos/12;
        System.out.println("23/12 convertido double: "+numeroDouble);

        // valores double tem que ter o ponto, senão é int
        numeroDouble = 23/12.0;
        System.out.println("23/12.0 : "+numeroDouble);

        // também dá pra botar 'd'
        numeroDouble = 23/12d;
        System.out.println("23/12d : "+numeroDouble);

        // também dá pra arredondar
        double arredonda = Math.round(numeroDouble);
        double arredCima = Math.ceil(numeroDouble);
        double arredBaixo = Math.floor(numeroDouble);


        System.out.println("arredonda: "+arredonda);
        System.out.println("arredCima: "+arredCima);
        System.out.println("arredBaixo: "+arredBaixo);


        // arredondar com 1 casa
        arredonda = Math.round(numeroDouble*10.0)/10.0;
        arredCima = Math.ceil(numeroDouble*10.0)/10.0;
        arredBaixo = Math.floor(numeroDouble*10.0)/10.0;

        System.out.println("arredonda 1 casa: "+arredonda);
        System.out.println("arredCima 1 casa: "+arredCima);
        System.out.println("arredBaixo 1 casa: "+arredBaixo);


        // arredondar com 2 casas
        arredonda = Math.round(numeroDouble*100.0)/100.0;
        arredCima = Math.ceil(numeroDouble*100.0)/100.0;
        arredBaixo = Math.floor(numeroDouble*100.0)/100.0;

        System.out.println("arredonda 2 casa: "+arredonda);
        System.out.println("arredCima 2 casa: "+arredCima);
        System.out.println("arredBaixo 2 casa: "+arredBaixo);

        double nota1 = 5.999;
        double nota2 = 6.0;
        double media = (nota1 + nota2) / 2;
        if(media >= 6){
            System.out.println("Aprovado - media: "+media);
        } else{
            System.out.println("Reprovado - media: "+media);
        }

        // existe um tipo chamado BigDecimal que tem casas fixas
        // e vários modos chatos de arredondamento
        BigDecimal notaD1 = new BigDecimal(nota1).setScale(1, RoundingMode.HALF_UP);
        BigDecimal notaD2 = new BigDecimal(nota2).setScale(1, RoundingMode.HALF_UP);
        BigDecimal mediaD1 = (notaD1.add(notaD2)).divide(new BigDecimal(2), RoundingMode.HALF_UP);
        System.out.println("mediaD1: "+mediaD1);
    }
}

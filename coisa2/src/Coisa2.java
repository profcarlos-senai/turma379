public class Coisa2 {
    public static void main(String[] args) {
        float numero1 = 123456.765432123456789f;
        double numero2 = 123456.765432123456789;

        System.out.println("Numero 1: " + numero1);
        System.out.println("Numero 2: " + numero2);

        numero1 = 0.1f;
        numero2 = 0.1d;

        System.out.printf("Numero 1: %.20f\n", numero1);
        System.out.printf("Numero 2: %.20f\n ", numero2);
    }
}

public class Xuxu {
    public static void main(String[] args) {
        Carro carro = new Carro("AAA","BBBBBBBBB");
        System.out.println("HASH DO CARRO AAA: "+carro.hashCode());
        carro = new Carro("XXX","asdasdasdasd asd");
        System.out.println("HASH DO CARRO XXX: "+carro.hashCode());
    }
}

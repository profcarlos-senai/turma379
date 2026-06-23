import java.time.LocalDateTime;
import java.util.ArrayList;

public class OutroArrayList {
    public static void main(String[] args) {
        ArrayList coisas = new ArrayList();
        coisas.add(123);
        coisas.add("Juca da Silva");
        coisas.add(LocalDateTime.now()); // data e hora atual
        coisas.add(new Carro("ABC-1234","José da Silva"));

        for(int i=0; i<coisas.size();i++){ // size quer dizer tamanho
            System.out.println(coisas.get(i));
        }

        // outro jeito
        System.out.println("\nOUTRO JEITO:\n");
        for(Object objeto: coisas){
            System.out.println(objeto);
        }
    }
}

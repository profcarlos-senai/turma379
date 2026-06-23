import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public class MainString1 {
    public static void main(String[] args) {
        String coisa = "ABC#123#3.45#Juca#2026-06-22#14:40:33.1234";
        String[] pedacos = coisa.split("#");
        for(int i = 0; i < pedacos.length; i++){
            System.out.println(pedacos[i]);
        }

        try {
            double valor = Double.parseDouble(pedacos[2]);
            System.out.println("Valor: "+valor);

            LocalDate data = LocalDate.parse(pedacos[4]);

            LocalDateTime hora = LocalTime.parse(pedacos[5]).atDate(data);
            System.out.println("Data e Hora: "+hora);

        }catch (DateTimeParseException e){
            System.out.println("Erro no formato da data");
        }
    }
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainAnimal {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost/zoologico";
        String usuario = "postgres";
        String senha = "postgres";

        try (
                Connection conexao = DriverManager.getConnection(url, usuario, senha);
                Statement comando = conexao.createStatement();
                ResultSet resultado = comando.executeQuery("SELECT * FROM Animal;")
        ) {

            while (resultado.next()) {

                int id = resultado.getInt("id");
                String nome = resultado.getString("nome");
                String especie = resultado.getString("especie");
                String sexo = resultado.getString("sexo");
                int idade = resultado.getInt("idade");
                double peso = resultado.getDouble("peso");
                String paisOrigem = resultado.getString("pais_origem");
                String dataChegada = resultado.getString("data_chegada");
                boolean carnivoro = resultado.getBoolean("carnivoro");

                System.out.printf(
                        "%2d | %-10s | %-20s | %s | %2d anos | %6.1f kg | %-20s | %s | %s%n",
                        id,
                        nome,
                        especie,
                        sexo,
                        idade,
                        peso,
                        paisOrigem,
                        dataChegada,
                        carnivoro ? "Sim" : "Não"
                );
            }

        } catch (SQLException e) {
            System.out.println("Erro ao acessar o banco de dados.");
            e.printStackTrace(); // imprime aquele treco vermelho
        }
    }
}
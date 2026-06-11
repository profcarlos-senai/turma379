public class Main {
    static void main(String[] args) {
        // cria um conta
        ContaBancaria minhaConta = new ContaBancaria();

        // cria um menu para lidar com essa conta
        MenuBanco meuMenu = new MenuBanco(minhaConta);

        // mostra o menu
        meuMenu.mostraMenu();
    }
}

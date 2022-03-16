public class AppBanco {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1020);
        p1.setDono("João da Silva");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2030);
        p2.setDono("Maria da Silva");
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(500);

        p1.sacar(50);
        p2.sacar(100);

        p1.sacar(100);
        p1.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();


    }
}

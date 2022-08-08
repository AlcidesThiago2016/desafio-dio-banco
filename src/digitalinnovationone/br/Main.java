package digitalinnovationone.br;

public class Main {
    public static void main(String[] args) {

        Cliente alcides = new Cliente();
        alcides.setNome("Alcides");

        Conta cc = new ContaCorrente(alcides);
        Conta poupanca = new ContaPoupanca(alcides);

        cc.depositar(100);
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}

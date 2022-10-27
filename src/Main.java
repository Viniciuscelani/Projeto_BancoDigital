public class Main {
    public static void main(String[] args) {
        Cliente vinicius = new Cliente();
		vinicius.setNome("Vinicius");
        Banco vcm = new Banco();
        vcm.setNome("VCM");
		
		Conta cc = new ContaCorrente(vinicius, vcm);
		Conta poupanca = new Contapoupanca(vinicius, vcm);

		cc.depositar(200);
		cc.transferir(50, poupanca);
		
		cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}

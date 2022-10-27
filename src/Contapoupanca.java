public class Contapoupanca extends Conta{

    public Contapoupanca(Cliente cliente, Banco banco) {
		super(cliente, banco);
	}
    
    @Override
    public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}

}

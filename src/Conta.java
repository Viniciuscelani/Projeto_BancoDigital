public abstract class Conta implements InterConta {

    private static final int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAL = 1;
    
    
    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;
    protected Banco banco;

    

    public Conta(Cliente cliente, Banco banco) {
        this.agencia = Conta.AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
        this.banco = banco;
    }

    @Override
    public void sacar(double valor){
        saldo -= valor;
    }

    @Override
    public void depositar(double valor){
        saldo += valor;
    }

    @Override
    public void transferir(double valor, InterConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Nome do Banco: %s", this.banco.getNome()));
		System.out.println(String.format("Titular da Conta: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia Bancaria: %d", this.agencia));
		System.out.println(String.format("Numero da Conta: %d", this.numeroConta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

    
    
}

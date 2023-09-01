package ModuloNoveConstrutoresPalavraThisSobrecargaEncapsulamento;

public class Conta {
	
	private String nome;
	private int numero;
	private double saldo;
	
	public Conta (String nome, int numero, double depositoInicial) {
		super();
		this.nome = nome;
		this.numero = numero;
		deposito(depositoInicial);
		
	}

	public Conta (String nome, int numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	} 

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito (double deposito) {
		saldo += deposito;
		 
	}
	
	public void saque(double saque) {
		saldo -= saque + 5;
	}

	
	public String toString() {
		return "Nome Titular: " 
				+ nome 
				+ " / " 
				+ " Numero da Conta: " 
				+ numero 
				+ " / " 
				+ " Saldo da Conta: "
				+ String.format("%.2f", saldo);
	}
	
	
	
}

package ModuloNoveConstrutoresPalavraThisSobrecargaEncapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class aplication {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta;

		System.out.print("Nome do Titular da Conta: ");
		String nome = sc.nextLine();

		System.out.print("Numero da conta: ");
		int numero = sc.nextInt();
		
		
		System.out.println("Deseja fazer um deposito Incial: ");
		char response = sc.next().charAt(0);
		if (response == 's') {
			
			System.out.print("Valor do Deposito Inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(nome, numero, depositoInicial);
			
		}
		else {
			conta = new Conta(nome, numero);
		}
		System.out.println(conta);
		System.out.println();
		
		System.out.print("Valor do Novo Deposito: ");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		System.out.println(conta);
		System.out.println();
		
		
		System.out.print ("Valor do saque: ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.println(conta);
		System.out.println();
		
		sc.close();

	}

}

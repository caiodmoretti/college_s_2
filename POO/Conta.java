package aula_1;
import java.util.Scanner;

public class Conta {
	private String nome ;
	public int numero_da_conta = 0;
	private double saldo = 0;
public void editar_conta() {
	Scanner entrada_pelo_teclado = new Scanner(System.in);
	System.out.println("Informe o nome do responsável:");
	String nome = entrada_pelo_teclado.nextLine();
	this.nome = nome;
	this.numero_da_conta += 1;
	System.out.println("O nome foi atualizado.");
	System.out.println("O número de sua conta é: " + this.numero_da_conta);
	}
public void verificar_saldo() {
	System.out.println(this.saldo);
	}
public void depositar(double valor) {
	this.saldo += valor;
	System.out.println("Depósito realizado.");
	System.out.println(this.nome + " possui um saldo de R$ " + this.saldo);
	}
public void sacar(double valor){
	if(this.saldo >= valor) {
		this.saldo -= valor;
		System.out.println(	"Saque realizado.");
		System.out.println(this.nome + " possui um saldo de R$ " + this.saldo);
	}
	else{
		System.out.println("Saldo insuficiente.");
	}
  }
public void transferir(double valor, Conta conta_destino) {
	if(this.saldo < valor) {
		System.out.println("Saldo insuficiente.");
	}
	else {
		this.saldo -= valor;
		conta_destino.saldo += valor;
		System.out.println("O saldo de "+ this.nome + " agora é R$ " + this.saldo);
		System.out.println("O saldo de "+ conta_destino.nome + " agora é R$ " + conta_destino.saldo);
		}
	}
}



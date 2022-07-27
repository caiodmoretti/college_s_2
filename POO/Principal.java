/*Prática
 Programe um sistema bancário simples com as seguintes funcionalidades:
 - Criar conta;
 - Operar conta (verificar saldo, realizar saque, realizar depósito, realizar transferência para outra conta;
 * */

package aula_1;


import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner entrada_pelo_teclado = new Scanner(System.in);

		double valor = 0;
		int numero_da_conta =0;
		int opcao;
		do{
            System.out.println("Informe a operação:");
            System.out.println("0 - Criar conta");
            System.out.println("1 - Editar informações da conta");
            System.out.println("2 - Verificar saldo");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");            
            System.out.println("5 - Transferir");
            System.out.println("6 - Encerrar");
            opcao = entrada_pelo_teclado.nextInt();
            switch (opcao){
        	case 0:	Conta obj = new Conta(); 
        		numero_da_conta += 1;
        			break;            
            	case 1: Conta.editar_conta();     
            			break;
            	case 2:	Conta.verificar_saldo();
            			break;
            	case 3: System.out.println("Informe o valor do depósito: ");
            			valor = entrada_pelo_teclado.nextDouble();
            			Conta.depositar(valor);
            			break;
            	case 4: System.out.println("Informe o valor do saque: ");
        				valor = entrada_pelo_teclado.nextDouble();
        				Conta.sacar(valor);
        				break;
            	case 5: System.out.println("Informe o valor da transferência: ");
        				valor = entrada_pelo_teclado.nextDouble();
        				Conta.transferir(valor, conta_02);
            			break;	
            	case 6: System.out.println("Programa encerrado.");
            }
		}
         while(opcao != 6);  
 }
}


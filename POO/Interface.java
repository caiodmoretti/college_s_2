package aula_1;

import java.util.Scanner;

public class Interface {
	int opcao;


public void seletor(int opcao){
	int numero_conta = 0;
}
	Scanner entrada_pelo_teclado = new Scanner(System.in);
    System.out.println("1 - Criar conta.");
    System.out.println("2 - Saldo");
    System.out.println("3 - Deposito");
    System.out.println("4 - Saque");            
    System.out.println("4 - Transferência");     
    System.out.println("0 - Sair do programa");
	opcao = entrada_pelo_teclado.nextInt();
	do {
		 switch (opcao){
         case 1: System.out.println("Informe o nome:");
          = entrada_pelo_teclado.nextLine();
	}
	while (opcao != 0);

	
	}

}

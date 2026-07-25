import java.util.Scanner;

public class ExerciciosRepeticao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcao = -1;
		
		System.out.println("\n=================================");
		System.out.println("      MENU DE EXERCÍCIOS        ");
		System.out.println("=================================");
		System.out.println("1  - Crescimento Comparativo de Altura");
        System.out.println("2  - Soma de Números Pares em Intervalo");
        System.out.println("3  - Verificação de Número Primo");
        System.out.println("4  - Sistema de Autenticação por Senha");
        System.out.println("5  - Sistema de Controle de Multas de Trânsito");
        System.out.println("0  - Sair do Programa");
        System.out.println("---------------------------------");
        System.out.print("Escolha uma opção: ");
        
        opcao = sc.nextInt();
        
        switch (opcao){
    	case 1:
    		ex1(sc);
    		break;
    	case 2:
    		ex2(sc);
    		break;
    	case 3:
    		ex3(sc);
    		break;
    	case 4:
    		ex4(sc);
    		break;
    	case 5:
    		ex5(sc);
    		break;
    	case 0:
    		System.out.println("Programa encerrado.");
    		break;
    	default:
    		System.out.println("Opcão inválida. Tente novamente.");
    		break;
    }
		
		
		sc.close();
	}
	
	public static void ex1(Scanner sc) {
		System.out.println("\n=== Exercício 1 ===");
		
		double chico = 150;
		double juca = 110;
		int ano = 0;
		
		while (juca <= chico) {
			chico += 2;
			juca += 3;
			ano++;
		}
		
		System.out.println("Juca fica mais alto que Chico em " + ano + " anos.");
	}
	
	public static void ex2(Scanner sc) {
		System.out.println("\n=== Exercício 2 ===");
		
		int inf = 3;
		int sup = 12;
		int soma = 0;
		
		
		for (int i = inf; i < sup; i++) {
			if (i %2==0) {
				System.out.println(i);
				soma = soma  + i;
			}
		}
		System.out.println("Soma = " +soma);
	}
	
	public static void ex3(Scanner sc) {
		System.out.println("=== Exercício 3 ===");
		
		System.out.println("Insira um número: ");
		int numero = sc.nextInt();
		
		boolean eh_primo = true;
		
		if (numero <= 1) {
			eh_primo = false;
		} else {
			for (int i = 2; i < numero; i++) {
				if (numero % i == 0) {
					eh_primo = false;
					break;
				}
			}
		}
		if (eh_primo) {
	        System.out.println(numero + " é um número primo.");
	    } else {
	        System.out.println(numero + " NÃO é um número primo.");
	    }
		
	}
	
	public static void ex4(Scanner sc) {
		System.out.println("\n=== Exercício 4 ===");
		
		int senha = 1234;
		int contador = 0;
		boolean acertou = false;
		
		while (contador <3 && !acertou) {
			System.out.println("Insira a senha numérica (Tentativa " + (contador + 1) + " de 3): ");
			int tentativa = sc.nextInt();
			if (tentativa == senha) {
				System.out.println("Acesso permitido.");
				acertou = true;
			} else {
				System.out.println("Acesso negado.");
				contador++;
			}
		}
		if (!acertou) {
			System.out.println("Acesso bloqueado.");
		}
	}
	
	public static void ex5(Scanner sc) {
		System.out.println("\n=== Exercício 5 ===");
		
		double totalArrecadado = 0;
		
		int maiorNumeroMultas = 0;
		int carteiraMaiorNumeroMultas = 0;
		
		boolean continuar = true;
		
		while (continuar) {
			System.out.println("\nInsira o número da carteira do motorista: ");
			int numeroCarteira = sc.nextInt();
			System.out.println("Insira a quantidade de multas desse motorista: ");
			int qtdeMultas = sc.nextInt();
			
			double divida = 0;
			
			for (int i = 1; i <= qtdeMultas; i++) {
				System.out.println("Insira o valor da multa " + i + ": ");
				double valorMulta = sc.nextDouble();
				divida += valorMulta;
			}
			
			System.out.printf("\nDívida do motorista %d: R$ %.2f%n", numeroCarteira, divida);
			
			totalArrecadado += divida;
			
			if (qtdeMultas > maiorNumeroMultas) {
				maiorNumeroMultas = qtdeMultas;
				carteiraMaiorNumeroMultas = numeroCarteira;
			} 
			
			System.out.println("\nDeseja cadastrar outro motorista?");
			System.out.println("1 - Sim");
			System.out.println("0 - Não (Sair)\n");
			int opcao = sc.nextInt();
			
			if (opcao == 0) {
				System.out.println("Programa encerrado.");
				continuar = false;
			} else if (opcao != 1) {
				System.out.println("Opção inválida.");
			}
		}
		
		System.out.println("\n==== RELATÓRIO ====");
		System.out.printf("Total arrecadado: R$ %.2f%n",  totalArrecadado);
		System.out.println("Carteira com maior número de multas: " + carteiraMaiorNumeroMultas);
		System.out.println("Quantidade de multas: " + maiorNumeroMultas);
	}

}

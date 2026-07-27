import java.util.Scanner;

public class ExerciciosLista {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcao;

		do {
			System.out.println("\n=================================");
			System.out.println("== MENU DE EXERCÍCIOS - ARRAYS ==");
			System.out.println("=================================");
			System.out.println("1 - Média de Ímpares em Vetor");
			System.out.println("2 - Contador de idades +35 anos em Vetor");
			System.out.println("3 - Soma, Contagem e Média Condicional em Vetor");
			System.out.println("4 - Controle de Locações de DVDs e Bônus de Cliente em Vetor");
			System.out.println("0 - Sair do programa");
	        System.out.println("---------------------------------");
	        System.out.println("Escolha uma opção: ");
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
			case 0:
				System.out.println("Programa encerrado.");
				break;
			default:
				System.out.println("Opção inválida! Tente novamente.");
				break;
			}
			
		} while (opcao != 0);
		
		
		sc.close();
	}
	
	public static void ex1(Scanner sc) {
		System.out.println("\n=== Exercício 1 ===");
		
		int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int qtdeNumeros = numeros.length;
		
		int somaNumeros = 0;
		
		for (int i = 0; i < qtdeNumeros; i++) {
			if (numeros[i] % 2 != 0) {
				somaNumeros += numeros[i];
			}
		}
		
		double media = (double) somaNumeros/qtdeNumeros;
		
		System.out.printf("A média de números ímpares dessa lista é: %.2f%n", media);
	}
	
	public static void ex2(Scanner sc) {
		System.out.println("\n=== Exercício 2 ===");
		
		int idades[] = new int[10];
		int qtdePessoasSup35 = 0;
		
		System.out.println("Inserção de 10 idades");
		
		for (int i = 0; i < idades.length; i++) {
			
			System.out.printf("Insira a idade %d: ", i+1);
			idades[i] = sc.nextInt();
			
			if (idades[i] > 35) {
				qtdePessoasSup35++;
			}
			
		}
		System.out.println("\nA quantidade de pessoas com idade superior a 35 é: " + qtdePessoasSup35);	
	}
	
	public static void ex3(Scanner sc) {
		System.out.println("\n=== Exercício 3 ===");
		
		int A[] = {15, 16, 15, 14, 12, 13, 17, 18, 19, 11};
		int qtdeA = A.length;
		int somaAInf15 = 0;
		int qtdeAIgual15 = 0;
		int somaASup15 = 0;
		int qtdeASup15 = 0;
		
		for (int i = 0; i < qtdeA; i++) {
			if (A[i] < 15) {
				somaAInf15 += A[i];
			}else if(A[i] == 15) {
				qtdeAIgual15++;
			} else {
				somaASup15 += A[i];
				qtdeASup15++;
			}
		}
		double mediaASup15 = (double) somaASup15/qtdeASup15;
		
		System.out.printf("\nA soma de elementos armazenados neste vetor que são inferiores a 15: %d%n", somaAInf15);
		System.out.printf("A quantidade de elementos armazenados no vetor que são iguais a 15: %d%n", qtdeAIgual15);
		System.out.printf("A média dos elementos armazenados no vetor que são superiores a 15: %.2f%n", mediaASup15);	
	}
	
	public static void ex4(Scanner sc) {
		
		sc.nextLine();
		
	    System.out.println("\n=== Exercício 4 ===");
	    
	    String clientes[] = new String[5];
	    int DVDsLocados[] = new int[5];
	    int qtdeLocacaoGratis[] = new int[5];
	    int qtdeClientes = clientes.length;
	    
	    System.out.println("Inserção de 5 clientes e a quantidade de DVDs locados em 2022 (a cada 10 locações o cliente tem direito a uma locação grátis).");
	    
	    for (int i = 0; i < qtdeClientes; i++) {
	        System.out.printf("Insira o nome do cliente %d: ", i + 1);
	        clientes[i] = sc.nextLine();
	        
	        System.out.printf("Insira a quantidade de DVDs locados de %s: ", clientes[i]);
	        DVDsLocados[i] = Integer.parseInt(sc.nextLine());
	        
	        qtdeLocacaoGratis[i] = DVDsLocados[i] / 10;
	    }
	    
	    System.out.printf("%-20s | %-18s | %-24s%n", "CLIENTE", "QTDE DE LOCAÇÕES", "QTDE DE LOCAÇÕES GRÁTIS");
	    System.out.println("-----------------------------------------------------------------------");

	    for (int i = 0; i < qtdeClientes; i++) {
	        System.out.printf("%-20s | %-18d | %-24d%n", clientes[i], DVDsLocados[i], qtdeLocacaoGratis[i]);
	    }
	}

}

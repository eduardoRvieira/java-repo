import java.util.Scanner;

public class ExerciciosLista {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcao;

		do {
			System.out.println("\n=================================");
			System.out.println("== MENU DE EXERCÍCIOS - ARRAYS ==");
			System.out.println("=================================");
			System.out.println("1 - Média de Ímpares");
			System.out.println("2 - Contador de idades +35 anos");
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
		
		int numeros[] = {1, 2, 3, 41};
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

}

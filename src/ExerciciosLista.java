import java.util.Scanner;

public class ExerciciosLista {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcao;

		do {
			System.out.println("=================================");
			System.out.println("== MENU DE EXERCÍCIOS - ARRAYS ==");
			System.out.println("=================================");
			System.out.println("1 - Média de Ímpares");
			System.out.println("0 - Sair do programa");
	        System.out.println("---------------------------------");
	        System.out.println("Escolha uma opção: ");
			opcao = sc.nextInt();
			
			switch (opcao){
			case 1:
				ex1(sc);
				break;
			case 0:
				System.out.println("Programa encerrado.");
				break;
			default:
				System.out.println("Opção inválida! Tente novamente.");
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

}

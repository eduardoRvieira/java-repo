import java.util.Scanner;

public class ExerciciosLista {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcao;

		do {
			System.out.println("=================================");
			System.out.println("MENU DE EXERCÍCIOS - ARRAYS");
			System.out.println("=================================");
			System.out.println("1 - Média de Ímpares");
			System.out.println("1 - Sair");
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
	}

}

import java.util.Scanner;

public class ExerciciosDecisao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ex1(sc);
		ex2(sc);
	}
	
	public static void ex1(Scanner sc) {
		System.out.println("=== Exercício 1 ===");
		
		System.out.println("Insira um número inteiro para verificar se é par ou ímpar: ");
		int n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("O número é par.");
		}
		else {
			System.out.println("O número é ímpar.");
		}
	}
	
	public static void ex2(Scanner sc) {
		System.out.println("=== Exercício 2 ===");
		
		System.out.println("Insira a idade (em anos) do nadador para saber sua categoria: ");
		int idade = sc.nextInt();
		
		if (idade <= 7) {
			System.out.println("Categoria Infantil A");
		}
		else if (idade <= 10) {
			System.out.println("Categoria Infantil B");
		}
		else if (idade <= 13) {
			System.out.println("Categoria Juvenil A");
		}
		else if (idade <= 17) {
			System.out.println("Categoria Juvenil B");
		}
		else {
			System.out.println("Categoria Adulto");
		}
	}

}

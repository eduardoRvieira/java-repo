import java.util.Scanner;

public class ExerciciosDecisao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ex1(sc);
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

}

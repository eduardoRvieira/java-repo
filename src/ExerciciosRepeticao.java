import java.util.Scanner;

public class ExerciciosRepeticao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ex1(sc);
		ex2(sc);
		
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
		System.out.println("=== Exercício 2 ===");
		
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

}

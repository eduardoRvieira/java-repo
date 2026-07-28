import java.util.Scanner;

public class ExerciciosRepeticao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ex1();
		ex2();
		ex3();
		
		sc.close();
	}
	
	public static void ex1() {
		System.out.println("\n=== Exercício 1 ===");
		
		int contador = 0;
		int n = 0;
		
		for (int i = 1001; i > 1000; i++) {
			if (i % 11 == 5){
				contador++;
			}
			if (contador == 5) {
				n = i;
				break;
			}
			
		}
		
		System.out.println(n);	
	}
	
	public static void ex2() {
		System.out.println("\n=== Exercício 2 ===");
		
		int paisA = 80000;
		int paisB = 200000;
		int anos = 0;
		
		while (paisA < paisB) {
			paisA += paisA * 0.03;
			paisB += paisB * 0.015;
			anos++;
		}
		
		
		System.out.printf("O país A ultrapassa ou iguala a população do país B em %d anos.", anos);
	}
	
}

import java.util.Scanner;

public class ExerciciosRevisao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		 ex1(sc);
		 
		 sc.close();
	}
	
	public static void ex1(Scanner sc) {
		System.out.println("=== Exercício 1 ===");
		
		System.out.println("Insira o primeiro cateto: ");
		double a = sc.nextDouble();
		System.out.println("Insira o segundo cateto: ");
		double b = sc.nextDouble();
		
		double hipotenusa = Math.sqrt((a * a) + (b * b));
		
		System.out.println("A hipotenusa é: " + hipotenusa);
	}
	
	public static void ex2(Scanner sc) {
		System.out.println("=== Exercício 2 ===");
		
		System.out.println("Insira o lado do triângulo: ");
		double l = sc.nextDouble();
		
		double area = l*l;
		
		System.out.println("A área do quadrado é: " + area);
	}

}

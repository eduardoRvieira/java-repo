import java.util.Scanner;

public class ExerciciosRevisao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		 ex1(sc);
		 ex2(sc);
		 ex3(sc);
		 ex4(sc);
		 ex5(sc);
		 ex6(sc);
		 
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
		System.out.println("\n=== Exercício 2 ===");
		
		System.out.println("Insira o lado do quadrado: ");
		double l = sc.nextDouble();
		
		double area = l*l;
		
		System.out.println("A área do quadrado é: " + area);
	}
	
	public static void ex3(Scanner sc) {
	    System.out.println("\n=== Exercício 3 ===");

	    int quantidadeAcoes = 1000;
	    double precoCompra = 32.87;
	    double precoVenda = 33.92;
	    double taxaCorretagem = 0.02;

	    double valorCompra = quantidadeAcoes * precoCompra;
	    double corretagemCompra = valorCompra * taxaCorretagem;

	    double valorVenda = quantidadeAcoes * precoVenda;
	    double corretagemVenda = valorVenda * taxaCorretagem;

	    double lucroFinal = valorVenda - valorCompra - corretagemCompra - corretagemVenda;

	    System.out.println(
	            "No mês passado, José comprou e vendeu algumas ações das Lojas Pedroso S.A.\n" +
	            "Foram compradas " + quantidadeAcoes + " ações por R$ " + precoCompra + " cada."
	    );

	    System.out.println(
	            "Na compra foi cobrada uma taxa de corretagem de 2%."
	    );

	    System.out.println(
	            "Duas semanas depois, José vendeu todas as ações por R$ " +
	            precoVenda + " cada."
	    );

	    System.out.printf("Valor pago pelas ações: R$ %.2f%n", valorCompra);
	    System.out.printf("Corretagem da compra: R$ %.2f%n", corretagemCompra);
	    System.out.printf("Valor recebido pela venda: R$ %.2f%n", valorVenda);
	    System.out.printf("Corretagem da venda: R$ %.2f%n", corretagemVenda);
	    System.out.printf("Lucro final: R$ %.2f%n", lucroFinal);
	}
	
	public static void ex4(Scanner sc) {
		System.out.println("\n=== Exercício 4 ===");
		int tempo1 = 5;
		int tempo2 = 8;
		int tempo3 = 12;
		
		System.out.println("Insira a velocidade para cálculo de distância (em km/h): ");
		double velocidade = sc.nextDouble();
		
		double distancia1 = tempo1 * velocidade; 
		double distancia2 = tempo2 * velocidade; 
		double distancia3 = tempo3 * velocidade; 
		
		System.out.println("A distância que o carro percorrerá em 5 horas é de: " + distancia1 + "km");
		System.out.println("A distância que o carro percorrerá em 8 horas é de: " + distancia2 + "km");
		System.out.println("A distância que o carro percorrerá em 12 horas é de: " + distancia3 + "km");
		
	}
	
	public static void ex5(Scanner sc) {
		System.out.println("\n=== Exercício 5 ===");
		
		double a = 2;
		double b = 3;
		double c = 8;
		double d = 1;
		double e = -2;
		double f = -3;
		
		double g = (a*e)-(b*d);
		
		if (g == 0) {
		    System.out.println("O sistema não possui solução única.");
		} else {
		    double x = ((c * e) - (b * f)) / g;
		    double y = ((a * f) - (c * d)) / g;

		    System.out.println("x = " + x);
		    System.out.println("y = " + y);
		    double formula1 = (a*x) + (b*y);
		    double formula2 = (d*x) + (e*y);
		    System.out.println(formula1);
		    System.out.println(formula2);
		}
	}
	
	public static void ex6(Scanner sc) {
		System.out.println("\n=== Exercício 6 ===");
		
		System.out.println("Insira a área de um terreno (em m2): ");
		double area = sc.nextDouble();
		
		double m2_por_acre = 4046.86;
		double ft2_por_acre = 43560;
		double hectares_por_acre = 0.404686;
		double acre = area/m2_por_acre;
		double areaft2 = acre*ft2_por_acre;
		double areahectar = acre*hectares_por_acre;
		
		System.out.println("Acres: " + acre);
		System.out.println("Pés quadrados: " + areaft2);
		System.out.println("Hectares: " + areahectar);
	}
}

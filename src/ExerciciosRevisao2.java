import java.util.Scanner;

public class ExerciciosRevisao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		 ex1(sc);
		 ex2(sc);
		 ex3(sc);
		 
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
}

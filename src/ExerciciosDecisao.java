import java.util.Scanner;

public class ExerciciosDecisao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ex1(sc);
		ex2(sc);
		ex3(sc);
		ex4(sc);
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
		System.out.println("\n=== Exercício 2 ===");
		
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
	
	public static void ex3(Scanner sc) {
		System.out.println("\n=== Exercício 3 ===");
		
		System.out.println("\n=== CÁLCULO DE PREÇO DE CAIXA ===");
		System.out.println("\n1 - Laranja");
		System.out.println("2 - Limão");
		System.out.println("3 - Morango");
		System.out.println("Escolha: ");
		int opcao = sc.nextInt();
		System.out.println("Insira o valor unitário do fruto: ");
		double valor = sc.nextDouble();
		double preco_caixa = 0;
		
		switch(opcao) {
			case 1:
				preco_caixa = valor*60;
				System.out.println("O valor de uma caixa de laranja é: R$" + preco_caixa);
				break;
			case 2:
				preco_caixa = valor*80;
				System.out.println("O valor de uma caixa de limão é: R$" + preco_caixa);
				break;
			case 3:
				preco_caixa = valor*20;
				System.out.println("O valor de uma caixa de morango é: R$" + preco_caixa);
				break;
			default:
				System.out.println("Insira uma opção válida.");
				break;
		}
	}
	
	public static void ex4(Scanner sc) {
		System.out.println("\n=== Exercício 4 ===");
		
		System.out.println("\n=== CALCULADORA ===");
		System.out.println("\n 7 8 9");
		System.out.println("\n 4 5 6");
		System.out.println("\n 1 2 3");
		System.out.println("\n   0  ");
		
		System.out.println("\n+ ADIÇÃO");
		System.out.println("- SUBTRAÇÃO");
		System.out.println("* MULTIPLICAÇÃO");
		System.out.println("/ DIVISÃO");
		
		System.out.println("Insira o primeiro valor: ");
		int valor1 = sc.nextInt();
		System.out.println("Insira a operação matemática: ");
		String operacao = sc.next();
		System.out.println("Insira o segundo valor: ");
		int valor2 = sc.nextInt();
		double resultado = 0;
		
		switch(operacao) {
			case "+":
				resultado = valor1+valor2;
				System.out.println(valor1 + " + " + valor2 + " = " + resultado);
				break;
			case "-":
				resultado = valor1-valor2;
				System.out.println(valor1 + " - " + valor2 + " = " + resultado);
				break;
			case "*":
				resultado = valor1*valor2;
				System.out.println(valor1 + " * " + valor2 + " = " + resultado);
				break;
			case "/":
				resultado = valor1/valor2;
				System.out.println(valor1 + " / " + valor2 + " = " + resultado);
				break;
			default:
				System.out.println("Operação inválida");
				break;
		}
			
		
	}
}

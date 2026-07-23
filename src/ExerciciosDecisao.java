import java.util.Scanner;

public class ExerciciosDecisao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ex1(sc);
		ex2(sc);
		ex3(sc);
		ex4(sc);
		ex5(sc);
		ex6(sc);
		ex7(sc);
		ex8(sc);
		ex9(sc);
		
		sc.close();
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
	
	public static void ex5(Scanner sc) {
		System.out.println("\n=== Exercício 5 ===");
		
		System.out.println("Valor da compra:");
		int compra = sc.nextInt();

		System.out.println("Valor do pagamento:");
		int pagamento = sc.nextInt();

		if (pagamento < compra) {
		    System.out.println("Pagamento Negado");
		} else {
		    int troco = pagamento - compra;

		    int nota100 = troco / 100;
		    int resto = troco % 100;

		    int nota10 = resto / 10;
		    resto = resto % 10;

		    int nota1 = resto;

		    System.out.println("Troco: R$ " + troco);
		    System.out.println("Notas de R$100: " + nota100);
		    System.out.println("Notas de R$10 : " + nota10);
		    System.out.println("Notas de R$1  : " + nota1);
		}
	}
	
	public static void ex6(Scanner sc) {
		System.out.println("\n=== Exercício 6 ===");
		int nota100 = 5;
		int nota50 = 10;
		int nota20 = 10;
		int nota10 = 20;
		
		int opcao = 0;
		
		while(opcao != 3) {
			System.out.println("\n==== CAIXA ELETRÔNICO ====");
			System.out.println("\n1 - Ver estoque");
			System.out.println("2 - Realizar Saque");
			System.out.println("3 - Sair");
			
			System.out.println("\nEscolha: ");
			opcao = sc.nextInt();
			
			switch(opcao) {
			
			case 1:
				int total = (nota100*100) + (nota50*50) + (nota20*20) + (nota10*10);
				System.out.println("\nESTOQUE DE CAIXA");
				System.out.println("Notas de R$100: " + nota100);
				System.out.println("Notas de R$50: " + nota50);
				System.out.println("Notas de R$20: " + nota20);
				System.out.println("Notas de R$10: " + nota10);
				System.out.println("Total disponível: R$" + total);
				break;
			case 2:
				System.out.println("\nDigite o valor do saque: ");
				int valor = sc.nextInt();
				
				if(valor % 10 != 0) {
					System.out.println("Valor inválido! O saque deve ser múltiplo de 10.");
					break;
				}
				int usar100;
				int usar50;
				int usar20;
				int usar10;
				
				usar100 = Math.min(valor/100, nota100);
				int restante = valor - (usar100 * 100);
				
				usar50 = Math.min(restante/50, nota50);
				restante = restante - (usar50 * 50);
				
				usar20 = Math.min(restante/20, nota20);
				restante = restante - (usar20 * 20);
				
				usar10 = Math.min(restante/10, nota10);
				restante = restante - (usar10 * 10);
				
				if(restante == 0) {
					System.out.println("\nSaque realizado com sucesso!");
					System.out.println("Notas entregues:");
					System.out.println("R$100: " + usar100);
					System.out.println("R$50: " + usar50);
					System.out.println("R$20: " + usar20);
					System.out.println("R$10: " + usar10);
					
					nota100 -= usar100;
					nota50 -= usar50;
					nota20 -= usar20;
					nota10 -= usar10;
				} else {
					System.out.println("\nNão foi possível realizar o saque.");
					System.out.println("O caixa não possui cédulas suficientes para esse valor.");
				}
				break;
			case 3:
				System.out.println("Programa encerrado.");
				break;
			default:
				System.out.println("Insira uma opção válida.");
				break;
			}
		}
	}
	
	public static void ex7(Scanner sc) {
		System.out.println("\n=== Exercício 7 ===");
		
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
		
		System.out.println((resultado<0) ? "Negativo": "Positivo");
		System.out.println((resultado%2==0) ? "Par": "Ímpar");
		
	}
	
	public static void ex8(Scanner sc) {
		System.out.println("\n=== Exercício 8 ===");
		
		System.out.println("Insira o valor do produto comprado: ");
		double valor = sc.nextDouble();
		System.out.println("Insira a forma de pagamento (cheque ou dinheiro): ");
		String f_pagamento = sc.next();
		
		if (valor >=100 && f_pagamento.equalsIgnoreCase("dinheiro")) {
			double desconto = valor*0.1;
			double novo_valor = valor - desconto;
			System.out.println("Pagamento maior ou igual a R$100 e pago no dinheiro, desconto de 10%. Novo valor: " + novo_valor);
		}
		else {
			System.out.println("Valor a pagar: R$"+ valor);
		}
	}
	
	public static void ex9(Scanner sc) {
		System.out.println("\n=== Exercício 9 ===");
		
		System.out.println("Insira uma letra: ");
		String letra = sc.next();
		
		String diminuir = letra.toLowerCase();
		
		switch (diminuir) {
			case "a", "e", "i", "o", "u":
				System.out.println("Vogal");
				break;
			default:
				System.out.println("Consoante");
				break;
		}
	}
	
	public static void ex10(Scanner sc) {
		System.out.println("\n=== Exercício 10 ===");
		
		System.out.println("Insira um ano: ");
		int ano = sc.nextInt();
		
		if (ano%400==0) {
			System.out.println(ano +" é um ano bissexto.");
		}
		else if (ano%4==0 && ano%100!=0) {
			System.out.println(ano +" é um ano bissexto.");
		}
		else {
			System.out.println(ano +" não é um ano bissexto.");
		}
	}
}

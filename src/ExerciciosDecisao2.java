import java.util.Scanner;

public class ExerciciosDecisao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;
        
        do {
            System.out.println("\n====================================");
            System.out.println("=== MENU DE EXERCÍCIOS - DECISÃO ===");
            System.out.println("====================================");
            System.out.println("1 - Classificação Numérica");
            System.out.println("2 - Cálculo de Peso Ideal por Gênero");
            System.out.println("3 - Categorização de Nadador por Idade");
            System.out.println("4 - Cálculo e Diagnóstico de IMC");
            System.out.println("5 - Sistema de Abastecimento com Brinde");
            System.out.println("6 - Validação e Classificação de Triângulos");
            System.out.println("7 - Caixa de Açougue com Desconto em Cartão");
            System.out.println("0 - Sair");
            System.out.println("---------------------------------");
            System.out.print("Escolha uma opção: ");
            
            if (sc.hasNextInt()) {
                opcao = sc.nextInt();
                sc.nextLine();
            } else {
                sc.nextLine();
                opcao = -1;
            }
            
            switch (opcao) {
                case 1:
                    ex1(sc);
                    break;
                case 2:
                    ex2(sc);
                    break;
                case 3:
                    ex3(sc);
                    break;
                case 4:
                    System.out.println("EM BREVE");
                    break;
                case 5:
                    System.out.println("EM BREVE");
                    break;
                case 6:
                    System.out.println("EM BREVE");
                    break;
                case 7:
                    System.out.println("EM BREVE");
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 0); 
        
        sc.close();
    }
    
    public static void ex1(Scanner sc) {
    	System.out.println("\n=== Exercício 1 ===");
    	
    	String tipo_n = "";
    	
    	System.out.println("\nInsira um número inteiro para ver se é positivo, negativo ou neutro: ");
    	int n = sc.nextInt();
    	
    	if (n > 0) {
    		tipo_n = "positivo";
    	} else if (n < 0) {
    		tipo_n = "negativo";
    	} else {
    		tipo_n = "neutro";
    	}
    	
    	System.out.printf("O número é %s", tipo_n);	
    }
    
    public static void ex2(Scanner sc) {
		System.out.println("\n=== Exercício 2 ===");
		
		System.out.println("Insira a idade (em anos) do nadador para saber sua categoria: ");
		int idade = sc.nextInt();
		
		if (idade <0) {
			System.out.println("Idade inválida!");
		}
		else if (idade <= 4) {
			System.out.println("Sem categoria.");
		}
		else if (idade <= 7) {
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
    	
    	System.out.println("\nCálculo IMC");
    	
    	System.out.print("Insira seu peso em kg (ex: 75,5): ");
    	double peso = sc.nextDouble();
    	System.out.println("Insira sua altura (ex: 1,80): ");
    	double altura = sc.nextDouble();
    	
    	String condicao = "";
    	double IMC = peso/(altura*altura);
    	
    	if(IMC < 18.5) {
    		condicao = "Magreza (abaixo do peso)";
    	} else if (IMC < 25) {
    		condicao = "Normal (peso adequado)";
    	} else if (IMC < 30) {
    		condicao = "Sobrepeso";
    	} else if (IMC < 40) {
    		condicao = "Obesidade";
    	} else {
    		condicao = "Obesidade Grave (Grau III)";
    	}
    	
    	System.out.println("\n-------------------------------------------------");
        System.out.println("              TABELA DE REFERÊNCIA               ");
        System.out.println("-------------------------------------------------");
        System.out.println(" IMC               | Classificação               ");
        System.out.println("-------------------------------------------------");
        System.out.println(" Menor que 18,5    | Magreza (Abaixo do peso)    ");
        System.out.println(" Entre 18,5 e 24,9 | Normal (Peso adequado)      ");
        System.out.println(" Entre 25,0 e 29,9 | Sobrepeso                   ");
        System.out.println(" Entre 30,0 e 39,9 | Obesidade                   ");
        System.out.println(" Maior que 40,0    | Obesidade Grave (Grau III)  ");
        System.out.println("-------------------------------------------------");
    	
        System.out.printf(" Seu IMC: %.2f%n", IMC);
        System.out.printf(" Classificação: %s%n", condicao);
    }
}


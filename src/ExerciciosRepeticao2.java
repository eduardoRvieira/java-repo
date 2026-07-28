import java.util.Scanner;

public class ExerciciosRepeticao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcao = -1;
		
		do {
			System.out.println("\n====================================");
			System.out.println("== MENU DE EXERCÍCIOS - REPETIÇÃO ==");
			System.out.println("====================================");
			System.out.println("1 - Resto da Divisão por 11");
			System.out.println("2 - Projeção de Crescimento Populacional");
			System.out.println("3 - Simulação Demográfica Dinâmica");
			System.out.println("4 - Validação de Acesso Seguro");
			System.out.println("5 - Cálculo Automático de Tabuada");
			System.out.println("0 - Sair do programa");
	        System.out.println("---------------------------------");
	        System.out.println("Escolha uma opção: ");
	        
	        if (sc.hasNextInt()) {
                opcao = sc.nextInt();
                sc.nextLine();
            } else {
                sc.nextLine();
                opcao = -1;
            }
	        
	        switch (opcao) {
	        	case 1:
	        		ex1();
	        		break;
	        	case 2:
	        		ex2();
	        		break;
	        	case 3:
	        		ex3(sc);
	        		break;
	        	case 4:
	        		ex4(sc);
	        		break;
	        	case 5:
	        		ex5(sc);
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
	
	public static void ex3(Scanner sc) {
	    System.out.println("\n=== Exercício 3 ===");
	    
	    char desejarContinuar;

	    do {
	        double paisA, paisB;
	        double taxaA, taxaB;

	        do {
	            System.out.print("Insira a população do país A (maior que 0): ");
	            paisA = sc.nextDouble();
	            if (paisA <= 0) {
	                System.out.println("Erro: A população deve ser maior que 0.");
	            }
	        } while (paisA <= 0);

	        do {
	            System.out.print("Insira a taxa de crescimento do país A (em %, ex: 3): ");
	            taxaA = sc.nextDouble();
	            if (taxaA <= 0) {
	                System.out.println("Erro: A taxa deve ser maior que 0.");
	            }
	        } while (taxaA <= 0);

	        do {
	            System.out.print("Insira a população do país B (maior que 0): ");
	            paisB = sc.nextDouble();
	            if (paisB <= 0) {
	                System.out.println("Erro: A população deve ser maior que 0.");
	            }
	        } while (paisB <= 0);

	        do {
	            System.out.print("Insira a taxa de crescimento do país B (em %, ex: 1.5): ");
	            taxaB = sc.nextDouble();
	            if (taxaB <= 0) {
	                System.out.println("Erro: A taxa deve ser maior que 0.");
	            }
	        } while (taxaB <= 0);
	        
	        double taxaAemDec = taxaA / 100.0;
	        double taxaBemDec = taxaB / 100.0;

	       
	        if (paisA < paisB && taxaAemDec <= taxaBemDec) {
	            System.out.println("\nO País A tem população menor e taxa menor/igual à do País B. Nunca o alcançará.");
	        } else {
	            int anos = 0;
	            while (paisA < paisB) {
	                paisA += paisA * taxaAemDec;
	                paisB += paisB * taxaBemDec;
	                anos++;
	            }
	            System.out.printf("%nO país A ultrapassa ou iguala a população do país B em %d anos.%n", anos);
	        }

	        System.out.print("\nDeseja realizar outro cálculo? (S/N): ");
	        desejarContinuar = sc.next().toUpperCase().charAt(0);

	    } while (desejarContinuar == 'S');
	}
	
	public static void ex4(Scanner sc) {
		System.out.println("\n=== Exercício 4 ===");
		
		System.out.println("CADASTRO DE USUÁRIO\n");
		
		int cod;
		int senha;
		
		do {
			System.out.println("Insira o código de usuário (número  positivo inteiro): ");
			cod = sc.nextInt();
			if (cod <= 0) {
				System.out.println("ERRO: O código deve ser um número positivo maior que zero.\n");
			}
		} while (cod <= 0);
		
		do {
			System.out.println("Insira a senha (número positivo inteiro): ");
			senha = sc.nextInt();
			
			if (senha <= 0) {
				System.out.println("ERRO: A senha deve ser um número positivo maior que zero.\n");
			} else if (senha == cod){
				System.out.println("ERRO: A senha não pode ser igual ao código de usuário. Tente novamente.\n");
			}
		} while (senha <= 0 || senha == cod);
		
		System.out.println("\nUsuário cadastrado com sucesso.");
	}
	
	public static void ex5(Scanner sc) {
		System.out.println("\n=== Exercício 5 ===");
		
		System.out.println("\nInsira o número para ver sua tabuada de 1 ao 10: ");
		int x = sc.nextInt();
		System.out.println("");
		int vezes;
		
		for(int i = 1; i <=10; i++) {
			vezes = x*i;
			System.out.printf("%d X %d = %d\n", x, i, vezes);
		}
	}
}

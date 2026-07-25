import java.util.Scanner;

public class ExerciciosRepeticao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ex1(sc);
		ex2(sc);
		ex3(sc);
		ex4(sc);
		
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
	
	public static void ex3(Scanner sc) {
		System.out.println("=== Exercício 3 ===");
		
		System.out.println("Insira um número: ");
		int numero = sc.nextInt();
		
		boolean eh_primo = true;
		
		if (numero <= 1) {
			eh_primo = false;
		} else {
			for (int i = 2; i < numero; i++) {
				if (numero % i == 0) {
					eh_primo = false;
					break;
				}
			}
		}
		if (eh_primo) {
	        System.out.println(numero + " é um número primo.");
	    } else {
	        System.out.println(numero + " NÃO é um número primo.");
	    }
		
	}
	
	public static void ex4(Scanner sc) {
		System.out.println("=== Exercício 4 ===");
		
		int senha = 1234;
		int contador = 0;
		boolean acertou = false;
		
		while (contador <3 && !acertou) {
			System.out.println("Insira a senha numérica (Tentativa " + (contador + 1) + " de 3):");
			int tentativa = sc.nextInt();
			if (tentativa == senha) {
				System.out.println("Acesso permitido.");
				acertou = true;
			} else {
				System.out.println("Acesso negado.");
				contador++;
			}
		}
		if (!acertou) {
			System.out.println("Acesso bloqueado.");
		}
	}

}

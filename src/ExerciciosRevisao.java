import java.util.Scanner;
import java.time.Year;

public class ExerciciosRevisao {

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
        ex10(sc);

        sc.close();
    }

    public static void ex1(Scanner sc) {
        System.out.println("=== Exercício 1 ===");

        System.out.print("Insira seu saldo para o ajuste: ");
        double saldo = sc.nextDouble();

        double ajuste = saldo - (saldo * 0.01);

        System.out.printf("Seu saldo é de R$ %.2f. Com o ajuste de 1%% fica: R$ %.2f%n",
                saldo, ajuste);
    }
    
    public static void ex2(Scanner sc) {
    	System.out.println("\n=== Exercício 2 ===");
    	
    	double soma_notas = 0;
    	
    	for (int i = 1; i <=3; i++) {
    		System.out.print("Insira a nota " + i + ": ");
    		soma_notas += sc.nextDouble();
    	}
    	double media1 = soma_notas/3;
    	System.out.println("Média = " + media1);
    	
    	soma_notas = 0;
    	
    	for (int i = 1; i <=3; i++) {
    		System.out.print("Insira a nota " + i + ": ");
    		soma_notas += sc.nextDouble();
    	}
    	
    	double media2 = soma_notas/3;
    	System.out.println("Média = " + media2);
    	
    	double soma_medias = media1 + media2;
    	double media_medias = media1/media2;
    	System.out.println("A soma das duas médias é " + soma_medias);
    	System.out.println("A média das duas médias é " + media_medias);
    }
    
    public static void ex3(Scanner sc) {
    	System.out.println("\n=== Exercício 3 ===");
    	
    	System.out.println("Insira o primeiro valor: ");
    	double valor1 = sc.nextDouble();
    	System.out.println("Insira o segundo valor: ");
    	double valor2 = sc.nextDouble();
    	
    	double soma_valores = valor1+valor2;
    	double dobro_soma = soma_valores*2;
    	
    	System.out.println("Soma dos valores: " + soma_valores +
    			"\nDobro da soma: " + dobro_soma);
    }
    
    public static void ex4(Scanner sc) {
    	System.out.println("\n=== Exercício 4 ===");
    	
    	int ano_atual = Year.now().getValue();
    	
    	System.out.println("Insira seu ano de nascimento: ");
    	int ano_nascimento = sc.nextInt();
    	
    	int idade = ano_atual - ano_nascimento;
    	
    	System.out.println("Ano atual: " + ano_atual);
    	System.out.println("Sua idade: " + idade + " anos.");
    }
    
    public static void ex5(Scanner sc) {
    	System.out.println("\n=== Exercício 5 ===");
    	
    	double valor_hora = 2.30;
    	
    	System.out.println("Insira os minutos usados pelo cliente: (R$ 2,30 por hora): ");
    	double minutos = sc.nextDouble();
    	
    	double valor = minutos/60.0;
    	
    	double valor_a_cobrar = valor * valor_hora;
    	
    	System.out.println("Valor a cobrar: R$" + valor_a_cobrar);
    }
    
    public static void ex6(Scanner sc) {
    	System.out.println("\n=== Exercício 6 ===");
    	
    	double valor_copia = 0.08;
    	
    	System.out.println("Insira a quantidade de folhas para copiar (Uma folha = duas cópias): ");
    	int qtde_folhas = sc.nextInt();
    	
    	double copias = qtde_folhas*2;
    	
    	double valor_a_cobrar = copias*valor_copia;
    	
    	System.out.println("Valor a cobrar: R$" + valor_a_cobrar);
    }
    
    public static void ex7(Scanner sc) {
        System.out.println("\n=== Exercício 7 ===");

        sc.nextLine();

        System.out.print("Insira seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Insira sua idade em anos: ");
        int idade = sc.nextInt();

        int idade_em_dias = idade * 365;

        System.out.println(nome + ", você viveu aproximadamente por " + idade_em_dias + " dias");
    }
    		
    public static void ex8(Scanner sc) {
    	System.out.println("\n=== Exercício 8 ===");
    	
    	System.out.println("Insira uma quantidade de horas: ");
    	double hora = sc.nextDouble();
    	
    	double hora_em_minuto = hora * 60;
    	double hora_em_segundo = hora_em_minuto * 60;
    	
    	System.out.println("Hora fornecida: " + hora + 
    			"\n Hora em minutos: " + hora_em_minuto + 
    			"\n Hora em segundos: " + hora_em_segundo);
    }
    
    public static void ex9(Scanner sc) {
        System.out.println("\n=== Exercício 9 ===");

        System.out.print("Insira o valor do produto: ");
        double valor = sc.nextDouble();

        double desconto = valor * 0.09;
        double valor_final = valor - desconto;

        System.out.println("Com desconto de 9%, o novo valor é: " + valor_final);
    }
    
    public static void ex10(Scanner sc) {
    	System.out.println("\n=== Exercício 10 ===");
    	
    	System.out.println("Insira o salário-base do funcionário (R$): ");
    	double salario = sc.nextDouble();
    	
    	double gratificacao = salario*0.05;
    	double imposto = salario*0.07;
    	
    	double salario_final = salario + gratificacao - imposto;
    	
    	System.out.println("Seu salário, com gratificação de 5% e imposto de 7%, é de: R$" + salario_final);
    }
}
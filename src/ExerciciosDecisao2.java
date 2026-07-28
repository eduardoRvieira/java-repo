import java.util.Scanner;

public class ExerciciosDecisao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;
        
        do {
            System.out.println("\n====================================");
            System.out.println("== MENU DE EXERCÍCIOS - DECISÃO ==");
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
                    System.out.println("EM BREVE");
                    break;
                case 2:
                    System.out.println("EM BREVE");
                    break;
                case 3:
                    System.out.println("EM BREVE");
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
}


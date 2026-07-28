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
                    ex4(sc);
                    break;
                case 5:
                    ex5(sc);
                    break;
                case 6:
                    ex6(sc);
                    break;
                case 7:
                    ex7(sc);
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
        
        System.out.println("Insira um número inteiro para ver se é positivo, negativo ou neutro: ");
        int n = sc.nextInt();
        
        if (n > 0) {
            tipo_n = "positivo";
        } else if (n < 0) {
            tipo_n = "negativo";
        } else {
            tipo_n = "neutro";
        }
        
        System.out.printf("O número é %s%n", tipo_n);
        
        sc.nextLine(); 
        System.out.println("\nPressione ENTER para voltar ao menu...");
        sc.nextLine();
    }
    
    public static void ex2(Scanner sc) {
        System.out.println("\n=== Exercício 2 ===");
        
        System.out.print("Insira seu sexo (M: Masculino - F: Feminino): ");
        String sexo = sc.next().toUpperCase();
        
        System.out.print("Insira sua altura em metros (ex: 1,75): ");
        double altura = sc.nextDouble();
        
        if (sexo.equals("M")) {
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Seu peso ideal é: %.2f kg%n", pesoIdeal);
        } else if (sexo.equals("F")) {
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal é: %.2f kg%n", pesoIdeal);
        } else {
            System.out.println("Entrada inválida! Digite apenas 'M' ou 'F'.");
        }
        
        sc.nextLine();
        System.out.println("\nPressione ENTER para voltar ao menu...");
        sc.nextLine();
    }
    
    public static void ex3(Scanner sc) {
        System.out.println("\n=== Exercício 3 ===");
        
        System.out.println("Insira a idade (em anos) do nadador para saber sua categoria: ");
        int idade = sc.nextInt();
        
        if (idade < 0) {
            System.out.println("Idade inválida!");
        } else if (idade <= 4) {
            System.out.println("Sem categoria.");
        } else if (idade <= 7) {
            System.out.println("Categoria Infantil A");
        } else if (idade <= 10) {
            System.out.println("Categoria Infantil B");
        } else if (idade <= 13) {
            System.out.println("Categoria Juvenil A");
        } else if (idade <= 17) {
            System.out.println("Categoria Juvenil B");
        } else {
            System.out.println("Categoria Adulto");
        }
        
        sc.nextLine(); 
        System.out.println("\nPressione ENTER para voltar ao menu...");
        sc.nextLine();
    }
    
    public static void ex4(Scanner sc) {
        System.out.println("\n=== Exercício 4 ===");
        
        System.out.println("Cálculo IMC");
        
        System.out.print("Insira seu peso em kg (ex: 75,5): ");
        double peso = sc.nextDouble();
        System.out.print("Insira sua altura (ex: 1,80): ");
        double altura = sc.nextDouble();
        
        String condicao = "";
        double IMC = peso / (altura * altura);
        
        if (IMC < 18.5) {
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
        
        sc.nextLine();
        System.out.println("\nPressione ENTER para voltar ao menu...");
        sc.nextLine();
    }
    
    public static void ex5(Scanner sc) {
        System.out.println("\n=== Exercício 5 ===");
        
        double gas = 2.53;
        double eta = 2.09;
        double die = 1.92;
        
        boolean trocaOleo = false;
        
        System.out.println("Todos os clientes que abastecerem seus veículos com mais de 30 litros de etanol serão premiados com uma troca de óleo.");
        
        System.out.println("\n--- TABELA DE PREÇOS ---");
        System.out.println("1 - Gasolina : R$ 2,53 / L");
        System.out.println("2 - Etanol   : R$ 2,09 / L");
        System.out.println("3 - Diesel   : R$ 1,92 / L");
        System.out.print("Escolha o tipo de combustível: ");
        int opcao = sc.nextInt();
        System.out.print("Insira a quantidade de litros que deseja abastecer: ");
        double qtdeComb = sc.nextDouble();
        
        double precoTotal = 0;
        boolean opcaoValida = true;
        
        switch (opcao) {
            case 1:
                precoTotal = qtdeComb * gas;
                break;
            case 2:
                precoTotal = qtdeComb * eta;
                if (qtdeComb > 30) {
                    trocaOleo = true;
                }
                break;
            case 3:
                precoTotal = qtdeComb * die;
                break;
            default:
                System.out.println("Opção inválida. Insira uma entrada válida.");
                opcaoValida = false;
                break;
        }
        
        if (opcaoValida) {
            System.out.printf("Total a ser pago: R$%.2f", precoTotal);
            if (trocaOleo) {
                System.out.println("\nCliente com direito a uma troca de óleo de cortesia.");
            } else {
                System.out.println("\nSem direito à troca de óleo de cortesia.");
            }
        }
        
        sc.nextLine(); 
        System.out.println("\nPressione ENTER para voltar ao menu...");
        sc.nextLine();
    }
    
    public static void ex6(Scanner sc) {
        System.out.println("\n=== Exercício 6 ===");
        
        int[] lados = new int[3];
        
        System.out.println("Insira os lados de um triângulo (números inteiros):");
        
        for (int i = 0; i < lados.length; i++) {
            System.out.printf("Insira o lado %d: ", (i + 1));
            lados[i] = sc.nextInt();
        }

        boolean eTriangulo = (lados[0] + lados[1] > lados[2]) &&
                             (lados[0] + lados[2] > lados[1]) &&
                             (lados[1] + lados[2] > lados[0]);
        
        if (!eTriangulo) {
            System.out.println("Os lados informados NÃO formam um triângulo.");
        } else if (lados[0] == lados[1] && lados[1] == lados[2]) {
            System.out.println("Triângulo Equilátero (3 lados iguais).");
        } else if (lados[0] != lados[1] && lados[1] != lados[2] && lados[0] != lados[2]) {
            System.out.println("Triângulo Escaleno (3 lados diferentes).");
        } else {
            System.out.println("Triângulo Isósceles (2 lados iguais).");
        }
        
        sc.nextLine(); 
        System.out.println("\nPressione ENTER para voltar ao menu...");
        sc.nextLine();
    }
    
    public static void ex7(Scanner sc) {
        System.out.println("\n=== Exercício 7 ===");
        System.out.println("          AÇOUGUE - PROMOÇÃO              ");
        System.out.println("1 - File Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        System.out.print("Escolha o tipo de carne (1, 2 ou 3): ");
        int opcaoCarne = sc.nextInt();

        System.out.print("Digite a quantidade em Kg: ");
        double quantidade = sc.nextDouble();

        String nomeCarne = "";
        double precoKg = 0.0;
        boolean opcaoValida = true;

        switch (opcaoCarne) {
            case 1:
                nomeCarne = "File Duplo";
                if (quantidade <= 5) {
                    precoKg = 4.90;
                } else {
                    precoKg = 5.80;
                }
                break;
            case 2:
                nomeCarne = "Alcatra";
                if (quantidade <= 5) {
                    precoKg = 5.90;
                } else {
                    precoKg = 6.80;
                }
                break;
            case 3:
                nomeCarne = "Picanha";
                if (quantidade <= 5) {
                    precoKg = 6.90;
                } else {
                    precoKg = 7.80;
                }
                break;
            default:
                System.out.println("Opção de carne inválida!");
                opcaoValida = false;
                break;
        }

        if (opcaoValida) {
            double totalCarne = quantidade * precoKg;

            System.out.println("\nForma de Pagamento:");
            System.out.println("1 - Cartão (5% de desconto)");
            System.out.println("2 - Dinheiro / Outros");
            System.out.print("Escolha a opção de pagamento: ");
            int tipoPagamento = sc.nextInt();

            double desconto = 0.0;

            if (tipoPagamento == 1) {
                desconto = totalCarne * 0.05;
            }

            double totalAPagar = totalCarne - desconto;

            System.out.println("\n==========================================");
            System.out.println("             CUPOM FISCAL                 ");
            System.out.println("==========================================");
            System.out.printf("Carne escolhida: %s | Quantidade: %.2f Kg%n", nomeCarne, quantidade);
            System.out.printf("Cálculo: %.2f Kg x R$ %.2f = Total Bruto: R$ %.2f%n", quantidade, precoKg, totalCarne);
            System.out.printf("Desconto concedido: R$ %.2f%n", desconto);
            System.out.printf("TOTAL A PAGAR: R$ %.2f%n", totalAPagar);
            System.out.println("==========================================");
        }

        sc.nextLine(); 
        System.out.println("\nPressione ENTER para voltar ao menu...");
        sc.nextLine();
    }
}
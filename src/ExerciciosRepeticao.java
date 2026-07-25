import java.util.Scanner;

public class ExerciciosRepeticao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ex1(sc);

	}
	
	public static void ex1(Scanner sc) {
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

}

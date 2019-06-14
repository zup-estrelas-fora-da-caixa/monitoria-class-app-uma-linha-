package monitoria;

import java.util.Random;
import java.util.Scanner;

public class Diviacao {
	
	public static void adivinharUmAQuatro() {
		Scanner scan = new Scanner(System.in);

		System.out.println("\n############################" + "\nDigite um numero de 1 a 3");
		int numero = scan.nextInt();

		if (numero == 1) {
			System.out.println("#### O numero é 1 ###");
		} else if (numero == 2) {
			System.out.println("### O numero é 2 ###");
		} else if (numero == 3) {
			System.out.println("### O numero é 3 ###");
		} else if (numero == 4) {
			System.out.println("### O numero é 4 ###");
		} else {
			System.out.println("### O numero digitado não é 1, 2 ou 3. ###");
		}
	}

	public static void adivinharNumero(int dificuldade) {
		Scanner scan = new Scanner(System.in);
		Random gerarAleatorio = new Random();
			//numero começa em 0 e tem 10 posições
		int numeroAleatorio = gerarAleatorio.nextInt(dificuldade);
		
		System.out.println("\n###############\nChute um numero");
		int chute = scan.nextInt();
		System.out.println(numeroAleatorio);
		
		if(chute == numeroAleatorio) {
			System.out.println("#### Acerto, miseravi! ####");
		}else if(chute < numeroAleatorio) {
			System.out.println("#### Chutou muito baixo ####");
		}else if (chute > numeroAleatorio) {
			System.out.println("#### Chutou muito alto ####");
		}
		
	}

}

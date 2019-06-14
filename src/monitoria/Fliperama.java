package monitoria;

import java.util.Scanner;

public class Fliperama {
	
	public static int perguntarDificuldade() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o nivel de dificuldade vc quer?\n####Facil#### \n####Dificil####\n####Medio####");
		String dificuldade = scan.next();
		
		int dificil = 100;
		int medio = 50;
		int facil = 10;
		
		if(dificuldade.equalsIgnoreCase("Dificil")) {
			return dificil;
		}else if(dificuldade.equalsIgnoreCase("Medio")) {
			return medio;
		}else if(dificuldade.equalsIgnoreCase("Facil")) {
			return facil;
		} else {
			System.out.println("Não entendi o que vc digitou. A dificuldade ficará no medio");
			return medio; 
		}
	}

	public static void escolherOJogo() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n#####Qual Jogo vc quer jogar??####"
				+ "\n## 1 para Adinhavar numero de 1 á 4 ##"
				+ "\n##2 para Adivinhar Numero Aleatorio ##");
		int resposta = scan.nextInt();
		
		if(resposta == 1) {
			Diviacao.adivinharUmAQuatro();
		}else if(resposta == 2) {
			Diviacao.adivinharNumero(perguntarDificuldade());
		}else {
			System.out.println("Não temos esse jogo, vc gatou um ficha a toa");
		}
	}

	public static int perguntarJogadas() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Quantas vezes vc quer jogar?");
		int jogadas = scan.nextInt();
		return jogadas;
	}
	
	public static void inserirFicha() {
		int jogadas = Fliperama.perguntarJogadas();
		
		for (int i = 1; i <= jogadas; i++) {
			Fliperama.escolherOJogo();
		}
	}
}

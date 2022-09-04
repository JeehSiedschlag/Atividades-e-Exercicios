package jogoDaVelha;
import java.util.Scanner;
import java.util.Random;

public abstract class Computador {
	static int sorteado;
	static int dificuldade;

	public static int getSorteado() {
		return sorteado;
	}
	public static int quemComeca() {
		Random sortear = new Random();
		int sorteado = sortear.nextInt(100);
		return sorteado;
	}
	
	public static void selecionarDificuldade() {
		System.out.println("");
		System.out.println("Selecione a Dificuldade do Jogo ");
		System.out.println("");
		System.out.println("   =>Digite 1, para F�CIL<=  ");
		System.out.println("  => Digite 2, para NORMAL <=  ");
		System.out.println(" =>  Digite 3, para DIF�CIL  <=  ");
		try (Scanner opcao = new Scanner (System.in)) {
			int dificuldade = opcao.nextInt();	

				if (dificuldade == 1) {		
					Facil.iniciarJogoFacil();
				} 
				else if (dificuldade == 2 ) {
					Normal.iniciarJogoNormal();
				}
				else if (dificuldade == 3) {
					Dificil.iniciarJogoDificil();
				}
				else {
					System.out.println("ERRO! Op��o inv�lida!");
				}
		}
	}
}

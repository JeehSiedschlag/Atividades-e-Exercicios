package jogoDaVelha;
import java.util.Scanner;

public class Jogador {

	private static Scanner in;
	
	public static int lerJogada(){
		in = new Scanner(System.in);
		try {
			return in.nextInt();
		} catch (Exception e) {
			System.out.println("ERRO! Caracter inv�lido!");
		}
		return -1;
	}	
	
	public static int jogadaJogador(int x, int y, Tabuleiro tabuleiro) {
		
		String[] chars = tabuleiro.getChars();
			if (x == 1) {
				x = y - 1;
			} else if (x == 2) {
				x = x + y;
			} else if (x == 3) {
				x = x + 2 + y;
			}
		
			if (chars[x].equals(" ")) {
				chars[x] = "X";
				if (tabuleiro.checarVencedor("X")) {
					return 0;
				}
			} else {
				System.out.println("Jogada inv�lida...");
				return 1;
			}
			return -1;
	}
}

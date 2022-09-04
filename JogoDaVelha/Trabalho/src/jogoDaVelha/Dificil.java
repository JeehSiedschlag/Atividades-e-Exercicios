package jogoDaVelha;
import java.util.Random;

public class Dificil extends Computador {
	
	private static Tabuleiro tabuleiro = new Tabuleiro();
	
	public static void iniciarJogoDificil() {
		System.out.println("Iniciando modo dif�cil...");
			if(Computador.quemComeca() <= 85) {
				jogadaCompC(tabuleiro);
			} 
				while(true){
					if (tabuleiro.checarVencedor("O")) {
						System.out.println("Que pena, voc� perdeu :(");
						tabuleiro.desenharTabuleiro();
						break;
					}
					else if (tabuleiro.checarJogo()) {
						tabuleiro.desenharTabuleiro();
						System.out.println("Empate! Parece que deu velha...");
						break;
					} else {
					tabuleiro.desenharTabuleiro();
					System.out.print("Digite a linha: ");
					int x = Jogador.lerJogada();
					System.out.print("Digite a coluna: ");
					int y = Jogador.lerJogada();
					
					int jogada = 0;
					if(!tabuleiro.checarJogo()){
						jogada = Jogador.jogadaJogador(x, y, tabuleiro);
					}
					if(jogada == 0){
						System.out.println("PARAB�NS! Voc� Ganhou!");
						tabuleiro.desenharTabuleiro();
						break;
					}else if(jogada == 1){
						continue;
					}else if(jogada == -1){
						if(!tabuleiro.checarJogo()){
							jogadaCompC(tabuleiro);
						}
					}			
				}
			}
	}	
	public static void jogadaCompC(Tabuleiro tabuleiro) {
		String[] chars = tabuleiro.getChars();	
		if (chars[4].equals(" ")) {
			chars[4] = "O";
		} else if (chars[0].equals(" ")) {
			chars[0] = "O";
		} else if (chars[6].equals(" ")) {
			chars[6] = "O";
		} else if (chars[3].equals(" ")) {
			chars[3] = "O";
		} else if (chars[5].equals(" ")) {
			chars[5] = "O";	
		} else {
			while (true) {
				Random r = new Random();
				int i = r.nextInt(9);
				if (chars[i].equals(" ")) {
					chars[i] = "O";
					break;
				}
			}		
		}
	}
}


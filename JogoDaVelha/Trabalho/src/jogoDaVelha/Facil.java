package jogoDaVelha;
import java.util.Random;

public class Facil extends Computador {
	
	private static Tabuleiro tabuleiro = new Tabuleiro();
	
	public static void iniciarJogoFacil() {
		System.out.println("Iniciando modo f�cil...");
			if(Computador.quemComeca() <= 15) {
				jogadaCompA(tabuleiro);
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
							jogadaCompA(tabuleiro);
						}
					}			
				}
			}
	}

	public static void jogadaCompA(Tabuleiro tabuleiro) {
		String[] chars = tabuleiro.getChars();
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


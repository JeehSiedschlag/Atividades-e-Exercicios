package jogoDaVelha;

public class Tabuleiro {

	private String[] chars;
	
	public String[] getChars() {
		return chars;
	}
	public void setChars(String[] chars) {
		this.chars = chars;
	}
	public Tabuleiro() {
		limparTabuleiro();
	}
	
	public void limparTabuleiro() {
		chars = new String[9];
		for (int i = 0; i < 9; i++) {
			chars[i] = " ";
		}
	}
	public void desenharTabuleiro() {
		for(int i = 0; i < 9; i = i+3){
			System.out.println("    "+chars[i]+" | "+chars[i+1]+" | "+chars[i+2]);
			if(i < 6){
				System.out.println("  -------------");
			}
		}
	}
	
	public boolean checarJogo() {
		for (int i = 0; i < 9; i++) {
			if (chars[i] == " ") {
				return false;
			}
		}
		return true;
	}
	
	public boolean checarVencedor(String str) {
		for (int i = 0; i < 9; i = i + 3) {
			if ((chars[i].equals(chars[i + 1]) && chars[i + 1].equals(chars[i + 2]) && !chars[i].equals(" ") && !chars[i + 1].equals(" ") && chars[i + 2] != " ")) {
				return true;
			}
		}
		if ((chars[0].equals(chars[3]) && chars[0].equals(chars[6]) && !chars[0].equals(" ") && !chars[3].equals(" ") && !chars[6].equals(" "))) {
			return true;
		}
		if ((chars[1].equals(chars[4]) && chars[1].equals(chars[7]) && !chars[1].equals(" ") && !chars[4].equals(" ") && !chars[7].equals(" "))) {
			return true;
		}
		if ((chars[2].equals(chars[5]) && chars[2].equals(chars[8]) && !chars[2].equals(" ") && !chars[5].equals(" ") && !chars[8].equals(" "))) {
			return true;
		}

		if ((chars[0].equals(chars[4]) && chars[0].equals(chars[8]) && !chars[0].equals(" ") && !chars[4].equals(" ") && !chars[8].equals(" "))) {
			return true;
		}

		if ((chars[2].equals(chars[4]) && chars[2].equals(chars[6]) && !chars[2].equals(" ") && !chars[4].equals(" ") && !chars[6].equals(" "))) {
			return true;
		}
		return false;
	}
}


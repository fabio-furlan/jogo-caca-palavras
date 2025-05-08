package JogoCacaPalavras;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class base_tabuleiro {
	private String[][] tabuleiro = new String[10][10];
	private Map<String, String> palavras = new HashMap<>();

	public base_tabuleiro() {
		palavras.put("0,0-5,0", "PYTHON");
		palavras.put("1,2-1,5", "JAVA");
		palavras.put("1,7-1,9", "WEB");
		palavras.put("4,4-4,8", "FRONT");
		palavras.put("7,1-7,7", "ANDROID");
	}

	public void criarTabuleiro() {
		Random letrasAleatorias = new Random();
		String moldeTabuleiro = "    ▬ ▬ ▬ ▬ ▬ ▬ ▬ ▬ ▬ ▬ ▬ ▬ ▬ ▬ ▬ ▬ ▬ ▬ ▬ ▬ ";
		String caracterLetraEncontrada = "*";

		System.out.println(" As palavras são: PYTHON, JAVA, WEB, FRONT, ANDROID. \n");

		System.out.println("     0   1   2   3   4   5   6   7   8   9");

		for (Integer linha = 0; linha < this.tabuleiro.length; linha++) {
			System.out.println(moldeTabuleiro);

			for (Integer coluna = 0; coluna < this.tabuleiro[linha].length; coluna++) {
				if (coluna == 0) {
					System.out.print(" " + linha + " | ");
				}

				// Palavra Python
				if (linha == 0 && coluna == 0) {
					this.tabuleiro[linha][coluna] = palavras.containsKey("0,0-5,0") ? "P" : caracterLetraEncontrada;
				} else if (linha == 1 && coluna == 0) {
					this.tabuleiro[linha][coluna] = palavras.containsKey("0,0-5,0") ? "Y" : caracterLetraEncontrada;
				} else if (linha == 2 && coluna == 0) {
					this.tabuleiro[linha][coluna] = palavras.containsKey("0,0-5,0") ? "T" : caracterLetraEncontrada;
				} else if (linha == 3 && coluna == 0) {
					this.tabuleiro[linha][coluna] = palavras.containsKey("0,0-5,0") ? "H" : caracterLetraEncontrada;
				} else if (linha == 4 && coluna == 0) {
					this.tabuleiro[linha][coluna] = palavras.containsKey("0,0-5,0") ? "O" : caracterLetraEncontrada;
				} else if (linha == 5 && coluna == 0) {
					this.tabuleiro[linha][coluna] = palavras.containsKey("0,0-5,0") ? "N" : caracterLetraEncontrada;
				}

				// Palavra Java
				else if (linha == 1 && coluna == 2) {
					this.tabuleiro[linha][coluna] = palavras.containsKey("1,2-1,5") ? "J" : caracterLetraEncontrada;
				} else if (linha == 1 && coluna == 3) {
					this.tabuleiro[linha][coluna] = palavras.containsKey("1,2-1,5") ? "A" : caracterLetraEncontrada;
				} else if (linha == 1 && coluna == 4) {
					this.tabuleiro[linha][coluna] = palavras.containsKey("1,2-1,5") ? "V" : caracterLetraEncontrada;
				} else if (linha == 1 && coluna == 5) {
					this.tabuleiro[linha][coluna] = palavras.containsKey("1,2-1,5") ? "A" : caracterLetraEncontrada;
				}

				// Palavra Web
				else if (linha == 1 && coluna == 7) {
					this.tabuleiro[linha][coluna] = palavras.containsKey("1,7-1,9") ? "W" : caracterLetraEncontrada;
				} else if (linha == 1 && coluna == 8) {
					this.tabuleiro[linha][coluna] = palavras.containsKey("1,7-1,9") ? "E" : caracterLetraEncontrada;
				} else if (linha == 1 && coluna == 9) {
					this.tabuleiro[linha][coluna] = palavras.containsKey("1,7-1,9") ? "B" : caracterLetraEncontrada;
				}
				// Palavra Front
				else if (linha == 4 && coluna == 4) {
					this.tabuleiro[linha][coluna] = palavras.containsKey("4,4-4,8") ? "F" : caracterLetraEncontrada;
				} else if (linha == 4 && coluna == 5) {
					this.tabuleiro[linha][coluna] = palavras.containsKey("4,4-4,8") ? "R" : caracterLetraEncontrada;
				} else if (linha == 4 && coluna == 6) {
					this.tabuleiro[linha][coluna] = palavras.containsKey("4,4-4,8") ? "O" : caracterLetraEncontrada;
				} else if (linha == 4 && coluna == 7) {
					this.tabuleiro[linha][coluna] = palavras.containsKey("4,4-4,8") ? "N" : caracterLetraEncontrada;
				} else if (linha == 4 && coluna == 8) {
					this.tabuleiro[linha][coluna] = palavras.containsKey("4,4-4,8") ? "T" : caracterLetraEncontrada;
				}
				// Palavra Front
				else if (linha == 7 && coluna == 1) {
					this.tabuleiro[linha][coluna] = palavras.containsKey("7,1-7,7") ? "A" : caracterLetraEncontrada;
				} else if (linha == 7 && coluna == 2) {
					this.tabuleiro[linha][coluna] = palavras.containsKey("7,1-7,7") ? "N" : caracterLetraEncontrada;
				} else if (linha == 7 && coluna == 3) {
					this.tabuleiro[linha][coluna] = palavras.containsKey("7,1-7,7") ? "D" : caracterLetraEncontrada;
				} else if (linha == 7 && coluna == 4) {
					this.tabuleiro[linha][coluna] = palavras.containsKey("7,1-7,7") ? "R" : caracterLetraEncontrada;
				} else if (linha == 7 && coluna == 5) {
					this.tabuleiro[linha][coluna] = palavras.containsKey("7,1-7,7") ? "O" : caracterLetraEncontrada;
				} else if (linha == 7 && coluna == 6) {
					this.tabuleiro[linha][coluna] = palavras.containsKey("7,1-7,7") ? "I" : caracterLetraEncontrada;
				} else if (linha == 7 && coluna == 7) {
					this.tabuleiro[linha][coluna] = palavras.containsKey("7,1-7,7") ? "D" : caracterLetraEncontrada;
				}

				else {
					char letraAleatoria = (char) letrasAleatorias.nextInt(65, 90);
					this.tabuleiro[linha][coluna] = String.valueOf(letraAleatoria);
				}

				System.out.print(this.tabuleiro[linha][coluna]);

				System.out.print(" | ");

			}
			System.out.println();
		}
		System.out.println(moldeTabuleiro);
	}

	public Map<String, String> pegarPalavras() {
		return this.palavras;
	}
}

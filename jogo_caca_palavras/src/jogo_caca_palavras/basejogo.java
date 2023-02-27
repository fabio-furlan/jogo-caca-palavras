package jogo_caca_palavras;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;




public class basejogo {
	
	private static Scanner leitorDeDados = new Scanner(System.in);
	private static String linhaBase = "▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬";
	
	
	private Usuario usuario;
	private base_tabuleiro tabuleiro;
	private Map<String, String> palavras;
	
	public basejogo (Usuario usuario, base_tabuleiro tabuleiro, Map<String, String> coordenadasDasLetras) {
		this.palavras = coordenadasDasLetras;
		this.usuario = usuario;
		this.tabuleiro = tabuleiro;
	}

	private String validarEntrada() {
		String posicoesDigitadas = "";
		Boolean continuarVerificandoPosicoes = true;

		while (continuarVerificandoPosicoes) {
			System.out.printf(" %s \n\n", linhaBase);
			System.out.print(" Digite aqui as posições da palavra encontrada: ");
			String entradaDeDados = basejogo.leitorDeDados.nextLine();

			if (entradaDeDados.matches("[0-9],[0-9]-[0-9],[0-9]")) {
				posicoesDigitadas = entradaDeDados;
				continuarVerificandoPosicoes = false;
			} else {
				System.out.println("\n Digite uma posição válida!\n"
						+ " por exemplo: \"1,7-1,9\".");
				System.out.println(" A primeira posição é a linha,\n"
						+ "a segunda posição é a coluna.\n");
			}
		}

		return posicoesDigitadas;
	}

	private void verificarJogada(String posicoesDigitadas) {
		this.usuario.realizarTentativa();

		for (Entry<String, String> palavra : this.palavras.entrySet()) {
			if (posicoesDigitadas.equals(palavra.getKey())) {
				System.out.printf(" Parabéns! Palavra %s encontrada.\n\n", palavra.getValue());
				this.usuario.pontuar();
				this.palavras.remove(palavra.getKey());
				return;
			}
		}

		System.out.println(" Palavra não encontrada :(\n");
	}

	public void iniciarJogo() {
		boolean continuarJogo = true;

		while (continuarJogo) {
			tabuleiro.criarTabuleiro();
			System.out.println();

			verificarJogada(validarEntrada());

			if (this.usuario.pegarPontuacao() == 5) {
				System.out.println(" Você encontrou todas as palavras!");
				encerrarJogo();
				continuarJogo = false;
			} else {
				System.out.print(" Continuar o jogo? Digite \"s\" ou \"n\": ");
				String perguntarSeDesejaContinuar = basejogo.leitorDeDados.nextLine().toLowerCase();
				System.out.println();

				if (perguntarSeDesejaContinuar.contains("s")) {
					System.out.printf(" %s \n\n", linhaBase);
					continue;
				}

				encerrarJogo();
				continuarJogo = false;
			}
		}

	}

	public void encerrarJogo() {
		System.out.printf(" %s \n\n", linhaBase);
		System.out.println("                           Fim de jogo!\n" + this.usuario.mostrarNome());
		System.out.println();
		this.usuario.mostrarPontuacao();
		this.usuario.mostrarQuantidadeDeTentativas();
		System.out.printf(" %s \n\n", linhaBase);
		basejogo.leitorDeDados.close();
	}
}

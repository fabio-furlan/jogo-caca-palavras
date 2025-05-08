package jogo_caca_palavras;

import java.util.Map;



public class menu_principal {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		usuario.definirNome();

		base_tabuleiro tabuleiro = new base_tabuleiro();
		Map<String, String> coordenadasDasLetras = tabuleiro.pegarPalavras();

		basejogo controladorDoJogo = new basejogo(usuario, tabuleiro, coordenadasDasLetras);
		Instrucoes instrucoes = new Instrucoes(usuario);

		instrucoes.apresentarJogo();
		instrucoes.mostrarInstrucoesDoJogo();
		
		controladorDoJogo.iniciarJogo();

	}

}

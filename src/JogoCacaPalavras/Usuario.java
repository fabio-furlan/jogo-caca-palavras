package jogo_caca_palavras;

import java.util.Scanner;

public class Usuario {
	private String nome;
	private Integer pontuacao = 0;
	private Integer tentativas = 0;
	
	public String definirNome() {
		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(System.in);
		System.out.println("                  ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
		System.out.print("                  ♦ Caça Palavras ♦\n");
		System.out.println("                  ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
		System.out.print("\n Pronto para o jogo? \n\n Digite seu nome de usuário: ");
		this.nome = leitor.nextLine();

		return this.nome;
	}
	
	public String mostrarNome() {
		return this.nome;
	}

	public void pontuar() {
		this.pontuacao += 1;
	}

	public int pegarPontuacao() {
		return pontuacao;
	}
	
	public void mostrarPontuacao() {
		System.out.println("Pontuação: " + this.pontuacao);
	}

	public void realizarTentativa() {
		this.tentativas += 1;
	}

	
	public void mostrarQuantidadeDeTentativas() {
		System.out.println("Tentativas: " + this.tentativas + "\n");
	}
	
}

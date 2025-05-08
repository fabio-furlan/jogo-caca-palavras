package jogo_caca_palavras;



public class Instrucoes {
	
	private static Usuario usuario;
	private static String linhaBase = "▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬";

	public Instrucoes(Usuario usuario) {
		Instrucoes.usuario = usuario;
	}

	public void apresentarJogo() {
		System.out.printf("\n %s \n", Instrucoes.linhaBase);
		System.out.printf(" Bem vindo ao jogo %s!\n\n", Instrucoes.usuario.mostrarNome());
		System.out.println(" O jogo funciona assim:\n");
		System.out.println(" Você deverá encontrar as palavras dentro do tabuleiro, e assim que \n"
				+" localizar você deverá digitar a posição da primeira letra e a\n"
				+ " posição da última letra da palavra encontrada.\n\n");
		
	}

	public void mostrarInstrucoesDoJogo() {
		System.out.println(" Primeiro você precisa digitar a posição da linha da primeira letra da \n"
	+" palavra, em seguida virgula (,) assim podendo digitar a posição coluna.\n"
	+ " Agora precisa digitar hífem (-) para informar o final da letra encontrada\n" 
	+" e seguir o mesmo passo.\n");
		System.out.println(" Por exemplo: \"1,7-1,9\" você encontra a palavra WEB.\n"
				+ " No exemplo, \"1,7\" é a posição da primeira letra, já \"1,9\" é a posição\n"
				+ " da última letra da palavra, não esqueça de separar a linha da coluna\n"
				+ " por (,) e a letra inicial da letra final por hífem (-) ok.\n"
				+ "\n");
		
		System.out.printf("%40s", " Boa sorte!\n");
		System.out.printf(" %s \n\n", linhaBase);
	}


}

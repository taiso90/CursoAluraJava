package sintaxe_variaveis_e_fluxo;

public class TestaEscopoVariaveis {
	public static void main(String[] args) {
		System.out.println("testa condicional");
		int idade = 20;
		int quantidadePessoas = 3;

		boolean acompanhado;

		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		System.out.println(acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("pode entrar");
		} else {
			System.out.println("nao pode entrar");
		}
	}

}
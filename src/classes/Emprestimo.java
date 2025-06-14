package classes;

import java.time.LocalDate;

public class Emprestimo {
	private Usuario usuario;
	private Livro livro;
	private LocalDate dataEmprestimo, dataDevolucao;
	
	public Emprestimo(Usuario usuario, Livro livro) {
		this.usuario = usuario;
		this.livro = livro;
		dataEmprestimo = LocalDate.now();
		dataDevolucao = dataEmprestimo.plusDays(30);
		System.out.println(livro.emprestar());
	}
	
	public String exibirResumoEmprestimo() {
		return "Resumo do Empréstimo:\n"
				+ "Livro: "+livro.exibirInformacoes()+"\n"
				+ "Usuário: "+usuario.getNome()+" ("+usuario.exibirTipoUsuario()+")\n"
				+"Data do Empréstimo: "+dataEmprestimo;
	}
	
}

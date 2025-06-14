package classes;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
		List<Livro> livros = new ArrayList<Livro>();
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		livros.add(new Livro("Os Espiões", "Luis Fernando Verissimo", "978-85-60281-99-2"));
		livros.add(new Livro("O Príncipe", "Maquiavel", "85-286-0189-7"));
		livros.add(new Livro("Kaguya-Sama Love is War vol 01", "Aka Akasaka", "978-65-5512-813-0"));
		
		usuarios.add(new Aluno("Victor Augusto Marin", "Ciência da Computação", 1));
		usuarios.add(new Professor("Girafales", "Ciência da Computação", 2));
		
		emprestimos.add(new Emprestimo(usuarios.getFirst(), livros.getLast()));
		
		for (int i = 0; i < livros.size(); i++) {
			System.out.println(livros.get(i).exibirInformacoes()+"\n");
		}
		
		for (int i = 0; i < usuarios.size(); i++) {
			System.out.println(usuarios.get(i).exibirInfo()+"\n");
		}
		
		for (int i = 0; i < emprestimos.size(); i++) {
			System.out.println(emprestimos.get(i).exibirResumoEmprestimo()+"\n");
		}
	}

}

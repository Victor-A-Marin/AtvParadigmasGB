package classes;

public class Livro {
	private String titulo, autor, isbn;
	private	boolean disponivel;
	
	public Livro(String titulo, String autor, String isbn) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.disponivel = true;
	}

	public String emprestar() {
		if (disponivel) {
			disponivel = false;
			return "Livro emprestado com sucesso!";
		}
		return "Infelizmente, este livro não se encontra disponível no momento";
	}
	
	public String devolver() {
		disponivel = true;
		return "Livro devolvido com sucesso!";
	}
	
	public String exibirInformacoes() {
		return titulo + ";" + autor + ";" + isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
}

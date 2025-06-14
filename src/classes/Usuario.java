package classes;

public class Usuario {
	protected String nome;
	protected int id;
	
	public Usuario(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}

	public String exibirTipoUsuario() {
		return "genérico";
	}
	
	public String exibirInfo() {
		return nome + ";" + id + ";";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

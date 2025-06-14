package classes;

public class Aluno extends Usuario {
	private String curso;
	
	public Aluno(String nome, String curso, int id) {
		super(nome, id);
		this.curso = curso;
	}

	@Override
	public String exibirTipoUsuario() {
		return "aluno";
	}
	
	public String exibirInfo() {
		return super.nome + ";" + super.id + ";" + curso;
	}
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}

package classes;

public class Professor extends Usuario {
	private String departamento;
	
	public Professor(String nome, String departamento, int id) {
		super(nome, id);
		this.departamento = departamento;
	}
	
	@Override
	public String exibirTipoUsuario() {
		return "professor";
	}

	public String exibirInfo() {
		return super.nome + ";" + super.id + ";" + departamento;
	}
	
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

}

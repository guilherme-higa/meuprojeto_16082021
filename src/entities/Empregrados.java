package entities;

public class Empregrados {
	private Integer id;
	private String nome;
	private double salario;

	public Empregrados(Integer id, String nome, double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void aumentoSalario(double porcentagem) {
		salario += salario * porcentagem / 100.0;
	}

	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}
}

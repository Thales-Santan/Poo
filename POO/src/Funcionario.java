
public class Funcionario {
	//atributos
	private String nome;
	private int matricula;
	protected int horasTrabalhadas;
	protected double valorPorHora;
	//construtores -Como eu fa�o o objeto funcionario no programa pessoal
	public Funcionario(String nome, int matricula, int horasTrabalhadas, double valorHora) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorHora;
	}
	//encapsulamento -Como eu mexo nas coisas se t� tudo travado
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorPorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorPorHora = valorHora;
	}
	//metodo -tudo que a classe faz
	public double salario() {
		return (horasTrabalhadas * valorPorHora);
	}
	//sobrecarga de metodo
	public double salario(double imposto) {
		return (horasTrabalhadas * valorPorHora) -((horasTrabalhadas * valorPorHora)*imposto) ;
	}
}


public class Terceiro extends Funcionario{
	//atributos
	private double adicional;
	
	//construtor
	public Terceiro(String nome, int matricula, int horasTrabalhadas, double valorHora, double adicional) {
		super(nome, matricula, horasTrabalhadas, valorHora);
		this.adicional = adicional;
	}
	//encapsulamento
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	@Override
	public double salario() {
		return (horasTrabalhadas * valorPorHora)+adicional;
	}
	

}

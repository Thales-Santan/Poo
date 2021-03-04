package CLASSES;

public class ContaEspecial extends Conta {
	//double: limite
	//(-) usarLimite: double
	//Usar o limite do saldo se no momento do movimento o saldo fica negativo, ajusta no saldo e diminuir no limite.
	
	//ATRIBUTO
	private double limite;
	private double usarLimite;
	
	//CONSTRUTOR
	//public ContaEspecial(int numero, double limite) {
	//	super(numero);
	//	this.limite = limite;
	//}
	//CONSTRUTOR - sobrecarga
	 public ContaEspecial(int numero, String cpf, double limite) {
		super(numero, cpf);
		this.limite = limite;
		}
	
	public ContaEspecial(int numero, String cpf, boolean ativa, double limite) {
		super(numero, cpf, ativa);
		this.limite = limite;
	}
	//ENCAPSULAMENTO
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	//metodos
	public void usarlimite(double valor) {
		int contador =0;
		if (valor <= saldo) {
			this.saldo = saldo - valor;
			System.out.println("Debito aprovado!!");
		}
		else if (valor > saldo && valor<=limite && contador<=10) {
			limite = (saldo+limite) - valor;
			saldo = 0;
			System.out.println("Debito aprovado!!");
			System.out.println("Voce entrou no limite especial. Verifique seu saldo e limite no seu App.");
			contador++;
		}
		else if (valor > (saldo+limite)) {
			System.out.println("Esta opera��o excede o seu Saldo e o Limite!");
		}
		else if(saldo == 0 && valor >limite) {
			System.out.println("Voce n�o tem saldo e limite suficiente!");
		}
		if (contador>10) {
			System.out.println("Voce excedeu a quantidade de movimentos do limite da sua conta!");
			
		}
		
    }
}







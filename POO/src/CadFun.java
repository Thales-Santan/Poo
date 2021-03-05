import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class CadFun {

	public static void main(String[] args) {
		/*teste de programador
		Funcionario colaborador1 = new Funcionario("Carlos", 1,10,15.25);
		Terceiro colaborador2 = new Terceiro("Joana",45,10,15.25,50);
		
		System.out.println("Salario do "+colaborador1.getNome()+ "é R$"+colaborador1.salario());
		System.out.println("Salario do "+colaborador2.getNome()+ "é R$"+colaborador2.salario());*/
		Scanner leia = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>();
		System.out.println("Digite a quantidade de funcionario: ");
			int quantidade = leia.nextInt();
			
			for (int x=1; x<=quantidade; x++)
			{
				System.out.println("Funcionario "+x);
				
				System.out.println("Nome: ");
					String nome = leia.next();
				System.out.println("Matricula: ");
					int matricula = leia.nextInt();
				System.out.println("Horas trabalhadas:");
					int horasTrabalhadas = leia.nextInt();
				System.out.println("Valor por hora");
					double valorHora = leia.nextDouble();
				System.out.println("Funcionario " + x);
				System.out.println("1- Organico ou 2- Terceiro");
					char tipo = leia.next().charAt(0);
					
				if(tipo=='2') {
					System.out.println("Valor do adicional: ");
					double adicional = leia.nextDouble();
					lista.add(new Terceiro (nome, matricula ,horasTrabalhadas, valorHora, adicional));
				}else {
					lista.add(new Funcionario (nome, matricula ,horasTrabalhadas, valorHora));
				}
				
			}
			
			System.out.println();
			System.out.println("Pagamento de salarios");
			for (Funcionario fun : lista) {
				System.out.println(fun.getNome() + " Seu salario é "+ fun.salario());
			}
		
		
		leia.close();
	}

}

package APLICACAO;
import java.util.Scanner;

import CLASSES.Conta;
import CLASSES.ContaEspecial;

public class Teste { 

    public static void main(String[] args) {
    	 ContaEspecial cliEspecial1 = new ContaEspecial(555,"154655",500);
         double valor;
         char opcao;
         
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o numero da conta: ");
        int numero = leia.nextInt();
        System.out.println("Digite o CPF:");
    	String cpf = leia.next();
    	System.out.println("Digite 1-Conta ativa ou 2-Conta inativa: ");
    	char tipo = leia.next().charAt(0);
    	boolean ativa;
    	if (tipo =='1') {
    		ativa= true;	
    	}else {
    		ativa = false;
    	}
    	//System.out.println("Digite o limite da conta: ");
    	//double limite = leia.nextDouble();
        //ContaEspecial cliEspecial1 = new ContaEspecial(555,1000);
        //double valor;
        //char opcao;
        
        System.out.println("Digite o valor:");
        valor = leia.nextDouble();
        System.out.println("Debito ou Credito? D/C:");
        opcao = leia.next().toUpperCase().charAt(0);
        if (opcao =='D')
        {
            cliEspecial1.usarlimite(valor);
        }
        else if (opcao =='C') {
            
        	cliEspecial1.credito(valor);
        } else
        {
            System.out.println("Opção invalida!!!");
        }
        System.out.println("Saldo atual: "+cliEspecial1.getSaldo());
        System.out.println("Limite: "+ cliEspecial1.getLimite());
        leia.close();
    }

}

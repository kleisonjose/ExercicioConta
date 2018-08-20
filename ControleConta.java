/**
 * autor Kleison
 */

package aulaConta;
import aulaConta.Conta;
public class ControleConta {
	

	public static void main(String[] args) {
		
		Conta c = new Conta(101, 100);
		c.exibirMensagem();		
		
			
			System.out.println("--DADOS DA CONTA--");
			
			System.out.println("Saldo da Conta Antes de creditar: " + c.getSaldo());
			c.creditar(100);
			System.out.println("Saldo da Conta: após creditar " + c.getSaldo());
			c.debitar(50);
			System.out.println("Saldo da Conta: após debitar " + c.getSaldo());

			
		} // fim main;	
	
}

/**
 * autor Kleison.
 * 
 * 
 */

package aulaConta;

public class Conta {
	
	private int numero;
	private float saldo;
	
	public Conta(int numero, float saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
			
	public void exibirMensagem(){
	System.out.println("Bem vindo à Conta");
	}
		
	// get and setters	
	
	public void creditar(double valor) {
		saldo += valor;
	}
	
	public void debitar(double valor) {
		if(valor <= saldo)
			saldo -= valor;
		else
			System.out.println("Saldo insuficiente!");
	}
	
	public Float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	

} // Fim classe;

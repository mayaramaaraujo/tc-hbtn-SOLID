package com.example.demo.banco;

public class DebitCard extends BankCard {
	public void validate() {
		System.out.println("Verificando Limite!");
		System.out.println("Limite disponível!");
	}
}

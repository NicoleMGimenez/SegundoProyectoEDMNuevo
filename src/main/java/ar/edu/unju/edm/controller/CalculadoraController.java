package ar.edu.unju.edm.controller;

import ar.edu.unju.edm.model.Calculadora;

public class CalculadoraController {
	
	public void resolverOperaciones() {
		
		float num1;
		float num2;
		num1=40;
		num2=8;
		
		Calculadora nuevaCalculadora = new Calculadora();
		
		nuevaCalculadora.setA(num1);
		nuevaCalculadora.setB(num2);
		
		System.out.println("El resultado de la suma es: "+ nuevaCalculadora.sumar());
		System.out.println("El resultado de la division es: "+ nuevaCalculadora.dividirDosNumeros());
	}

}

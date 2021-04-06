package ar.edu.unju.edm.controller;

import ar.edu.unju.edm.model.Cuenta;

public class CuentaController {
	
	public void operarConCuenta() {
		//una instancia de la clase cuenta
		Cuenta nuevaCuenta = new Cuenta();
		
		int numCuenta = 1;
		int dni = 44645789;
		int saldo = 0;
		
		//una instancia de la clase cuenta con valores asignados a sus atributos
		Cuenta otraCuenta = new Cuenta(numCuenta, dni, saldo);
		
		System.out.println("valor DNI de nuevaCuenta "+ nuevaCuenta.getDni());
		
		System.out.println("valor DNI de otraCuenta "+ otraCuenta.getDni());
		
		System.out.println("valor del SALDO: "+ otraCuenta.getSaldo());
		
		otraCuenta.depositar(1000);
		otraCuenta.depositar(5000);
		
		System.out.println("valor del SALDO: "+ otraCuenta.getSaldo());
		
		otraCuenta.extraer(9000);
		
		//permitir que no me descuente los 9000 y se quede mi valor original
		if (otraCuenta.getSaldo()<0)
		{
			System.out.println("SALDO INSUFICIENTE, NO SE PUEDE HACER LA OPERACION");
			otraCuenta.depositar(9000);
		}
		
		System.out.println("valor del SALDO: "+ otraCuenta.getSaldo());
	}

}

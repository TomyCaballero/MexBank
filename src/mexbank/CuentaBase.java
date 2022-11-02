/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mexbank;


public class CuentaBase {
	
	String montoActual = "";
	String depositar = "";

	CuentaBase(String montoActual, String depositar) {
		this.montoActual = montoActual;
		this.depositar = depositar;
	}

	public String getmontoActual() {
		return "Su monto actual es = " +this.montoActual;
	}

	public String getdepositar() {
		return "El monto que va a depositar es = " +this.depositar;
	}

	
}



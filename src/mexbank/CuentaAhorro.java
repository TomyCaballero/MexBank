package mexbank;


public class CuentaAhorro extends CuentaBase{
	
	String invertir = "";
	
	CuentaAhorro(String montoActual, String depositar, String invertir) {
		super(montoActual, depositar);
		this.invertir = invertir;
	}
	
	public String getinvertir() {
		return "Su monto a invertir es 10% mas a su monto actual = " +this.invertir;
	}
	
}

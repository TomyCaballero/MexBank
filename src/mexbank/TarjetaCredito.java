package mexbank;


public class TarjetaCredito extends CuentaBase {
	
        String tipoCredito = "";
	String sumaInteres = "";

        //Constructor 
TarjetaCredito(String tipoCredito, String montoActual, String depositar, String sumaInteres) {
		super(montoActual, depositar);
		this.tipoCredito = tipoCredito;
		this.sumaInteres = sumaInteres;
        }	
	
	public String gettarjetacredito() {
		return "Su tarjeta de credito es = " +this.tipoCredito;
	}
	
	public String getsumaInteres() {
		return "Su interes adicional es = " +this.sumaInteres;
	}


}



package mexbank;


public class TarjetaDebito extends CuentaBase{
		
	String tipoDebito = "";
	String retirar = "";
	
        //Constructor 
public TarjetaDebito(String tipoDebito, String montoActual, String depositar, String retirar) {
		super(montoActual, depositar);
		this.tipoDebito = tipoDebito;
		this.retirar = retirar;
	}

        public String gettarjetadebito() {
		return "Su tarjeta Debito es = " +this.tipoDebito;
	}
	
	public String getretirar() {
		return "Su monto a retirar es = " +this.retirar;
	}


}

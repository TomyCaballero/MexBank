/*
R4. Herencia de clases y paso de parámetros*/
/*Datos de identificación*/
/* Nombre completo: Pedro Pablo Torres Pérez */
/* Matrícula: 21011187 */
/* Fecha de elaboración: 03/03/2022 */
/* Nombre del Módulo: Programación orientada a objetos v1 */
/* Nombre del Asesor: Claudia Patricia Rojano Hernández  */ 

package mexbank;

public class MexBank {

	public static void main(String[] args) {
		
		//CuentaAhorro
		CuentaAhorro cuentaAhorro = new CuentaAhorro("5000", "300", "500");
		System.out.println(cuentaAhorro.getmontoActual());
		System.out.println(cuentaAhorro.getdepositar());
		System.out.println(cuentaAhorro.getinvertir());
		
		System.out.println();
		
		//TarjetaCredito
		
		TarjetaCredito tarjetaCredito = new TarjetaCredito("Platinum", "-400", "300", "15%");
		System.out.println(tarjetaCredito.gettarjetacredito());
		System.out.println(tarjetaCredito.getmontoActual());
		System.out.println(tarjetaCredito.getdepositar());
		System.out.println(tarjetaCredito.getsumaInteres());
		
		System.out.println();
		
		//TarjetaDebito
		
		TarjetaDebito tarjetaDebito = new TarjetaDebito("Visa", "200", "1800", "1000");
		System.out.println(tarjetaDebito.gettarjetadebito());
		System.out.println(tarjetaDebito.getmontoActual());
		System.out.println(tarjetaDebito.getdepositar());
		System.out.println(tarjetaDebito.getretirar());
		
	}
		
}	
	



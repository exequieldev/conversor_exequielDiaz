package conversor;

public class Divisa {
	
	private double cantidadDinero;
	private String moneda;
	
	public Divisa() {
		
		
	}
	
	
	public void calculo(int monto, double cantidad, String moneda) {
		
		this.cantidadDinero = monto * cantidad ;
		this.moneda = moneda;
	}
	
	
	
	@Override
	public String toString() {
		return "Tienes " + cantidadDinero + " " + moneda;
	}
	
	

}

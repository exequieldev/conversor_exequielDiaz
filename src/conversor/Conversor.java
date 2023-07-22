package conversor;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Conversor{
	
	private Object[] tipoConvercion = { 
			"Pesos a dolar",
			"Pesos a euro",
			"Peso a libras",
			"Pesos a yen",
			"Pesos a Won Coreano",
			"Dolar a peso",
			"Dolar a euro",
			"Dolar a libras",
			"Dolar a yen",
			"Dolar a Won Coreano"
			};
	private Map<String,Double> precioMoneda;
	private Map<String,String> tipoMoneda;
	
	public Conversor() {
		this.cargarDatos();
	}

	public void conversorMondeda() {
		
		
		Object monto = JOptionPane.showInputDialog(null,
		        "Ingrese la cantidad de dinero que desea convertir");
		
		
		
		Object selectedValue = JOptionPane.showInputDialog(null,
	             "Elegir una opcion", "Divisas",
	             JOptionPane.PLAIN_MESSAGE, null,
	             tipoConvercion, tipoConvercion[0]);
		
		Divisa convercion = new Divisa();
		
		convercion.calculo(Integer.parseInt(monto.toString()),this.precioMoneda.get(selectedValue.toString()),this.tipoMoneda.get(selectedValue.toString()));
		
		JOptionPane.showMessageDialog(null,convercion.toString(), "Resultado", -1);
		
		
	}
	
	public void conversorTemperatura() {
		
		Object temperatura = JOptionPane.showInputDialog(null,
		        "Ingrese la cantidad de temperatura que desea convertir");
	}
	
	public void cargarDatos() {
		
		//Precio Moneda
		precioMoneda = new HashMap<String,Double>();
		precioMoneda.put("Pesos a dolar",0.0037);
		precioMoneda.put("Pesos a euro",0.0033);
		precioMoneda.put("Peso a libras",0.0029);
		precioMoneda.put("Pesos a yen",0.53);
		precioMoneda.put("Pesos a Won Coreano",4.79);
		precioMoneda.put("Dolar a peso",260.0);
		precioMoneda.put("Dolar a euro",0.90);
		precioMoneda.put("Dolar a libras",0.78);
		precioMoneda.put("Dolar a yen",141.79);
		precioMoneda.put("Dolar a Won Coreano",1286.65);
		
		//Tipo Moneda
		tipoMoneda = new HashMap<String,String>();
		tipoMoneda.put("Pesos a dolar","Dolar");
		tipoMoneda.put("Pesos a euro","euro");
		tipoMoneda.put("Peso a libras","libras");
		tipoMoneda.put("Pesos a yen","yen");
		tipoMoneda.put("Pesos a Won Coreano","won coreano");
		tipoMoneda.put("Dolar a peso","peso");
		tipoMoneda.put("Dolar a euro","euro");
		tipoMoneda.put("Dolar a libras","libras");
		tipoMoneda.put("Dolar a yen","yen");
		tipoMoneda.put("Dolar a Won Coreano","Won Coreano");
		
	}
	

}

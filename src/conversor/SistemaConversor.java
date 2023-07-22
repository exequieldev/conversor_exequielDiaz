package conversor;

import javax.swing.JOptionPane;

public class SistemaConversor {

	public static void main(String[] args) {
		
		Object[] possibleValues = { 
				"Conversor de Moneda", 
				"Conversor de temperatura" };

		Object conversores = JOptionPane.showInputDialog(null,
		             "Elegir una opcion", "Menu",
		             JOptionPane.PLAIN_MESSAGE, null,
		             possibleValues, possibleValues[0]);
		
		Conversor conversor = new Conversor();
		
		if(conversores.toString() == "Conversor de Moneda") {
			
			conversor.conversorMondeda();
		}
		
		/*if(conversores.toString() == "Conversor de temperatura") {
			
			conversor.conversorMondeda();
		}*/
		
		
	}

}

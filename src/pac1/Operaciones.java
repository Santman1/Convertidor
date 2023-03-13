package pac1;

import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Operaciones {

	public static HashMap<String, HashMap<String, Double>> tipoCambio = new HashMap<>();
	
	
	public static void monedas() {
		
		HashMap<String, Double> dolar = new HashMap<>();
		dolar.put("1", 0.95);
		dolar.put("2", 4762.38);
		dolar.put("3", 0.84);
		dolar.put("4", 136.95);
		dolar.put("5", 1317.54);
		tipoCambio.put("0", dolar);
		
		HashMap<String, Double> euro = new HashMap<>();
		euro.put("0", 1.06);
		euro.put("2", 5028.5);
		euro.put("3", 0.89);
		euro.put("4", 144.59);
		euro.put("5", 1391.86);
		tipoCambio.put("1", euro);
		
		HashMap<String, Double> peso = new HashMap<>();
		peso.put("0", 0.00021);
		peso.put("1", 0.0002);
		peso.put("3", 0.00018);
		peso.put("4", 0.029);
		peso.put("5", 0.28);
		tipoCambio.put("2", peso);
		
		HashMap<String, Double> libra = new HashMap<>();
		libra.put("0", 1.18);
		libra.put("1", 1.12);
		libra.put("2", 5629.41);
		libra.put("4", 162.16);
		libra.put("5", 1558.68);
		tipoCambio.put("3", libra);
		
		HashMap<String, Double> yen = new HashMap<>();
		yen.put("0", 0.0073);
		yen.put("1", 0.0069);
		yen.put("2", 34.71);
		yen.put("3", 0.0062);
		yen.put("5", 9.61);
		tipoCambio.put("4", yen);
		
		HashMap<String, Double> won = new HashMap<>();
		won.put("0", 0.00076);
		won.put("1", 0.00072);
		won.put("2", 3.61);
		won.put("3", 0.00064);
		won.put("4", 0.10);
		tipoCambio.put("5", won);
	
	}
	
	public static void operacion (JTextField txtEntrada, JTextField txtSalida, int opcionEntrada, int opcionSalida ) {
		
		monedas();
		String E = Integer.toString(opcionEntrada);
		String S = Integer.toString(opcionSalida);
		
		HashMap<String,Double> monedaEntrada = tipoCambio.get(E);
		
		try {
			double resultado = Double.parseDouble(txtEntrada.getText()) * monedaEntrada.get(S);
			txtSalida.setText(String.format("%.2f",resultado));
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(new VentanaConversor(), " Solo se admiten numeros." + "\nPara Decimales use punto.  \n       Vuelva a intentarlo.", "Error de parametro", JOptionPane.ERROR_MESSAGE);
        } 
	}
	
}

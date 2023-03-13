package pac1;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Opciones {

	public void cambio(int opcionEntrada, int opcionSalida, JTextField txtEntrada, JTextField txtSalida) {
	
		
		switch (opcionEntrada) {
		case 0:

			switch (opcionSalida) {
			case 0:
				JOptionPane.showMessageDialog(null, "Esta tratando de convertir a la misma moneda");
				
				break;

			case 1:
				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir dolar a euro");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);
				
				
				break;

			case 2:
				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir dolar a Peso Colombiano");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);				
				break;

			case 3:
				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir dolar a Libras Esterlinas");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);
				
				break;

			case 4:
				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir dolar a Yen Japonés");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);	
				
				break;

			case 5:
				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir dolar a Won sur-coreano");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);	
				
				break;

			}
			break;

		case 1:

			switch (opcionSalida) {
			case 0:

				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir euro a dolar");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);	
				
				break;

			case 1:
				JOptionPane.showMessageDialog(null, "Esta tratando de convertir a la misma moneda");
				break;

			case 2:
				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir euro a Peso Colombiano");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);	
				
				break;

			case 3:
				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir euro a Libras Esterlinas");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);	
				
				break;

			case 4:
				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir euro a Yen Japonés");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);	
				
				break;

			case 5:
				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir euro a Won sur-coreano");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);	
				
				break;
			}
			break;

		case 2:

			switch (opcionSalida) {
			case 0:

				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir Peso Colombiano a dolar");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);	
				
				break;

			case 1:
				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir Peso Colombiano a euro");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);	
				
				break;

			case 2:

				JOptionPane.showMessageDialog(null, "Esta tratando de convertir a la misma moneda");
				break;

			case 3:
				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir Peso Colombiano a Libras Esterlinas");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);	
				
				break;

			case 4:
				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir Peso Colombiano a Yen Japonés");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);	
				
				break;

			case 5:
				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir Peso Colombiano a Won sul-coreano");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);	
				
				break;
			}
			break;

		case 3:

			switch (opcionSalida) {
			case 0:

				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir Libras Esterlinas a dolar");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);	
				
				break;

			case 1:
				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir Libras Esterlinas a euro");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);	
				
				break;

			case 2:
				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir Libras Esterlinas a Peso Colombiano");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);	
				break;

			case 3:
				JOptionPane.showMessageDialog(null, "Esta tratando de convertir a la misma moneda");
				break;

			case 4:
				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir Libras Esterlinas a Yen Japonés");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);	
				
				break;

			case 5:
				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir Libras Esterlinas a Won sul-coreano");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);	
				
				break;
			}
			break;

		case 4:

			switch (opcionSalida) {
			case 0:

				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir Yen Japonés a dolar");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);	
				
				break;

			case 1:
				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir Yen Japonés a euro");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);	
				
				break;

			case 2:
				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir Yen Japonés a Peso Colombiano");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);	
				
				break;

			case 3:
				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir Yen Japonés a Libras Esterlinas");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);	
				
				break;

			case 4:
				JOptionPane.showMessageDialog(null, "Esta tratando de convertir a la misma moneda");
				break;

			case 5:
				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir Yen Japonés a Won sul-coreano");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);	
				
				break;
			}
			break;

		case 5:

			switch (opcionSalida) {
			case 0:

				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir Won sul-coreano a dolar");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);	
				
				break;

			case 1:
				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir Won sul-coreano a euro");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);	
				
				break;

			case 2:
				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir Won sul-coreano a Peso Colombiano");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);	
				
				break;

			case 3:
				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir Won sul-coreano a Libras Esterlinas");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);	
				
				break;

			case 4:
				//JOptionPane.showMessageDialog(null, "Esta tratando de convertir Won sul-coreano a Yen Japonés");
				Operaciones.operacion(txtEntrada, txtSalida, opcionEntrada, opcionSalida);	
				
				break;

			case 5:
				JOptionPane.showMessageDialog(null, "Esta tratando de convertir a la misma moneda");
				break;
			}
			break;

		}

	}
}

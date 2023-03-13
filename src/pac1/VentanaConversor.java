package pac1;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Cursor;

public class VentanaConversor extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5911396372003209452L;
	public JPanel panel1;
	public JTextField txtEntrada;
	public JTextField txtSalida;
	public int opcionEntrada;
	public int opcionSalida;
	
	  
	
 	public VentanaConversor() {

		setSize(700, 500); 							// ancho alto
		setLocationRelativeTo(null); 				// centrado ventana
		setTitle("Conversor");
		setMinimumSize(new Dimension(350, 250)); 	// tamaño minimo de la venntana

		iniciarComponentes();

		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	private void iniciarComponentes() {
		
		colocarPaneles();
		colocarEtiquetas();
		colocarBotones();
		colocarCajasOpciones();
		colocarCajasTexto();

	}
	
	private void colocarPaneles() {
		
		panel1 = new JPanel(); 									// Creacion panel1
		panel1.setLayout(null);
		panel1.setBackground(new Color(71, 71, 71)); 					// Color para el panel
		this.getContentPane().add(panel1); 						// Agrega panel1 a ventana
	}
	
	private void colocarEtiquetas() {
		
		JLabel etiquetaTitulo = new JLabel("Conversor de moneda");      // Creacion etiquetaTitulo
		etiquetaTitulo.setForeground(new Color(255, 102, 0)); 			// Color fuente
		etiquetaTitulo.setFont(new Font("Stencil", Font.PLAIN, 27)); 	// Tipo de fuente y tamaño
		etiquetaTitulo.setBounds(187, 58, 310, 25);						// Tamaño y Posicion de la etiqueta
		panel1.add(etiquetaTitulo); 									// Agrega la etiqueta al panel

		JLabel etiquetaDe = new JLabel("De :");
		etiquetaDe.setForeground(new Color(252, 102, 37)); 
		etiquetaDe.setFont(new Font("Stencil", Font.PLAIN, 20)); 
		etiquetaDe.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaDe.setBounds(22, 141, 48, 39);
		panel1.add(etiquetaDe);

		JLabel etiquetaA = new JLabel("A :");
		etiquetaA.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaA.setForeground(new Color(252, 102, 37)); 
		etiquetaA.setFont(new Font("Stencil", Font.PLAIN, 20));
		etiquetaA.setBounds(350, 141, 48, 39);
		panel1.add(etiquetaA);

		JLabel etiquetaSon = new JLabel("Son :");
		etiquetaSon.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaSon.setForeground(new Color(255, 102, 0));
		etiquetaSon.setFont(new Font("Stencil", Font.PLAIN, 20));
		etiquetaSon.setBounds(314, 219, 48, 39);
	}
	
	private void colocarCajasOpciones() {
		
		String[] monedas = {"(USD) Dolar", "(EUR) Euro", "(COP) Peso Colombiano" , "(GBP) Libras Esterlinas", "(JPY) Yen Japonés", "(KRW) Won sur-coreano" };
		
		JComboBox<Object> cajaOpcionesEntrada = new JComboBox<Object>(monedas);
		cajaOpcionesEntrada.setOpaque(false);
		cajaOpcionesEntrada.setBorder(null);
		cajaOpcionesEntrada.setFont(new Font("Stencil", Font.PLAIN, 18));
		cajaOpcionesEntrada.setBounds(80, 141, 260, 39);
		panel1.add(cajaOpcionesEntrada);
		cajaOpcionesEntrada.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				opcionEntrada = cajaOpcionesEntrada.getSelectedIndex();
			}
		});
		
		
		JComboBox<Object> cajaOpcionesSalida = new JComboBox<Object>(monedas);
		cajaOpcionesSalida.setFont(new Font("Stencil", Font.PLAIN, 18));
		cajaOpcionesSalida.setBounds(397, 139, 260, 39);
		panel1.add(cajaOpcionesSalida);
		cajaOpcionesSalida.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				opcionSalida = cajaOpcionesSalida.getSelectedIndex();
			}
		});
		
	}
	
	private void colocarCajasTexto() {
		
		txtEntrada = new JTextField();
		txtEntrada.setBackground(new Color(143, 148, 145));
		txtEntrada.setForeground(new Color(255, 255, 255));
		txtEntrada.setBorder(null);
		txtEntrada.setFont(new Font("Stencil", Font.PLAIN, 22));
		txtEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		txtEntrada.setBounds(80, 238, 260, 39);
		panel1.add(txtEntrada);
		txtEntrada.setColumns(10);
		
		txtSalida = new JTextField();
		txtSalida.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtSalida.setBorder(null);
		txtSalida.setHorizontalAlignment(SwingConstants.CENTER);
		txtSalida.setBackground(new Color(143, 148, 145));
		txtSalida.setFont(new Font("Stencil", Font.PLAIN, 22));
		txtSalida.setForeground(new Color(255, 255, 255));
		txtSalida.setEditable(false);
		txtSalida.setColumns(10);
		txtSalida.setBounds(397, 238, 260, 39);
		panel1.add(txtSalida);
	}
	
	private void colocarBotones() {
		
		JButton botonConvertir = new JButton("Convertir");
		botonConvertir.setBorderPainted(false);
		
		botonConvertir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botonConvertir.setBorder(null);
		botonConvertir.setForeground(new Color(71, 71, 71)); 
		botonConvertir.setFont(new Font("Stencil", Font.PLAIN, 20)); 
		botonConvertir.setBackground(new Color(252, 102, 37));
		botonConvertir.setBounds(112, 335, 197, 66);
		panel1.add(botonConvertir);
		botonConvertir.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {

				Opciones opcion = new Opciones();
				opcion.cambio(opcionEntrada, opcionSalida, txtEntrada, txtSalida);
				
			}
		});
		
		
		
		JButton botonSalir = new JButton("Salir");
		botonSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botonSalir.setBorder(null);
		botonSalir.setForeground(new Color(255, 255, 255));
		botonSalir.setFont(new Font("Stencil", Font.PLAIN, 20));
		botonSalir.setBackground(new Color(143, 148, 145));
		botonSalir.setBounds(429, 335, 197, 66);
		panel1.add(botonSalir);
		botonSalir.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		
	}
}

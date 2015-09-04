import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.GroupLayout.Group;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// TODO: Auto-generated Javadoc
/**
 * The Class InterfazGrafica.
 */
public class InterfazGrafica {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			/* (non-Javadoc)
			 * @see java.lang.Runnable#run()
			 */
			public void run() {
				try {
					InterfazGrafica window = new InterfazGrafica();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/** The frame. */
	private JFrame frame;
	
	/** The evento. */
	private Evento evento= new Evento();
	
	/** The rdbtn hashset. */
	private JRadioButton rdbtnHashset;
	
	/** The rdbtn treeset. */
	private JRadioButton rdbtnTreeset;
	
	/** The rdbtn linkedhashset. */
	private JRadioButton rdbtnLinkedhashset;
	
	/** The btn seleccion implemeentacion. */
	private JButton btnSeleccionImplemeentacion;
	
	/** The text area. */
	private JTextArea textArea;
	
	/** The btn agregar desarrolladores. */
	private JButton btnAgregarDesarrolladores;
	
	/** The check box java agregar. */
	private JCheckBox checkBoxJavaAgregar;
	
	/** The check box web agregar. */
	private JCheckBox checkBoxWebAgregar;
	
	/** The check box celular agregar. */
	private JCheckBox checkBoxCelularAgregar;
	
	/** The check box web consultar. */
	private JCheckBox checkBoxWebConsultar;
	
	/** The check box java consultar. */
	private JCheckBox checkBoxJavaConsultar;
	
	/** The check box celular consultar. */
	private JCheckBox checkBoxCelularConsultar;
	
	/** The btn mostrar desarrolladores. */
	private JButton btnMostrarDesarrolladores;
	
	/** The text area_1. */
	private JTextArea textArea_1;
	
	/** The lbl los desarrolladores de. */
	private JLabel lblLosDesarrolladoresDe;
	
	/** The btn conjunto mas grande. */
	private JButton btnConjuntoMasGrande;
	
	/** The label. */
	private JLabel label;
	
	/** The btn todos. */
	private JButton btnTodos;
	
	/** The btn java sin web. */
	private JButton btnJavaSinWeb;
	
	/** The btn web y celulares. */
	private JButton btnWebYCelulares;
	
	/** The btn web o celularessin. */
	private JButton btnWebOCelularessin;
	
	/**
	 * Instantiates a new interfaz grafica.
	 */
	public InterfazGrafica(){
		initialize();
	}
	
	/**
	 * Initialize.
	 */
	public void initialize(){
		frame = new JFrame();
		frame.setBounds(100, 100, 665, 488);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		rdbtnHashset = new JRadioButton("HashSet");
		rdbtnHashset.setBounds(6, 33, 92, 23);
		rdbtnHashset.addActionListener(evento);
		frame.getContentPane().add(rdbtnHashset);
		
		rdbtnTreeset = new JRadioButton("TreeSet");
		rdbtnTreeset.setBounds(100, 33, 86, 23);
		rdbtnTreeset.addActionListener(evento);
		frame.getContentPane().add(rdbtnTreeset);
		
		rdbtnLinkedhashset = new JRadioButton("LinkedHashSet");
		rdbtnLinkedhashset.setBounds(188, 33, 119, 23);
		rdbtnLinkedhashset.addActionListener(evento);
		frame.getContentPane().add(rdbtnLinkedhashset);
		
		textArea = new JTextArea();
		textArea.setEnabled(false);
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(6, 122, 203, 207);
		frame.getContentPane().add(scrollPane);
		
		JLabel lblImplementacionDeSet = new JLabel("Implementacion de SET");
		lblImplementacionDeSet.setForeground(Color.BLUE);
		lblImplementacionDeSet.setBounds(6, 6, 141, 23);
		frame.getContentPane().add(lblImplementacionDeSet);
		
		btnSeleccionImplemeentacion = new JButton("Seleccion Implementacion");
		btnSeleccionImplemeentacion.addActionListener(evento);
		btnSeleccionImplemeentacion.setBounds(6, 62, 203, 23);
		frame.getContentPane().add(btnSeleccionImplemeentacion);
		
		JLabel lblIngresoDesarrolladores = new JLabel("Ingreso Desarrolladores");
		lblIngresoDesarrolladores.setForeground(Color.BLUE);
		lblIngresoDesarrolladores.setBounds(6, 91, 185, 23);
		frame.getContentPane().add(lblIngresoDesarrolladores);
		
		checkBoxJavaAgregar = new JCheckBox("Java");
		checkBoxJavaAgregar.setEnabled(false);
		checkBoxJavaAgregar.setBounds(6, 375, 68, 23);
		checkBoxJavaAgregar.addActionListener(evento);
		frame.getContentPane().add(checkBoxJavaAgregar);
		
		checkBoxWebAgregar = new JCheckBox("Web");
		checkBoxWebAgregar.setEnabled(false);
		checkBoxWebAgregar.setBounds(83, 375, 59, 23);
		checkBoxWebAgregar.addActionListener(evento);
		frame.getContentPane().add(checkBoxWebAgregar);
		
		checkBoxCelularAgregar = new JCheckBox("Celular");
		checkBoxCelularAgregar.setEnabled(false);
		checkBoxCelularAgregar.setBounds(144, 375, 68, 23);
		checkBoxCelularAgregar.addActionListener(evento);
		frame.getContentPane().add(checkBoxCelularAgregar);
		
		btnAgregarDesarrolladores = new JButton("Agregar Desarrolladores");
		btnAgregarDesarrolladores.setEnabled(false);
		btnAgregarDesarrolladores.setBounds(6, 402, 177, 32);
		btnAgregarDesarrolladores.addActionListener(evento);
		frame.getContentPane().add(btnAgregarDesarrolladores);
		
		JLabel lblIngreseLosGrupos = new JLabel("Ingrese los grupos ");
		lblIngreseLosGrupos.setBounds(6, 332, 203, 23);
		frame.getContentPane().add(lblIngreseLosGrupos);
		
		JLabel lblAlQuePertenecen_1 = new JLabel("al que pertenecen");
		lblAlQuePertenecen_1.setBounds(6, 354, 127, 23);
		frame.getContentPane().add(lblAlQuePertenecen_1);
		
		textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setEnabled(false);
		JScrollPane scrollPane_1= new JScrollPane(textArea_1);
		scrollPane_1.setBounds(312, 204, 241, 173);
		frame.getContentPane().add(scrollPane_1);
		
		JLabel lblMuestreoDeDesarrolladores = new JLabel("Muestreo de Desarrolladores");
		lblMuestreoDeDesarrolladores.setForeground(Color.BLUE);
		lblMuestreoDeDesarrolladores.setBounds(312, 6, 200, 23);
		frame.getContentPane().add(lblMuestreoDeDesarrolladores);
		
		checkBoxJavaConsultar = new JCheckBox("Java");
		checkBoxJavaConsultar.setEnabled(false);
		checkBoxJavaConsultar.setBounds(309, 36, 68, 17);
		checkBoxJavaConsultar.addActionListener(evento);
		frame.getContentPane().add(checkBoxJavaConsultar);
		
		checkBoxWebConsultar = new JCheckBox("Web");
		checkBoxWebConsultar.setEnabled(false);
		checkBoxWebConsultar.setBounds(379, 36, 68, 17);
		checkBoxWebConsultar.addActionListener(evento);
		frame.getContentPane().add(checkBoxWebConsultar);
		
		checkBoxCelularConsultar = new JCheckBox("Celular");
		checkBoxCelularConsultar.setEnabled(false);
		checkBoxCelularConsultar.setBounds(449, 36, 74, 17);
		checkBoxCelularConsultar.addActionListener(evento);
		frame.getContentPane().add(checkBoxCelularConsultar);
		
		btnMostrarDesarrolladores = new JButton("Mostrar Desarrolladores");
		btnMostrarDesarrolladores.setEnabled(false);
		btnMostrarDesarrolladores.setBounds(307, 62, 222, 23);
		btnMostrarDesarrolladores.addActionListener(evento);
		frame.getContentPane().add(btnMostrarDesarrolladores);
		
		btnConjuntoMasGrande = new JButton("Conjunto Mas Grande");
		btnConjuntoMasGrande.setEnabled(false);
		btnConjuntoMasGrande.setBounds(312, 131, 200, 23);
		btnConjuntoMasGrande.addActionListener(evento);
		frame.getContentPane().add(btnConjuntoMasGrande);
		
		lblLosDesarrolladoresDe = new JLabel("Los desarrolladores de Java ____");
		lblLosDesarrolladoresDe.setBounds(317, 91, 222, 23);
		frame.getContentPane().add(lblLosDesarrolladoresDe);
		
		JLabel lblUnSubconjuntoDe = new JLabel("un subconjunto de  desarrolladores Web");
		lblUnSubconjuntoDe.setBounds(312, 116, 241, 17);
		frame.getContentPane().add(lblUnSubconjuntoDe);
		
		JLabel lblElConjuntoMas = new JLabel("El conjunto mas grande es");
		lblElConjuntoMas.setBounds(312, 165, 241, 17);
		frame.getContentPane().add(lblElConjuntoMas);
		
		label = new JLabel("_______");
		label.setBounds(312, 187, 241, 17);
		frame.getContentPane().add(label);
		
		btnTodos = new JButton("Todos");
		btnTodos.setBounds(309, 388, 89, 23);
		btnTodos.setEnabled(false);
		btnTodos.addActionListener(evento);
		frame.getContentPane().add(btnTodos);
		
		btnJavaSinWeb = new JButton("Java Sin Web");
		btnJavaSinWeb.setBounds(482, 388, 112, 23);
		btnJavaSinWeb.addActionListener(evento);
		btnJavaSinWeb.setEnabled(false);
		frame.getContentPane().add(btnJavaSinWeb);
		
		btnWebYCelulares = new JButton("Web y Celulares Sin Java");
		btnWebYCelulares.setBounds(249, 411, 198, 23);
		btnWebYCelulares.addActionListener(evento);
		btnWebYCelulares.setEnabled(false);
		frame.getContentPane().add(btnWebYCelulares);
		
		btnWebOCelularessin = new JButton("Web o Celulares Sin Java");
		btnWebOCelularessin.setBounds(449, 411, 190, 23);
		btnWebOCelularessin.addActionListener(evento);
		btnWebOCelularessin.setEnabled(false);
		frame.getContentPane().add(btnWebOCelularessin);
	}
	
	/**
	 * The Class Evento.
	 */
	private class Evento implements ActionListener{
		
		/** The metodo. */
		private int metodo=0;
		
		/** The java. */
		private boolean java=false;
		
		/** The web. */
		private boolean web=false;
		
		/** The celular. */
		private boolean celular=false;
		
		/** The java mostrar. */
		private boolean javaMostrar=false;
		
		/** The web mostrar. */
		private boolean webMostrar=false;
		
		/** The celular mostrar. */
		private boolean celularMostrar=false;
		
		/** The manejador. */
		private ManejadorDeListas manejador = new ManejadorDeListas();
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==rdbtnHashset){
				rdbtnTreeset.setSelected(false);
				rdbtnLinkedhashset.setSelected(false);
				metodo=1;
			}else if(e.getSource()==rdbtnTreeset){
				rdbtnHashset.setSelected(false);
				rdbtnLinkedhashset.setSelected(false);
				metodo=2;
			}else if(e.getSource()==rdbtnLinkedhashset){
				rdbtnTreeset.setSelected(false);
				rdbtnHashset.setSelected(false);
				metodo=3;
			}else if(e.getSource()==btnSeleccionImplemeentacion){
				manejador.seleccionarTipoDeLista(metodo);
				textArea.setEnabled(true);
				checkBoxJavaAgregar.setEnabled(true);
				checkBoxCelularAgregar.setEnabled(true);
				checkBoxWebAgregar.setEnabled(true);
				btnAgregarDesarrolladores.setEnabled(true);
			}else if(e.getSource()==checkBoxJavaAgregar){
				if(checkBoxJavaAgregar.isSelected())
					java=true;
				else
					java=false;
			}else if(e.getSource()==checkBoxWebAgregar){
				if(checkBoxWebAgregar.isSelected())
					web=true;
				else
					web=false;
			}else if(e.getSource()==checkBoxCelularAgregar){
				if(checkBoxCelularAgregar.isSelected())
					celular=true;
				else
					celular=false;
			}else if(e.getSource()==checkBoxJavaConsultar){
				if(checkBoxJavaConsultar.isSelected())
					javaMostrar=true;
				else
					javaMostrar=false;
			}else if(e.getSource()==checkBoxWebConsultar){
				if(checkBoxWebConsultar.isSelected())
					webMostrar=true;
				else
					webMostrar=false;
			}else if(e.getSource()==checkBoxCelularConsultar){
				if(checkBoxCelularConsultar.isSelected())
					celularMostrar=true;
				else
					celularMostrar=false;
			}else if(e.getSource()==btnAgregarDesarrolladores){
				manejador.agregarDesarrolladores(textArea.getText(), java, web, celular);
				if(manejador.esSubconjunto()){
					lblLosDesarrolladoresDe.setText("Los desarrolladores de Java son");
				}else{
					lblLosDesarrolladoresDe.setText("Los desarrolladores de Java no son");
				}
				textArea_1.setEnabled(true);
				checkBoxJavaConsultar.setEnabled(true);
				checkBoxWebConsultar.setEnabled(true);
				checkBoxCelularConsultar.setEnabled(true);
				btnMostrarDesarrolladores.setEnabled(true);
				btnConjuntoMasGrande.setEnabled(true);
				btnTodos.setEnabled(true);
				btnJavaSinWeb.setEnabled(true);
				btnWebYCelulares.setEnabled(true);
				btnWebOCelularessin.setEnabled(true);
			}else if(e.getSource()==btnMostrarDesarrolladores){
				textArea_1.setText(manejador.consultarDesarrolladores(javaMostrar, webMostrar, celularMostrar));
			}else if(e.getSource()==btnConjuntoMasGrande){
				switch(manejador.seleccionarConjuntoMayor()){
				case 1:
					label.setText("Desarrolladores de Java");
					break;
				case 2:
					label.setText("Desarrolladores de Web");
					break;
				case 3:
					label.setText("Desarrolladores de Celular");
					break;
				default:
					label.setText("Ninguno");
				}
				textArea_1.setText(manejador.consultarConjuntoMayor());
			}else if(e.getSource()==btnTodos){
				textArea_1.setText(manejador.consultarDesarrolladores(true, true, true));
			}else if(e.getSource()==btnJavaSinWeb){
				textArea_1.setText(manejador.obtenerJavaSinWeb());
			}else if(e.getSource()==btnWebYCelulares){
				textArea_1.setText(manejador.obtenerWebyCelularesSinJava());
			}else if(e.getSource()==btnWebOCelularessin){
				textArea_1.setText(manejador.obtenerWeboCelularesSinJava());
			}
		}
		
	}
}

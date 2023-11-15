package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class VistaTiempo extends JFrame {

	// Elementos inicializados
	public JPanel contentPane;
	public JPanel panelMapa;
	public JLabel lbl_Madrid;
	public JLabel lbl_ACoruña;
	public JLabel lbl_Pontevedra;
	public JLabel lbl_Lugo;
	public JLabel lbl_Ourense;
	public JLabel lbl_Asturias;
	public JLabel lbl_Cantabria;
	public JLabel lblFondoMapa;
	public JButton btnClimaEspania;
	private  String[] comunidadesAutonomas = {
            "Andalucía", "Aragón", "Asturias", "Islas Baleares", "Canarias", "Cantabria", "Castilla y León",
            "Castilla-La Mancha", "Cataluña", "Extremadura", "Galicia", "Madrid", "Murcia", "Navarra", 
            "País Vasco", "La Rioja", "Comunidad Valenciana", "Ceuta", "Melilla"
        };
	private JLabel lbl_Bilbao;
	private JLabel lbl_Navarra;
	private JLabel lbl_LaRioja;
	private JLabel lbl_Huesca;
	private JLabel lbl_Zaragoza;
	private JLabel lbl_Teruel;
	private JLabel lbl_Lleida;
	private JLabel lbl_Tarragona;
	private JLabel lbl_Barcelona;
	private JLabel lbl_Girona;
	private JLabel lbl_Leon;
	private JLabel lbl_Zamora;
	private JLabel lbl_Salamanca;
	private JLabel lbl_Palencia;
	private JLabel lbl_Valladolid;
	private JLabel lbl_Avila;
	private JLabel lbl_Burgos;
	private JLabel lbl_Soria;
	private JLabel lbl_Segovia;
	private JLabel lbl_Castellon;
	private JLabel lbl_Valencia;
	private JLabel lbl_Alicante;
	private JLabel lbl_Guadalajara;
	private JLabel lbl_Cuenca;
	private JLabel lbl_Albacete;
	private JLabel lbl_CiudadReal;
	private JLabel lbl_Toledo;
	private JLabel lbl_Caceres;
	private JLabel lbl_Badajoz;
	private JLabel lbl_Murcia;
	private JLabel lbl_Almeria;
	private JLabel lbl_Jaen;
	private JLabel lbl_Granada;
	private JLabel lbl_Cordoba;
	private JLabel lbl_Malaga;
	private JLabel lbl_Sevilla;
	private JLabel lbl_Cadiz;
	private JLabel lbl_Huelva;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaTiempo frame = new VistaTiempo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaTiempo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 918, 896);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panelMapa = new JPanel();
		panelMapa.setBounds(0, 23, 894, 690);
		contentPane.add(panelMapa);
		panelMapa.setLayout(null);
		
		btnClimaEspania = new JButton("Ver Clima");
		btnClimaEspania.setBounds(-1, 0, 127, 21);
		panelMapa.add(btnClimaEspania);

		lbl_Madrid = new JLabel("");
		lbl_Madrid.setBounds(449, 271, 31, 31);
		panelMapa.add(lbl_Madrid);

		lbl_ACoruña = new JLabel("");
		lbl_ACoruña.setBounds(221, 83, 31, 31);
		panelMapa.add(lbl_ACoruña);

		lbl_Pontevedra = new JLabel("");
		lbl_Pontevedra.setBounds(208, 146, 31, 31);
		panelMapa.add(lbl_Pontevedra);

		lbl_Lugo = new JLabel("");
		lbl_Lugo.setBounds(277, 100, 31, 31);
		panelMapa.add(lbl_Lugo);

		lbl_Ourense = new JLabel("");
		lbl_Ourense.setBounds(267, 164, 31, 31);
		panelMapa.add(lbl_Ourense);

		lbl_Asturias = new JLabel("");
		lbl_Asturias.setBounds(349, 83, 31, 31);
		panelMapa.add(lbl_Asturias);

		lbl_Cantabria = new JLabel("");
		lbl_Cantabria.setBounds(430, 83, 31, 31);
		panelMapa.add(lbl_Cantabria);
		
		lbl_Bilbao = new JLabel("");
		lbl_Bilbao.setBounds(497, 111, 31, 31);
		panelMapa.add(lbl_Bilbao);
		
		lbl_Navarra = new JLabel("");
		lbl_Navarra.setBounds(541, 122, 31, 31);
		panelMapa.add(lbl_Navarra);
		
		lbl_LaRioja = new JLabel("");
		lbl_LaRioja.setBounds(496, 146, 31, 31);
		panelMapa.add(lbl_LaRioja);
		
		lbl_Huesca = new JLabel("");
		lbl_Huesca.setBounds(620, 146, 31, 31);
		panelMapa.add(lbl_Huesca);
		
		lbl_Zaragoza = new JLabel("");
		lbl_Zaragoza.setBounds(563, 196, 31, 31);
		panelMapa.add(lbl_Zaragoza);
		
		lbl_Teruel = new JLabel("");
		lbl_Teruel.setBounds(576, 258, 31, 31);
		panelMapa.add(lbl_Teruel);
		
		lbl_Lleida = new JLabel("");
		lbl_Lleida.setBounds(673, 164, 31, 31);
		panelMapa.add(lbl_Lleida);
		
		lbl_Tarragona = new JLabel("");
		lbl_Tarragona.setBounds(670, 232, 31, 31);
		panelMapa.add(lbl_Tarragona);
		
		lbl_Barcelona = new JLabel("");
		lbl_Barcelona.setBounds(715, 193, 31, 31);
		panelMapa.add(lbl_Barcelona);
		
		lbl_Girona = new JLabel("");
		lbl_Girona.setBounds(756, 164, 31, 31);
		panelMapa.add(lbl_Girona);
		
		lbl_Leon = new JLabel("");
		lbl_Leon.setBounds(349, 133, 31, 31);
		panelMapa.add(lbl_Leon);
		
		lbl_Zamora = new JLabel("");
		lbl_Zamora.setBounds(349, 196, 31, 31);
		panelMapa.add(lbl_Zamora);
		
		lbl_Salamanca = new JLabel("");
		lbl_Salamanca.setBounds(328, 242, 31, 31);
		panelMapa.add(lbl_Salamanca);
		
		lbl_Palencia = new JLabel("");
		lbl_Palencia.setBounds(410, 146, 31, 31);
		panelMapa.add(lbl_Palencia);
		
		lbl_Avila = new JLabel("");
		lbl_Avila.setBounds(390, 258, 31, 31);
		panelMapa.add(lbl_Avila);
		
		lbl_Valladolid = new JLabel("");
		lbl_Valladolid.setBounds(394, 196, 31, 31);
		panelMapa.add(lbl_Valladolid);
		
		lbl_Burgos = new JLabel("");
		lbl_Burgos.setBounds(455, 164, 31, 31);
		panelMapa.add(lbl_Burgos);
		
		lbl_Soria = new JLabel("");
		lbl_Soria.setBounds(497, 196, 31, 31);
		panelMapa.add(lbl_Soria);
		
		lbl_Segovia = new JLabel("");
		lbl_Segovia.setBounds(430, 232, 31, 31);
		panelMapa.add(lbl_Segovia);
		
		lbl_Castellon = new JLabel("");
		lbl_Castellon.setBounds(620, 290, 31, 31);
		panelMapa.add(lbl_Castellon);
		
		lbl_Valencia = new JLabel("");
		lbl_Valencia.setBounds(604, 340, 31, 31);
		panelMapa.add(lbl_Valencia);
		
		lbl_Alicante = new JLabel("");
		lbl_Alicante.setBounds(606, 402, 31, 31);
		panelMapa.add(lbl_Alicante);
		
		lbl_Guadalajara = new JLabel("");
		lbl_Guadalajara.setBounds(497, 242, 31, 31);
		panelMapa.add(lbl_Guadalajara);
		
		lbl_Cuenca = new JLabel("");
		lbl_Cuenca.setBounds(515, 312, 31, 31);
		panelMapa.add(lbl_Cuenca);
		
		lbl_Albacete = new JLabel("");
		lbl_Albacete.setBounds(523, 370, 31, 31);
		panelMapa.add(lbl_Albacete);
		
		lbl_CiudadReal = new JLabel("");
		lbl_CiudadReal.setBounds(449, 369, 31, 31);
		panelMapa.add(lbl_CiudadReal);
		
		lbl_Toledo = new JLabel("");
		lbl_Toledo.setBounds(410, 304, 31, 31);
		panelMapa.add(lbl_Toledo);
		
		lbl_Caceres = new JLabel("");
		lbl_Caceres.setBounds(328, 242, 31, 31);
		panelMapa.add(lbl_Caceres);
		
		lbl_Badajoz = new JLabel("");
		lbl_Badajoz.setBounds(328, 312, 31, 31);
		panelMapa.add(lbl_Badajoz);
		
		lbl_Murcia = new JLabel("");
		lbl_Murcia.setBounds(563, 427, 31, 31);
		panelMapa.add(lbl_Murcia);
		
		lbl_Almeria = new JLabel("");
		lbl_Almeria.setBounds(523, 487, 31, 31);
		panelMapa.add(lbl_Almeria);
		
		lbl_Jaen = new JLabel("");
		lbl_Jaen.setBounds(471, 421, 31, 31);
		panelMapa.add(lbl_Jaen);
		
		lbl_Granada = new JLabel("");
		lbl_Granada.setBounds(455, 475, 31, 31);
		panelMapa.add(lbl_Granada);
		
		lbl_Cordoba = new JLabel("");
		lbl_Cordoba.setBounds(390, 416, 31, 31);
		panelMapa.add(lbl_Cordoba);
		
		lbl_Malaga = new JLabel("");
		lbl_Malaga.setBounds(390, 502, 31, 31);
		panelMapa.add(lbl_Malaga);
		
		lbl_Sevilla = new JLabel("");
		lbl_Sevilla.setBounds(349, 457, 31, 31);
		panelMapa.add(lbl_Sevilla);
		
		lbl_Cadiz = new JLabel("");
		lbl_Cadiz.setBounds(338, 515, 31, 31);
		panelMapa.add(lbl_Cadiz);
		
		lbl_Huelva = new JLabel("");
		lbl_Huelva.setBounds(287, 450, 31, 31);
		panelMapa.add(lbl_Huelva);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 174, 116, 21);
		panelMapa.add(comboBox);

		lblFondoMapa = new JLabel("");
		lblFondoMapa.setIcon(new ImageIcon("C:\\Users\\Equipo\\git\\ElTiempo_Interfaces_accDatos\\ElTiempo_Espania\\Imagenes\\spain_prov Buena.png"));
		lblFondoMapa.setBounds(-1, 44, 894, 634);
		panelMapa.add(lblFondoMapa);
		
		JButton btnMostrarClima = new JButton("Mostrar");
		btnMostrarClima.setBounds(33, 222, 78, 21);
		panelMapa.add(btnMostrarClima);
		
		JLabel lblNewLabel = new JLabel("Selecciona la comunidad autonoma");
		lblNewLabel.setBounds(10, 151, 206, 13);
		panelMapa.add(lblNewLabel);
		
		for(int i =0 ;i < comunidadesAutonomas.length;i++) {
			comboBox.addItem(comunidadesAutonomas[i]);
		}
	}
}

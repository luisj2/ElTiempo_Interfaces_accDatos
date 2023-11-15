package Vista;

import java.awt.EventQueue;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;

public class VistaTiempo extends JFrame {

	// Elementos inicializados
	public JPanel contentPane;
	public JPanel panelMapa;
	public JLabel lblMadrid;
	public JLabel lblNewLabel_1;
	public JLabel lblNewLabel_2;
	public JLabel lblNewLabel_1_1;
	public JLabel lblNewLabel_1_2;
	public JLabel lblNewLabel_1_4;
	public JLabel lblNewLabel_1_3;
	public JLabel lblFondoMapa;
	public JButton btnClimaEspania;
	public JComboBox comboDias;
	public JLabel lblRetroalimentacion;
	private String [] dias = {"Hoy","Mañana","En 2 dias","En 3 dias"};
	private  String[] comunidadesAutonomas = {
            "Andalucía", "Aragón", "Asturias", "Islas Baleares", "Canarias", "Cantabria", "Castilla y León",
            "Castilla-La Mancha", "Cataluña", "Extremadura", "Galicia", "Madrid", "Murcia", "Navarra", 
            "País Vasco", "La Rioja", "Comunidad Valenciana", "Ceuta", "Melilla"
        };
	private JLabel lblNewLabel_3;

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
		btnClimaEspania.setBounds(0, 0, 127, 21);
		panelMapa.add(btnClimaEspania);

		lblMadrid = new JLabel("");
		lblMadrid.setBounds(448, 222, 31, 31);
		panelMapa.add(lblMadrid);

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(339, 87, 31, 31);
		panelMapa.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(448, 113, 31, 31);
		panelMapa.add(lblNewLabel_2);

		lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setBounds(349, 146, 31, 31);
		panelMapa.add(lblNewLabel_1_1);

		lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setBounds(279, 58, 31, 31);
		panelMapa.add(lblNewLabel_1_2);

		lblNewLabel_1_4 = new JLabel("");
		lblNewLabel_1_4.setBounds(0, 0, 31, 31);
		panelMapa.add(lblNewLabel_1_4);

		lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setBounds(267, 113, 31, 31);
		panelMapa.add(lblNewLabel_1_3);
		
		JComboBox comboProvincias = new JComboBox();
		comboProvincias.setBounds(10, 174, 116, 21);
		panelMapa.add(comboProvincias);

		lblFondoMapa = new JLabel("");
		lblFondoMapa.setIcon(new ImageIcon("C:\\Users\\Luis Jesus\\git\\ElTiempo\\ElTiempo_Espania\\Imagenes\\spain_prov Buena.png"));
		lblFondoMapa.setBounds(0, 44, 894, 634);
		panelMapa.add(lblFondoMapa);
		
		JButton btnMostrarClima = new JButton("Mostrar");
		btnMostrarClima.setBounds(33, 222, 78, 21);
		panelMapa.add(btnMostrarClima);
		
		JLabel lblNewLabel = new JLabel("Selecciona la comunidad autonoma");
		lblNewLabel.setBounds(10, 151, 206, 13);
		panelMapa.add(lblNewLabel);
		
		lblRetroalimentacion = new JLabel("New label");
		lblRetroalimentacion.setBounds(682, 418, 202, 249);
		panelMapa.add(lblRetroalimentacion);
		
		comboDias = new JComboBox();
		comboDias.setBounds(269, 0, 101, 21);
		panelMapa.add(comboDias);
		
		lblNewLabel_3 = new JLabel("DIa:");
		lblNewLabel_3.setBounds(214, 4, 45, 13);
		panelMapa.add(lblNewLabel_3);
		
		for (int i = 0; i < dias.length; i++) {
			comboDias.addItem(dias[i]);
		}
		
		
		for(int i =0 ;i < comunidadesAutonomas.length;i++) {
			comboProvincias.addItem(comunidadesAutonomas[i]);
		}
		
		
	}
}

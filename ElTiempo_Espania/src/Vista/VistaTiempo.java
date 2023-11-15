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
	public JLabel lblMadrid;
	public JLabel lblNewLabel_1;
	public JLabel lblNewLabel_2;
	public JLabel lblNewLabel_1_1;
	public JLabel lblNewLabel_1_2;
	public JLabel lblNewLabel_1_4;
	public JLabel lblNewLabel_1_3;
	public JLabel lblFondoMapa;
	public JButton btnClimaEspania;
	private  String[] comunidadesAutonomas = {
            "Andalucía", "Aragón", "Asturias", "Islas Baleares", "Canarias", "Cantabria", "Castilla y León",
            "Castilla-La Mancha", "Cataluña", "Extremadura", "Galicia", "Madrid", "Murcia", "Navarra", 
            "País Vasco", "La Rioja", "Comunidad Valenciana", "Ceuta", "Melilla"
        };

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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 174, 116, 21);
		panelMapa.add(comboBox);

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
		
		for(int i =0 ;i < comunidadesAutonomas.length;i++) {
			comboBox.addItem(comunidadesAutonomas[i]);
		}
	}
}

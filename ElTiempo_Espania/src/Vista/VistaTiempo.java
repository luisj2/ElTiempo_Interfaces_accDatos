package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class VistaTiempo extends JFrame {

	private JPanel contentPane;

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
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 79, 894, 634);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblMadrid = new JLabel("");
		lblMadrid.setIcon(new ImageIcon("C:\\Users\\Luis Jesus\\Desktop\\2\u00BADAM\\Interfaces\\Ejercicios_Interfaces\\Meteorologia_Espania\\Imagenes\\nube (1).png"));
		lblMadrid.setBounds(448, 222, 31, 31);
		panel.add(lblMadrid);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Luis Jesus\\Desktop\\2\u00BADAM\\Interfaces\\Ejercicios_Interfaces\\Meteorologia_Espania\\Imagenes\\sol Buena.png"));
		lblNewLabel_1.setBounds(339, 87, 31, 31);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Luis Jesus\\Desktop\\2\u00BADAM\\Interfaces\\Ejercicios_Interfaces\\Meteorologia_Espania\\Imagenes\\tormenta buena.png"));
		lblNewLabel_2.setBounds(448, 113, 31, 31);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setBounds(349, 146, 31, 31);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setBounds(279, 58, 31, 31);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_4 = new JLabel("");
		lblNewLabel_1_4.setBounds(0, 0, 31, 31);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setBounds(267, 113, 31, 31);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblFondoMapa = new JLabel("");
		lblFondoMapa.setIcon(new ImageIcon("C:\\Users\\Luis Jesus\\Desktop\\2\u00BADAM\\Interfaces\\Ejercicios_Interfaces\\Meteorologia_Espania\\Imagenes\\spain_prov Buena.png"));
		lblFondoMapa.setBounds(0, 0, 894, 634);
		panel.add(lblFondoMapa);
	}
}

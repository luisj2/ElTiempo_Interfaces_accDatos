package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

import Vista.VistaTiempo;

public class ControladorTiempo implements ActionListener {

	
	VistaTiempo vista;

	public ControladorTiempo(VistaTiempo vista) {
		this.vista = vista;
		vista.btnClimaEspania.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(vista.btnClimaEspania == e.getSource()) {
			
		}
		
	}
	
	public void elegirClima (String clima) {
		
		switch (clima) {
		case "Soleado":
			
			break;

		default:
			break;
		}
	}
	
	
	
	
}

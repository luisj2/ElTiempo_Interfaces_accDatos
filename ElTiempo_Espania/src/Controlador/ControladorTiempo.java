package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

import Vista.VistaTiempo;

public class ControladorTiempo implements ActionListener {

	public String[] provincias = {
			"Lugo", "Ourense", "ACorunia", "Pontevedra", "Oviedo", "Soria", "Burgos", "Segovia", "Palencia", "Valladolid", "Avila", "Leon",
			"Zamora", "Salamanca", "Santander", "Alava", "Pamplona", "Logronio", "Huesca", "Zaragoza", "Teruel", "Lleida", "Girona", "Barcelona",
			"Tarragona", "Madrid", "Caceres", "Badajoz", "Toledo", "Cuenca", "Guadalajara", "Albacete", "CiudadReal", "Valencia", "Castellon", 
			"Alicante", "Murcia", "PalmaDeMayorca", "Tenerife", "Almeria", "Jaen", "Granada", "Cordoba", "Malaga", "Sevilla", "Cadiz", "Huelva", 
			"Ceuta", "Melilla"
	};
	
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

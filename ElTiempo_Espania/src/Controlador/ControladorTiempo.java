package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Set;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import Modelo.Ciudad;
import Vista.VistaTiempo;

public class ControladorTiempo implements ActionListener {

	public String[] provincias = { "Lugo", "Ourense", "ACorunia", "Pontevedra", "Oviedo", "Soria", "Burgos", "Segovia",
			"Palencia", "Valladolid", "Avila", "Leon", "Zamora", "Salamanca", "Santander", "Alava", "Pamplona",
			"Logronio", "Huesca", "Zaragoza", "Teruel", "Lleida", "Girona", "Barcelona", "Tarragona", "Madrid",
			"Caceres", "Badajoz", "Toledo", "Cuenca", "Guadalajara", "Albacete", "CiudadReal", "Valencia", "Castellon",
			"Alicante", "Murcia", "PalmaDeMayorca", "Tenerife", "Almeria", "Jaen", "Granada", "Cordoba", "Malaga",
			"Sevilla", "Cadiz", "Huelva", "Ceuta", "Melilla" };

	VistaTiempo vista;

	public ControladorTiempo(VistaTiempo vista) {
		this.vista = vista;
		vista.btnClimaEspania.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == vista.btnClimaEspania) {

			accederValorPorperties();

		}

	}

	public void elegirClima(String clima, JLabel label) {

		switch (clima) {
		case "Soleado":
			label.setIcon(new ImageIcon("Imagenes/sol Buena.png"));
			break;
		case "Periodos de sol":
			label.setIcon(new ImageIcon("Imagenes/Nubes bueno.png"));
			break;
		case "Chubascos debiles":
			label.setIcon(new ImageIcon("Images/lluvia_buena.png"));
			break;

		case "Chubascos":
			label.setIcon(new ImageIcon("Images/lluvia-muy-fuerte_buena.png"));
			break;

		}

	}

	public void accederValorPorperties() {
		Properties configuracion = null;
		InputStream entrada = null;
		String link = "";

		try {
			configuracion = new Properties();
			configuracion.load(new FileReader("config.properties"));
			// Cargar el archivo de propiedades
			// entrada = new FileInputStream("config.properties");

			Set<String> ciudades = configuracion.stringPropertyNames();
			
			Gson gson = new Gson();
			

			// for (String ciudad : ciudades) {
			link = configuracion.getProperty("Madrid");

			if (link != null) {
				URL url = new URL(link);

				// Abrir conexión HTTP
				HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
				// Configurar la solicitud como GET
				conexion.setRequestMethod("GET");

				// Obtener la respuesta
				int codigoRespuesta = conexion.getResponseCode();

				// Leer la respuesta
				if (codigoRespuesta == HttpURLConnection.HTTP_OK) {
					BufferedReader lector = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
					String linea;
					String respuesta = "";

					while ((linea = lector.readLine()) != null) {
						respuesta += linea;
					}

					lector.close();
					
					Ciudad c = gson.fromJson(respuesta, Ciudad.class);

					// el String qu etiene toda el contenido de la pagina

					// Crear un objeto JsonParser
					/*
					JsonParser jsonParser = new JsonParser();

					// Convertir el JSON a un objeto JsonObject
					JsonObject jsonObject = jsonParser.parse(respuesta).getAsJsonObject();

					// Obtener los Datos
					String fecha = jsonObject.getAsJsonPrimitive("forecastDate").getAsString();
					String clima = jsonObject.getAsJsonPrimitive("weather").getAsString();
					String maxTemp = jsonObject.getAsJsonPrimitive("maxTemp").getAsString();
					String minTemp = jsonObject.getAsJsonPrimitive("minTemp").getAsString();
					

					vista.lblRetroalimentacion.setText(
							"fecha:" + fecha + " clima:" + clima + " maxTemp:" + maxTemp + " minTemp:" + minTemp);
					// comprobar que las fechas son del dia indicado
					 * */
					 
					//String fechaEs = deCuandoFecha(fecha);
					// comparamos del dia que es el objeto que hemos sacado con el dia que hay
					// introducido
					// if (fechaEs.equalsIgnoreCase(vista.comboDias.toString())) {
					vista.lblRetroalimentacion.setText(
							"fecha:" + c.getFecha() + " clima:" + c.getClima() + " maxTemp:" + c.getTempMax() + " minTemp:" + c.getTempMin());
					CambiarImagen(c.getClima(), c.getCiudad());

				} else {
					vista.lblRetroalimentacion.setText("Error en la solicitud. Código de respuesta:" + codigoRespuesta);
				}
			} else {
				vista.lblRetroalimentacion.setText("El link es null");
			}
			// }

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Cerrar la conexión en el bloque finally

			if (entrada != null) {
				try {
					entrada.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	private String deCuandoFecha(String fecha) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date date = sdf.parse(fecha);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		Calendar hoy = Calendar.getInstance();

		String resultado = sacarFechaString(calendar, hoy);
		return resultado;
	}

	private String sacarFechaString(Calendar fecha, Calendar hoy) {
		String resultado = "";
		Calendar maniana = hoy;
		maniana.add(Calendar.DAY_OF_MONTH, 1);
		Calendar en2Dias = maniana;
		en2Dias.add(Calendar.DAY_OF_MONTH, 1);
		Calendar en3Dias = en2Dias;
		en3Dias.add(Calendar.DAY_OF_MONTH, 1);
		if (fecha.get(Calendar.YEAR) == hoy.get(Calendar.YEAR) && fecha.get(Calendar.MONTH) == hoy.get(Calendar.MONTH)
				&& fecha.get(Calendar.DAY_OF_MONTH) == hoy.get(Calendar.DAY_OF_MONTH)) {
			resultado = "Hoy";
		} else if (fecha.get(Calendar.YEAR) == maniana.get(Calendar.YEAR)
				&& fecha.get(Calendar.MONTH) == maniana.get(Calendar.MONTH)
				&& fecha.get(Calendar.DAY_OF_MONTH) == maniana.get(Calendar.DAY_OF_MONTH)) {
			resultado = "Mañana";
		} else if (fecha.get(Calendar.YEAR) == en2Dias.get(Calendar.YEAR)
				&& fecha.get(Calendar.MONTH) == en2Dias.get(Calendar.MONTH)
				&& fecha.get(Calendar.DAY_OF_MONTH) == en2Dias.get(Calendar.DAY_OF_MONTH)) {
			resultado = "En2Dias";
		} else if (fecha.get(Calendar.YEAR) == en3Dias.get(Calendar.YEAR)
				&& fecha.get(Calendar.MONTH) == en3Dias.get(Calendar.MONTH)
				&& fecha.get(Calendar.DAY_OF_MONTH) == en3Dias.get(Calendar.DAY_OF_MONTH)) {
			resultado = "En3Dias";
		}
		return resultado;
	}

	// cambiar label segun el tiempo
	private void CambiarImagen(String clima, String ciudad) {

		switch (ciudad) {
		case "Lugo":
			elegirClima(clima, vista.lbl_Lugo);
			break;
		case "Ourense":
			elegirClima(clima, vista.lbl_Ourense);
			break;
		case "ACorunia":
			elegirClima(clima, vista.lbl_ACorunia);
			break;
		case "Pontevedra":
			elegirClima(clima, vista.lbl_Pontevedra);
			break;
		case "Oviedo":
			// elegirClima(clima, vista.lbl_Oviedo);
			break;
		case "Soria":
			elegirClima(clima, vista.lbl_Soria);
			break;
		case "Burgos":
			elegirClima(clima, vista.lbl_Burgos);
			break;
		case "Segovia":
			elegirClima(clima, vista.lbl_Segovia);
			break;
		case "Palencia":
			elegirClima(clima, vista.lbl_Palencia);
			break;
		case "Valladolid":
			elegirClima(clima, vista.lbl_Valladolid);
			break;
		case "Avila":
			elegirClima(clima, vista.lbl_Avila);
			break;
		case "Leon":
			elegirClima(clima, vista.lbl_Leon);
			break;
		case "Zamora":
			elegirClima(clima, vista.lbl_Zamora);
			break;
		case "Salamanca":
			elegirClima(clima, vista.lbl_Salamanca);
			break;
		case "Santander":
			// elegirClima(clima, vista.lbl_Santander);
			break;
		case "Alava":
			elegirClima(clima, vista.lbl_Alava);
			break;
		case "Pamplona":
			// elegirClima(clima, vista.lbl_Pamplona);
			break;
		case "Logronio":
			// elegirClima(clima, vista.lbl_Logronio);
			break;
		case "Huesca":
			elegirClima(clima, vista.lbl_Huesca);
			break;
		case "Zaragoza":
			elegirClima(clima, vista.lbl_Zaragoza);
			break;
		case "Teruel":
			elegirClima(clima, vista.lbl_Teruel);
			break;
		case "Lleida":
			elegirClima(clima, vista.lbl_Lleida);
			break;
		case "Girona":
			elegirClima(clima, vista.lbl_Girona);
			break;
		case "Barcelona":
			elegirClima(clima, vista.lbl_Barcelona);
			break;
		case "Tarragona":
			elegirClima(clima, vista.lbl_Tarragona);
			break;
		case "Madrid":
			elegirClima(clima, vista.lbl_Madrid);
			break;
		case "Caceres":
			elegirClima(clima, vista.lbl_Caceres);
			break;
		case "Badajoz":
			elegirClima(clima, vista.lbl_Badajoz);
			break;
		case "Toledo":
			elegirClima(clima, vista.lbl_Toledo);
			break;
		case "Cuenca":
			elegirClima(clima, vista.lbl_Cuenca);
			break;
		case "Guadalajara":
			elegirClima(clima, vista.lbl_Guadalajara);
			break;
		case "Albacete":
			elegirClima(clima, vista.lbl_Albacete);
			break;
		case "CiudadReal":
			elegirClima(clima, vista.lbl_CiudadReal);
			break;
		case "Valencia":
			elegirClima(clima, vista.lbl_Valencia);
			break;
		case "Castellon":
			elegirClima(clima, vista.lbl_Castellon);
			break;
		case "Alicante":
			elegirClima(clima, vista.lbl_Alicante);
			break;
		case "Murcia":
			elegirClima(clima, vista.lbl_Murcia);
			break;
		case "PalmaDeMayorca":
			elegirClima(clima, vista.lbl_PalmaMallorca);
			break;
		case "Tenerife":
			elegirClima(clima, vista.lbl_Tenerife);
			break;
		case "Almeria":
			elegirClima(clima, vista.lbl_Almeria);
			break;
		case "Jaen":
			elegirClima(clima, vista.lbl_Jaen);
			break;
		case "Granada":
			elegirClima(clima, vista.lbl_Granada);
			break;
		case "Cordoba":
			elegirClima(clima, vista.lbl_Cordoba);
			break;
		case "Malaga":
			elegirClima(clima, vista.lbl_Malaga);
			break;
		case "Sevilla":
			elegirClima(clima, vista.lbl_Sevilla);
			break;
		case "Cadiz":
			elegirClima(clima, vista.lbl_Cadiz);
			break;
		case "Huelva":
			elegirClima(clima, vista.lbl_Huelva);
			break;
		case "Ceuta":
			elegirClima(clima, vista.lbl_Ceuta);
			break;
		case "Melilla":
			elegirClima(clima, vista.lbl_Melilla);
			break;
		default:

			break;
		}

	}

}

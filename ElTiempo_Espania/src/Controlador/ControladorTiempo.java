package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import Vista.VistaTiempo;

public class ControladorTiempo implements ActionListener {

	VistaTiempo vista;

	public ControladorTiempo(VistaTiempo vista) {
		this.vista = vista;
		vista.btnClimaEspania.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (vista.btnClimaEspania == e.getSource()) {

		}

	}

	public void elegirClima(String clima, JLabel label) {

		switch (clima) {
		case "Soleado":
			label.setIcon(new ImageIcon("Imagenes/sol Buena.png"));
			break;
		case "":

			break;

		}

	}

	public void accederValorPorperties(String clave) {
		Properties properties = new Properties();
		InputStream entrada = null;

		try {
			// Cargar el archivo de propiedades
			entrada = new FileInputStream("config.properties");

			// Obtener los valores
			properties.load(entrada);

			String link = properties.getProperty(clave);

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
					StringBuilder respuesta = new StringBuilder();

					while ((linea = lector.readLine()) != null) {
						respuesta.append(linea);
					}

					lector.close();

					// el String qu etiene toda el contenido de la pagina
					String contenidoPagina = respuesta.toString();

					// Crear un objeto JsonParser
					JsonParser jsonParser = new JsonParser();

					// Convertir el JSON a un objeto JsonObject
					JsonObject jsonObject = jsonParser.parse(contenidoPagina).getAsJsonObject();

					// Obtener los Datos
					String fecha = jsonObject.getAsJsonPrimitive("forecastDate").getAsString();
					String clima = jsonObject.getAsJsonPrimitive("weather").getAsString();
					String maxTemp = jsonObject.getAsJsonPrimitive("maxTemp").getAsString();
					String minTemp = jsonObject.getAsJsonPrimitive("minTemp").getAsString();

					// comprobar que las fechas son del dia indicado
					String fechaEs = deCuandoFecha(fecha);
					// comparamos del dia que es el objeto que hemos sacado con el dia que hay
					// introducido
					if (fechaEs.equalsIgnoreCase(vista.comboDias.toString())) {
						CambiarImagen(clima, clave);
					}

				} else {
					System.out.println("Error en la solicitud. Código de respuesta: " + codigoRespuesta);
				}
			} else {
				System.out.println("La URL es nula.");
			}
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

			break;

		default:
			break;
		}

	}

}

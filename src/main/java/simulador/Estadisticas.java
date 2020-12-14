/** Modelos y Simulación 2020 - UNSL
 * 
 * @author Guadalupe Medina
 */

package simulador;

import java.text.DecimalFormat;

public class Estadisticas {

	static DecimalFormat decimal = new DecimalFormat("#.##");

	public static void tiempoMedioTransito(float tiempoTransito, int cantidadItems) {
		System.out.println("> Tiempo total de transito: " + (tiempoTransito) + " mins");
		System.out.println("> Tiempo medio de transito: " + (tiempoTransito / cantidadItems) + " mins");
	}

	public static void tiempoMedioEspera(float tiempoEsperaCola, int cantidadItems) {
		System.out.println("\t- Tiempo total de espera: " + decimal.format(tiempoEsperaCola) + " mins");
		System.out.println("\t- Tiempo medio de espera: " + decimal.format(tiempoEsperaCola / cantidadItems) + " mins");
	}

	public static void tiempoMedioOciosidad(float tiempoOcioso, int cantidadItems) {
		System.out.println("\t- Tiempo total de ociosidad: " + decimal.format(tiempoOcioso) + " mins");
		System.out.println("\t- Tiempo medio de ociosidad: " + decimal.format(tiempoOcioso / cantidadItems) + " mins");
	}

	public static void recaudacion(long recaudacion) {
		System.out.println("\t- Recaudacion: $" + (recaudacion));
	}

}

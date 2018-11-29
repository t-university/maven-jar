package com.tsystems.tu;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.tsystems.tu.negocio.logica.ColisionBO;
import com.tsystems.tu.negocio.objetos.AbstractVehiculo;
import com.tsystems.tu.negocio.objetos.Coche;
import com.tsystems.tu.negocio.objetos.Motocicleta;

/**
 * Clase principal.
 * @author krequena
 *
 */
public class Main {
	
	// Objeto logger.
	private static final Logger LOG = LogManager.getLogger();

	/**
	 * Punto de entrada de la aplicación.
	 * @param args Parámetros de entrada.
	 */
	public static void main(String[] args) {
		// Creación de vehículos.
		AbstractVehiculo coche = new Coche(5);
		AbstractVehiculo motocicleta = new Motocicleta();

		// Creación de lista de vehículos.
		List<AbstractVehiculo> vehiculos = new ArrayList<>();
		vehiculos.add(coche);
		vehiculos.add(motocicleta);

		// Creación del objeto de negocio de colisiones.
		ColisionBO colisionBO = new ColisionBO(vehiculos);
		final int puertas = colisionBO.contarPuertas();
		final int ruedas = colisionBO.contarRuedas();
		
		LOG.info("Resultado de la colisión: {} puertas, {} ruedas.", puertas, ruedas);
	}

}

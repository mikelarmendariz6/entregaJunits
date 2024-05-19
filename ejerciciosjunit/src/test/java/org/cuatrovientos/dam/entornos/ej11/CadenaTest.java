/**
 * 
 */
package org.cuatrovientos.dam.entornos.ej11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class CadenaTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.cuatrovientos.dam.entornos.ej11.Cadena#longitud(java.lang.String)}.
	 */
	@Test
	void testLongitud() throws Exception {
		Cadena nuevaCadena = new Cadena();
		
		//expected
		String cadenaTest = "dam";
		int expected = 3;
		String cadenaVacia = null;
		Exception expectedException = new Exception("Cadena vacía");
		
		//actual
		int actual = nuevaCadena.longitud(cadenaTest);
		Exception actualException = null;
		try {
			nuevaCadena.longitud(cadenaVacia);
		}
		catch (Exception e) {
			actualException = e;
		}
		
		//Assert
		assertEquals(expected, actual, "Longitud de cadena no calculada correctamente");
		assertEquals(expectedException.getMessage(), actualException.getMessage(), "No hay control de nulos en la cadena");
	}

	/**
	 * Test method for {@link org.cuatrovientos.dam.entornos.ej11.Cadena#vocales(java.lang.String)}.
	 */
	@Test
	void testVocales() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.cuatrovientos.dam.entornos.ej11.Cadena#invertir(java.lang.String)}.
	 */
	@Test
	void testInvertir() {
		Cadena cadena = new Cadena();
		//expected
		String cadenaEntradaCompleta = "hola";
		String cadenaEntradaVacia = "";
		String cadenaEntradaNula = null;
		String cadenaSalidaCompleta = "aloh";
		String cadenaSalidaVacia = "";
		String cadenaSalidaNula = null;
		
		//actual
		String actualCompleta = cadena.invertir(cadenaEntradaCompleta);
		String actualVacia = cadena.invertir(cadenaEntradaVacia);
		String actualNula = cadena.invertir(cadenaEntradaNula);
		
		//asserts
		assertEquals(cadenaSalidaCompleta, actualCompleta, "Cadenas completas no invertidas correctamente");
		assertEquals(cadenaSalidaVacia, actualVacia, "No se ha tenido en cuenta las cadenas vacías");
		assertEquals(cadenaSalidaNula, actualNula, "");

	}

	/**
	 * Test method for {@link org.cuatrovientos.dam.entornos.ej11.Cadena#contarLetra(java.lang.String, char)}.
	 */
	@Test
	void testContarLetra() {
		fail("Not yet implemented");
	}

}

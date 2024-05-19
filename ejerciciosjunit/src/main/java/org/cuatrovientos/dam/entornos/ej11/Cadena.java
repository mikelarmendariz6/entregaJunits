package org.cuatrovientos.dam.entornos.ej11;

public class Cadena {
	/**
	 * 
	 * @param cadena
	 * @return
	 */
public int longitud(String cadena) throws Exception{
	if (cadena == null) {
		throw new Exception("Cadena vacía");
	}
	return cadena.length();
}
/**
 * 
 * @param cadena
 * @return
 */
public int vocales(String cadena) {
	// TODO
	return 0;
}
/**
 * 
 * @param cadena
 * @return
 */
public String invertir(String cadena) {
	if (cadena == null)
		return cadena;

	String reverseString = "";

	for (int i = cadena.length() - 1; i >= 0; i--) {

		reverseString = reverseString + cadena.charAt(i);
	}
	return reverseString;
	}

/**
 * 
 * @param cadena
 * @param caracter
 * @return
 */
public int contarLetra(String cadena, char caracter) {
	// TODO
	return 0;
}
}

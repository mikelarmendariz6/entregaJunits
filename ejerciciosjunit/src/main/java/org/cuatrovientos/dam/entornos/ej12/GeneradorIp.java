package org.cuatrovientos.dam.entornos.ej12;

import java.util.Random;

public class GeneradorIp {
	Random rnd = new Random();
	public int generarNumero(int min, int max) {
		return rnd.nextInt((max - min) + 1) + min;
	}
	
	public String generarIp(){
		int random1=generarNumero(1, 254);
		int random2=generarNumero(0, 254);
		int random3=generarNumero(0, 254);
		int random4=generarNumero(1, 254);
		return (random1 + "." + random2 + "." + random3 + "." + random4);
	}
}

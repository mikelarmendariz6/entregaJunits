package org.cuatrovientos.dam.entornos.ej22;

import java.util.Random;
import java.util.Vector;

public class Trailer implements Transporte {
	    private Vector<Paquete> paquetes;
	    private int distancia;

	    public Trailer() {
	        this.paquetes = new Vector<>();
	        this.distancia = new Random().nextInt(31) + 270;
	    }

	    @Override
	    public void incluirPaquete(Paquete paquete) {
	        this.paquetes.add(paquete);
	    }

	    @Override
	    public float pesoTotal() {
	        float total = 0;
	        for (Paquete p : this.paquetes) {
	            total += p.getPeso();
	        }
	        return total;
	    }

	    @Override
	    public int recorrerDistancia() {
	        return this.distancia;
	    }
}


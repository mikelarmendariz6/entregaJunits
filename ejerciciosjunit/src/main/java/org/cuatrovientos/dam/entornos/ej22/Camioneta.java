package org.cuatrovientos.dam.entornos.ej22;

import java.util.ArrayList;
import java.util.Random;

public class Camioneta implements Transporte {
    private ArrayList<Paquete> paquetes;
    private int distancia;

    public Camioneta() {
        this.paquetes = new ArrayList<>();
        this.distancia = new Random().nextInt(31) + 70;
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

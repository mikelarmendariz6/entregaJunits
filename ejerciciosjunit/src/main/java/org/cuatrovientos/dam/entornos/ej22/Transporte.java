package org.cuatrovientos.dam.entornos.ej22;

public interface Transporte {
    void incluirPaquete(Paquete paquete);
    float pesoTotal();
    int recorrerDistancia();
}
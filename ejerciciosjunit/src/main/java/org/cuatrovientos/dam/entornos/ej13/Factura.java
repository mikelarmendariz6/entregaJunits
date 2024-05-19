package org.cuatrovientos.dam.entornos.ej13;

import java.util.ArrayList;

public class Factura extends Producto{
    ArrayList<Producto> productos = new ArrayList<>();
	public Factura(String nombre, float precio, int cantidad) {
		super(nombre, precio, cantidad);
	}
	public void meterProducto(Producto producto){
		productos.add(producto);
	}
	public float totalFactura(){
		float total=0;
		for(int i=0; i<productos.size(); i++) {
			total+=productos.get(i).precioTotal();
		}
		return total;
	}
	public float aplicarIva(float iva) {
		return (iva/100)*totalFactura();
	}
}

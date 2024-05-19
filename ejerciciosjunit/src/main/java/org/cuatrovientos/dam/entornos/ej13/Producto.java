package org.cuatrovientos.dam.entornos.ej13;

public class Producto {
String nombre;
float precio;
int cantidad;
public Producto(String nombre, float precio, int cantidad) {
	this.nombre = nombre;
	this.precio = precio;
	this.cantidad = cantidad;
}
public float precioTotal() {
	return cantidad*precio;
}
@Override
public String toString() {
	return "Producto [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
}

}

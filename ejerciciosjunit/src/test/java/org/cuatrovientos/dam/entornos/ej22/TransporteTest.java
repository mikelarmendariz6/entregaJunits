package org.cuatrovientos.dam.entornos.ej22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TransporteTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testPesoTotal() {
		Camioneta camioneta = new Camioneta();
		Paquete paquete = new Paquete("destino", 10.0f);
		camioneta.incluirPaquete(paquete);
		assertEquals(10.0f, camioneta.pesoTotal());
	}

	@Test
	public void testRecorrerDistancia() {
		Camioneta camioneta = new Camioneta();
		assertTrue(camioneta.recorrerDistancia() >= 70 && camioneta.recorrerDistancia() <= 100);
	}
}

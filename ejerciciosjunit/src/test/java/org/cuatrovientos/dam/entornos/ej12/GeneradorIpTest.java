package org.cuatrovientos.dam.entornos.ej12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GeneradorIpTest {

    GeneradorIp generadorIp;

    @BeforeEach
    void setUp() throws Exception {
        generadorIp = new GeneradorIp();
    }

    @AfterEach
    void tearDown() throws Exception {
        generadorIp = null;
    }

    @Test
    public void testGenerarNumero() {
        for (int i = 0; i < 1000; i++) {
            int numero = generadorIp.generarNumero(0, 254);
            assertTrue(numero >= 0 && numero <= 254);
        }
    }

    @Test
    public void testGenerarIp() {
        for (int i = 0; i < 1000; i++) {
            String ip = generadorIp.generarIp();
            String[] partes = ip.split("\\.");
            assertNotEquals("0", partes[0]);
            assertNotEquals("0", partes[3]);
        }
    }
}

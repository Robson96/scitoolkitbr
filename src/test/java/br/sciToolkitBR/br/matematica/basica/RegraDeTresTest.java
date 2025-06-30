package br.sciToolkitBR.br.matematica.basica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RegraDeTresTest {

    @Test
    void testeCalculo() {
        double resultado = RegraDeTres.calcular(2, 10, 4);
        assertEquals(20.0, resultado);
    }

    @Test
    void testDivisaoPorZero() {
        assertThrows(IllegalArgumentException.class, () -> RegraDeTres.calcular(0, 10, 4));
    }
}

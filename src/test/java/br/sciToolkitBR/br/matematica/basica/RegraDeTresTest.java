package br.sciToolkitBR.br.matematica.basica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RegraDeTresTest {

    @Test
    void testeCalculo() {
        double resultado = RegraDeTres.calcular(3, 7, 5);

        assertEquals(11.67, resultado);
    }

    @Test
    void testeDivisaoPorZero() {
        assertThrows(IllegalArgumentException.class, () -> RegraDeTres.calcular(0, 10, 4));
    }
}

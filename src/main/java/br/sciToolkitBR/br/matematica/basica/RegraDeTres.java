package br.sciToolkitBR.br.matematica.basica;

import org.apache.commons.math3.util.Precision;

public class RegraDeTres {
    /**
     * Calcula o valor de uma regra de tres simples:
     * Se A está para B, então C esta para X.
     *
     * Fórmula: X = (B * C) / A
     *
     * @param a valor conhecido
     * @param b valor conhecido
     * @param c valor conhecido
     * @return resultado da regra de tres simples
     * @throws IllegalArgumentException se 'a' for zero
     */
    public static double calcular(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("O valor de 'a' não pode ser zero.");
        }

        var resultado = (b * c) / a;

        return Precision.round(resultado, 2);
    }
}

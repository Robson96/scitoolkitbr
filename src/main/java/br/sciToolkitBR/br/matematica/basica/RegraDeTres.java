package br.sciToolkitBR.br.matematica.basica;

import org.apache.commons.math3.util.Precision;

public class RegraDeTres {
    /**
     * Calcula o valor de uma regra de três simples:
     * Se A está para B, então C está para X.
     *
     * Fórmula: X = (B * C) / A
     *
     * @param a valor conhecido
     * @param b valor conhecido
     * @param c valor conhecido
     * @return resultado da regra de três simples
     * @throws IllegalArgumentException se 'a' for zero
     */
    public static double calcular(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("O valor de 'a' não pode ser zero.");
        }

        var resultado = (b * c) / a;

        return Precision.round(resultado, 2);
    }

    /**
     * Calcula o valor de uma regra de três simples:
     * Se A está para B, então C está para X.
     *
     * Fórmula: X = (A * B) / C
     *
     * @param a valor conhecido
     * @param b valor conhecido
     * @param c valor conhecido
     * @return resultado da regra de três inversamente proporcional
     * @throws IllegalArgumentException se 'c' for zero
     */
    public static double calcularInversamente(double a, double b, double c) {
        if (c == 0) {
            throw new IllegalArgumentException("O valor de 'c' não pode ser zero");
        }

        var resultado = (a * b) / c;

        return Precision.round(resultado, 2);
    }
}
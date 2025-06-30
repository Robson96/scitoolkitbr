package br.sciToolkitBR.br.matematica.basica;

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
        return (b * c) / a;
    }
}

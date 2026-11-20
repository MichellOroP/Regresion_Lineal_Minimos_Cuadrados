
package Ajuste_de_Funciones;

/**
 * Regresion Lineal Simple por Minimos Cuadrados.
 * Incluye correlacion de Pearson y determinacion R2.
 */
public class RegresionLineal {

    public static double[] calcularMinimosCuadrados(
            double[] x, double[] y) {

        if (x == null || y == null ||
                x.length != y.length || x.length < 2) {
            throw new IllegalArgumentException(
                "Los arreglos deben tener el mismo tamaño y al menos 2 datos.");
        }

        int n = x.length;
        double sumX = 0, sumY = 0;
        double sumX2 = 0, sumY2 = 0, sumXY = 0;

        // Calculo de sumatorias
        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumX2 += x[i] * x[i];
            sumY2 += y[i] * y[i];
            sumXY += x[i] * y[i];
        }

        // Regresion lineal por minimos cuadrados
        double numerador = n * sumXY - sumX * sumY;
        double denominadorX = n * sumX2 - sumX * sumX;
        double denominadorY = n * sumY2 - sumY * sumY;

        if (denominadorX <= 0) {
            throw new IllegalArgumentException(
                "Los valores de X deben presentar variacion.");
        }

        double beta1 = numerador / denominadorX;
        double beta0 = (sumY - beta1 * sumX) / n;

        // Coeficiente de correlacion de Pearson
        double pearsonR = 0.0;

        if (denominadorY > 0) {
            pearsonR = numerador /
                Math.sqrt(denominadorX * denominadorY);
        } else {
            throw new IllegalArgumentException(
                "Pearson no esta definido si Y es constante.");
        }

        // Coeficiente de determinacion
        double r2 = pearsonR * pearsonR;

        // Resultados en consola
        System.out.println(
            "--- RESULTADOS DE MINIMOS CUADRADOS Y CORRELACION ---");

        System.out.printf(
            "Sumatorias: n=%d, X=%.1f, Y=%.1f, X2=%.1f, Y2=%.1f, XY=%.1f%n",
            n, sumX, sumY, sumX2, sumY2, sumXY);

        System.out.printf("Pendiente (beta1): %.4f%n", beta1);
        System.out.printf("Ordenada al origen (beta0): %.4f%n", beta0);
        System.out.printf(
            "Modelo obtenido: Y = %.4f + %.4fX%n",
            beta0, beta1);
        System.out.printf(
            "Coeficiente de Pearson (r): %.4f%n", pearsonR);
        System.out.printf(
            "Coeficiente de Determinacion (r2): %.4f%n", r2);

        return new double[]{beta0, beta1, pearsonR, r2};
    }

    // Prediccion utilizando el modelo obtenido
    public static double predecir(
            double beta0, double beta1, double xValor) {
        return beta0 + beta1 * xValor;
    }
}


package Ajuste_de_Funciones;

public class Main {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" METODOS NUMERICOS - UNIDAD 5");
        System.out.println(" REGRESION LINEAL POR MINIMOS CUADRADOS");
        System.out.println("======================================");

        // Datos de prueba
        double[] x = {1, 2, 3, 4, 5};
        double[] y = {2, 4, 5, 4, 5};

        System.out.println("\nDATOS DE ENTRADA");

        for (int i = 0; i < x.length; i++) {
            System.out.printf(
                "Dato %d: X = %.1f, Y = %.1f%n",
                i + 1, x[i], y[i]);
        }

        System.out.println();

        // Ejecutar regresion lineal
        double[] resultados =
            RegresionLineal.calcularMinimosCuadrados(x, y);

        // Obtener coeficientes
        double beta0 = resultados[0];
        double beta1 = resultados[1];

        // Realizar una prediccion
        double valorX = 6;
        double prediccion =
            RegresionLineal.predecir(beta0, beta1, valorX);

        System.out.println("\n--- PREDICCION ---");
        System.out.printf("Valor de X: %.2f%n", valorX);
        System.out.printf(
            "Valor estimado de Y: %.4f%n", prediccion);

        System.out.println("\nPrograma finalizado correctamente.");
    }
}

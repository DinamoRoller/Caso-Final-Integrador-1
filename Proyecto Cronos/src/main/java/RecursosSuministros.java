import java.util.Arrays;

public class RecursosSuministros {
    // Método para calcular el consumo de recursos
    public static double calcularConsumo(double[] recursos, int intervalo) {
        double consumoTotal = 0;
        for (double recurso : recursos) {
            consumoTotal += recurso * intervalo;
        }
        return consumoTotal;
    }

    // Método para generar estadísticas de recursos
    public static void generarEstadisticas(double[] recursos) {
        double min = Arrays.stream(recursos).min().orElse(0);
        double max = Arrays.stream(recursos).max().orElse(0);
        double media = Arrays.stream(recursos).average().orElse(0);
        System.out.println("Estadísticas de consumo de recursos:");
        System.out.println("Mínimo: " + min);
        System.out.println("Máximo: " + max);
        System.out.println("Media: " + media);
    }

    // Método main para probar la funcionalidad de recursos y suministros
    public static void main(String[] args) {
        double[] recursos = {10, 15, 20}; // Ejemplo, cantidades de recursos (agua, comida, oxígeno)
        int intervalo = 5; // Ejemplo, intervalo de tiempo en días
        double consumoTotal = calcularConsumo(recursos, intervalo);
        System.out.println("Consumo total de recursos en " + intervalo + " días: " + consumoTotal);
        generarEstadisticas(recursos);
    }
}

public class CronometroCosmico {
    private static final double TIERRA_DIAS_POR_ANIO = 365.25;
    private static final double NUEVO_PLANETA_DIAS_POR_ANIO = 400.0; // Ejemplo, reemplazar con el valor real

    // Método para convertir tiempo de la Tierra al nuevo planeta
    public static double convertirTiempo(double tiempoTierra) {
        return tiempoTierra * (NUEVO_PLANETA_DIAS_POR_ANIO / TIERRA_DIAS_POR_ANIO);
    }

    // Método para calcular los límites de representación de datos
    public static void calcularLimites() {
        System.out.println("Límites de representación de datos en el nuevo planeta:");
        System.out.println("Máximo entero: " + Integer.MAX_VALUE);
        System.out.println("Mínimo entero: " + Integer.MIN_VALUE);
        System.out.println("Máximo doble: " + Double.MAX_VALUE);
        System.out.println("Mínimo doble: " + Double.MIN_VALUE);
    }

    // Método main para probar la funcionalidad del cronómetro cósmico
    public static void main(String[] args) {
        double tiempoTierra = 1000; // Ejemplo, tiempo en la Tierra en días
        double tiempoNuevoPlaneta = convertirTiempo(tiempoTierra);
        System.out.println(tiempoTierra + " días en la Tierra equivalen a " + tiempoNuevoPlaneta + " días en el nuevo planeta.");
        calcularLimites();
    }
}

import java.util.Arrays;

public class PlanificadorTareas {
    // Método para calcular la carga de trabajo óptima usando el producto escalar
    public static double calcularCargaTrabajo(double[] tareas, double[] rendimientos) {
        double cargaTrabajo = 0;
        for (int i = 0; i < tareas.length; i++) {
            cargaTrabajo += tareas[i] * rendimientos[i];
        }
        return cargaTrabajo;
    }

    // Método para visualizar tablas de tareas
    public static void visualizarTareas(double[][] tablaTareas) {
        System.out.println("Tablas de tareas:");
        for (double[] fila : tablaTareas) {
            System.out.println(Arrays.toString(fila));
        }
    }

    // Método main para probar la funcionalidad del planificador de tareas
    public static void main(String[] args) {
        double[] tareas = {1, 2, 3}; // Ejemplo, duración de tareas
        double[] rendimientos = {10, 20, 30}; // Ejemplo, rendimiento por tarea
        double cargaTrabajo = calcularCargaTrabajo(tareas, rendimientos);
        System.out.println("Carga de trabajo óptima: " + cargaTrabajo);
        double[][] tablaTareas = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // Ejemplo, tabla de tareas
        visualizarTareas(tablaTareas);
    }
}

import java.util.ArrayList;
import java.util.List;

public class AlertaMonitoreo {
    // Método para monitorear factores críticos
    public static void monitorearFactores(double[] factores) {
        double umbral = 100; // Ejemplo, umbral crítico
        List<Integer> eventosCriticos = new ArrayList<>();
        for (int i = 0; i < factores.length; i++) {
            if (factores[i] > umbral) {
                eventosCriticos.add(i);
                System.out.println("Alerta: Factor crítico detectado en el evento " + i);
            }
        }
        System.out.println("Eventos críticos detectados: " + eventosCriticos);
    }

    // Método para descomponer problemas complejos
    public static void descomponerProblema(int numero) {
        System.out.println("Descomposición en factores primos del número " + numero + ":");
        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                System.out.print(i + " ");
                numero /= i;
            }
        }
    }

    // Método main para probar la funcionalidad del sistema de alerta y monitoreo
    public static void main(String[] args) {
        double[] factores = {90, 110, 80, 120}; // Ejemplo, niveles de radiación, temperatura, etc.
        monitorearFactores(factores);
        descomponerProblema(100); // Ejemplo, descomposición de un número
    }
}

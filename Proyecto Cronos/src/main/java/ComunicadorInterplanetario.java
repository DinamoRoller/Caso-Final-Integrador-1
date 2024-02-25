public class ComunicadorInterplanetario {
    // Método para contar vocales en un mensaje
    public static int contarVocales(String mensaje) {
        int contador = 0;
        for (char c : mensaje.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }

    // Método para invertir un mensaje
    public static String invertirMensaje(String mensaje) {
        return new StringBuilder(mensaje).reverse().toString();
    }

    // Método para verificar si un mensaje es un palíndromo
    public static boolean esPalindromo(String mensaje) {
        return mensaje.equalsIgnoreCase(invertirMensaje(mensaje));
    }

    // Método main para probar la funcionalidad del comunicador interplanetario
    public static void main(String[] args) {
        String mensaje = "Anita lava la tina"; // Ejemplo, mensaje a procesar
        System.out.println("Número de vocales en el mensaje: " + contarVocales(mensaje));
        System.out.println("Mensaje invertido: " + invertirMensaje(mensaje));
        System.out.println("¿Es palíndromo? " + esPalindromo(mensaje));
    }
}

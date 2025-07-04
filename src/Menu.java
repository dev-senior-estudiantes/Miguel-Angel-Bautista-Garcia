import java.util.Scanner;

public class Menu {
    public static void mostrarMenuPrincipal() {
        System.out.println("\n--- Sistema de Registro de Estudiantes ---");
        System.out.println("1. Registrar datos de un estudiante");
        System.out.println("2. Mostrar datos del estudiante actual");
        System.out.println("3. Calcular promedio de notas del estudiante actual");
        System.out.println("0. Salir");
    }
    
    public static int obtenerOpcion(Scanner scanner) {
        System.out.print("Ingrese su opción: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Por favor ingrese un número.");
            scanner.next(); // Limpiar el buffer
            System.out.print("Ingrese su opción: ");
        }
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        return opcion;
    }
}
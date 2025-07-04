import java.util.Scanner;

public class Validaciones {
    public static boolean validarNota(double nota) {
        return nota >= 0 && nota <= 100;
    }
    
    public static boolean validarNombre(String nombre) {
        return nombre != null && !nombre.trim().isEmpty();
    }
    
    public static double pedirNotaValida(Scanner scanner, String mensaje) {
        double nota;
        do {
            System.out.print(mensaje);
            nota = scanner.nextDouble();
            if (!validarNota(nota)) {
                System.out.println("Error: La nota debe estar entre 0 y 100.");
            }
        } while (!validarNota(nota));
        return nota;
    }
    
    public static String pedirNombreValido(Scanner scanner) {
        String nombre;
        do {
            System.out.print("Ingrese el nombre del estudiante: ");
            nombre = scanner.nextLine().trim();
            if (!validarNombre(nombre)) {
                System.out.println("Error: El nombre no puede estar vacío.");
            }
        } while (!validarNombre(nombre));
        return nombre;
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Registro registro = new Registro();
        boolean salir = false;
        
        while (!salir) {
            Menu.mostrarMenuPrincipal();
            int opcion = Menu.obtenerOpcion(scanner);
            
            switch (opcion) {
                case 1:
                    registro.registrarEstudiante(scanner);
                    break;
                case 2:
                    registro.mostrarInfoEstudiante();
                    break;
                case 3:
                    registro.calcularPromedioEstudiante();
                    break;
                case 0:
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
        
        scanner.close();
    }
}
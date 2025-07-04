import java.util.Scanner;

public class Registro {
    private Estudiante estudianteActual;
    
    public Registro() {
        this.estudianteActual = null;
    }
    
    public void registrarEstudiante(Scanner scanner) {
        System.out.println("\n--- Registro de Estudiante ---");
        
        String nombre = Validaciones.pedirNombreValido(scanner);
        
        System.out.println("Ingrese las 3 notas del estudiante (0-100):");
        double nota1 = Validaciones.pedirNotaValida(scanner, "Nota 1: ");
        double nota2 = Validaciones.pedirNotaValida(scanner, "Nota 2: ");
        double nota3 = Validaciones.pedirNotaValida(scanner, "Nota 3: ");
        
        estudianteActual = new Estudiante(nombre, nota1, nota2, nota3);
        System.out.println("Estudiante registrado con éxito!");
    }
    
    public void mostrarInfoEstudiante() {
        System.out.println("\n--- Información del Estudiante ---");
        
        if (estudianteActual == null) {
            System.out.println("No hay ningún estudiante registrado.");
        } else {
            System.out.println("Nombre: " + estudianteActual.getNombre());
            System.out.println("Nota 1: " + estudianteActual.getNota1());
            System.out.println("Nota 2: " + estudianteActual.getNota2());
            System.out.println("Nota 3: " + estudianteActual.getNota3());
        }
    }
    
    public void calcularPromedioEstudiante() {
        if (estudianteActual == null) {
            System.out.println("No hay ningún estudiante registrado.");
            return;
        }
        
        double promedio = estudianteActual.calcularPromedio();
        System.out.printf("\nEl promedio de %s es: %.2f\n", 
                         estudianteActual.getNombre(), promedio);
    }
    
    public boolean hayEstudianteRegistrado() {
        return estudianteActual != null;
    }
}
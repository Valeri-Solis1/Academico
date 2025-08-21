package Academico.Ejercicio;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Estudiante
        System.out.println("--- Creando un objeto Estudiante ---");
        Estudiante miEstudiante = new Estudiante(101, 4, "valeri solis");
        miEstudiante.presentarse();
        miEstudiante.estudiar();
        System.out.println("Semestre actual: " + miEstudiante.obtenerSemestreAcual());
        System.out.println(); // Salto de línea para mejor visualización

        // Crear un objeto de la clase Docente
        System.out.println("--- Creando un objeto Docente ---");
        Docente miDocente = new Docente(205, "Samir Rosero", "Física");
        miDocente.presentarse();
        miDocente.calificar();
    
    }

}

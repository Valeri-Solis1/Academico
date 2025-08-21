package Academico.Ejercicio;

public class Docente {
    private int idDocente;
    private String nombre;
    private String materia;

    public Docente (int id, String nombre, String materia ){
        this.idDocente = id;
        this.nombre = nombre;
        this.materia = materia;
    }

    public void presentarse(){
        System.out.println("mi nombre es " + this.nombre + "y sere su profeosr de la materia " + this.materia);
    }

    public void calificar(){
        System.out.println(this.nombre + " esta calificado su examen");
    }

    
}

package Academico.Ejercicio;

public class Estudiante {
    private int idEstudiante;
    private int semestreActual;
    private String nombre;

    public Estudiante (int id, int semestre, String nombre){
        this.idEstudiante = id;
        this.semestreActual = semestre;
        this.nombre = nombre;

    }
    public void presentarse() {
            System.out.println("hola mi nombre es " + this.nombre + " y estoy en el " + this.semestreActual + " semestre");
    }

    public void estudiar(){
        System.out.println(this.nombre + " esta estudiando ");
    }

    public int obtenerSemestreAcual(){
        return this.semestreActual;
    }


}

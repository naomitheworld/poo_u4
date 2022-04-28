/*
 
 */
package poo_datos;

/**
 *
 * @author gm_na
 */
public class Info {

    String nombre;
    String carrera;
    int semestre;

    public void imprimir(String nom, String c, int s) {
        nombre = nom;
        carrera = c;
        semestre = s;
        System.out.println("Nombre: " + nom);
        System.out.println("Carrera: " + c);
        System.out.println("Semestre: " + s);
    }

    /*public Info(String nombre, String carrera, int semestre) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
    }*/
    public String getNombre() {
        return "Nombre: " + nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return "Carrera: " + carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

  /*  @Override
    public String toString() {

    }*/
}

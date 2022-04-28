/*
nombre, carrera, materia
 */
package poo_datos;

/**
 *
 * @author gm_na
 */
public class Poo_datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hi");
        Info datos = new Info();
        datos.imprimir("Naomi Garcia","ISC",2);
        // encapsulamiento
        String num_con = datos.getNombre() + " " + datos.getCarrera() + " Semestre: " + datos.getSemestre();
        System.out.println("\nDatos generales del alumno: " + num_con);
        
    }
    /*
    public void imprimir() {
        System.out.println("Nombre: " + datos.g);
    }

}

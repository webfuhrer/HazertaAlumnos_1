/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnobd;

/**
 *
 * @author Admin
 */
public class Alumno {
    //Java bean  POJO->Plain old java object
    private String nombre, apellido;
    private int edad;

    public Alumno(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        String aux="NOMBRE: "+nombre+"\n"+"APELLIDO: "+apellido+"\nEDAD: "+edad;
        return aux; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

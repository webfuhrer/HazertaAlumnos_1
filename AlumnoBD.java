/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnobd;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class AlumnoBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // ArrayList<Alumno> lista_alumnos=AccesoFichero.devolverAlumnos();
        int opcion=EntradaSalida.mostrarMenu();
        AccesoBD bd=new AccesoBD();
        while(opcion!=EntradaSalida.SALIR)
        {
                switch(opcion)
                {
                    case EntradaSalida.INSERTAR:
                        Alumno a=EntradaSalida.pedirAlumno();
                        AccesoBD.grabarAlumno(a);
                        break;
                    case EntradaSalida.LISTAR:
                        ArrayList<Alumno> lista_alumnos=AccesoBD.recuperarAlumnos();
                        EntradaSalida.listar(lista_alumnos);
                        break;
                    case EntradaSalida.BUSCAR:
                        String nombre_buscado=EntradaSalida.pedirNombreBuscado();
                        
                        ArrayList<Alumno> alumnos_buscados=AccesoBD.buscarAlumnosPorNombre(nombre_buscado);
                        EntradaSalida.listar(alumnos_buscados);
                        break;
                    
                }
           opcion=EntradaSalida.mostrarMenu();
        }
    }
    
}

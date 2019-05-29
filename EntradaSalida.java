/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnobd;

import alumnobd.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EntradaSalida {
    static final int INSERTAR=1;
    static final int LISTAR=2;
    static final int BUSCAR=3;
    static final int GRABAR=4;
    static final int SALIR=5;
    static int mostrarMenu()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(INSERTAR+"-Insertar alumno");
        System.out.println(LISTAR+"-Listar alumnos");
        System.out.println(BUSCAR+"-Buscar alumno");
        
        System.out.println(SALIR+"-Salir");
        int opcion=sc.nextInt();
        
        //hardcodear  hard code 
        return opcion;
    }

    static Alumno pedirAlumno() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ecriba el nombre del alumno");
        String nombre=sc.nextLine();
        System.out.println("Ecriba el apellido del alumno");
        String apellido=sc.nextLine();
        System.out.println("Ecriba la edad del alumno");
        int edad=sc.nextInt();
        Alumno a=new Alumno(nombre, apellido, edad);
        return a;
    }

    static void listar(ArrayList<Alumno> lista_alumnos) {
        if (lista_alumnos.size()==0)
            {
                System.out.println("No  hay alumnos");
            }
        else
        {
                for(Alumno a: lista_alumnos)
                {
                    System.out.println(a);
                }
        }
    }

    static String pedirNombreBuscado() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el nombre del alumnos buscado");
        String nombre=sc.nextLine();
        return nombre;
    }

    static void mostrarAlumno(Alumno alumno_buscado) {
        
        if (alumno_buscado==null)
        {
            System.out.println("No existe el alumno");
        }
        else
        {
            System.out.println("Encontrado alumno:");
            System.out.println(alumno_buscado);
        }
    }
}

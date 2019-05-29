/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnobd;


import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class AccesoBD {
    private static Connection c=null;
    private static Statement stmt=null;
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/basedatos_hazerta", "root","");
            stmt=c.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void grabarAlumno(Alumno a) {
        String sql="INSERT INTO t_alumnos VALUES('"+a.getNombre()+"', '"+a.getApellido()+
                "', "+a.getEdad()+")";
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    static ArrayList<Alumno> recuperarAlumnos() {
       ArrayList<Alumno> lista_alumnos=new ArrayList<>();
        String sql="SELECT * FROM t_alumnos";
        try {
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                String nombre=rs.getString("nombre");
                String apellido=rs.getString("apellido");
                int edad=rs.getInt("edad");
                Alumno a=new Alumno(nombre, apellido, edad);
                lista_alumnos.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  lista_alumnos;
    }

    static ArrayList<Alumno> buscarAlumnosPorNombre(String nombre_buscado) {
        ArrayList<Alumno> lista_alumnos=new ArrayList<>();
        String sql="SELECT * FROM t_alumnos WHERE nombre LIKE '%"+nombre_buscado+"%'";
        try {
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                String nombre=rs.getString("nombre");
                String apellido=rs.getString("apellido");
                int edad=rs.getInt("edad");
                Alumno a=new Alumno(nombre, apellido, edad);
                lista_alumnos.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  lista_alumnos;
       
    }
    
    
}

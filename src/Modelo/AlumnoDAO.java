package Modelo;

/**
 *
 * @author Jesus
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AlumnoDAO {
    
    ConexionBD conexion;
    String password;
    
    public AlumnoDAO() {
        conexion = new ConexionBD();
    }
    
    //CODIGO DE SQL 
    
    public String contrasenias(int nControl){
        try{
            Connection accesoBD = conexion.establecerConexion();
            Statement contrasenia = accesoBD.createStatement();
            ResultSet resultado = contrasenia.executeQuery("SELECT Contrasenia FROM alumnos WHERE NoControl = " + nControl);
            
            while(resultado.next()){
                password = resultado.getString("Contrasenia");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error Al Obtener Contraseña", "Error", JOptionPane.WARNING_MESSAGE);
        }
        
        return password;
    }
    
    public void agregar(int numeroControl, String nombre, String apellidos, String carrera, String contrasenia){
        try{
            Connection accesoBD = conexion.establecerConexion();
            String query = "INSERT INTO alumnos VALUES (?,?,?,?,?)";
            
            PreparedStatement prepared = accesoBD.prepareStatement(query);
            prepared.setInt(1, numeroControl);
            prepared.setString(2, nombre);
            prepared.setString(3, apellidos);
            prepared.setString(4, carrera);
            prepared.setString(5, contrasenia);
            prepared.execute();
            
            JOptionPane.showMessageDialog(null, "¡Te has registrado con éxito!", "Exito", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error Al Insertar En La Base de Datos", "Error", JOptionPane.WARNING_MESSAGE);
        }
     
    }
    
    public ArrayList<Alumno> cargarBD(){
        ArrayList listaAlumnos = new ArrayList();
        
        Alumno alumno;
        
        try{
            Connection accesoBD = conexion.establecerConexion();
            Statement alumnos = accesoBD.createStatement();
            ResultSet resultado = alumnos.executeQuery("SELECT * FROM alumnos");
            
            while(resultado.next()){
               alumno = new Alumno();
               alumno.setNocontrol(resultado.getInt("NoControl"));
               alumno.setNombre(resultado.getString("Nombre"));
               alumno.setApellidos(resultado.getString("Apellidos"));
               alumno.setCarrera(resultado.getString("Carrera"));
               alumno.setContrasenia(resultado.getString("Contrasenia"));
               listaAlumnos.add(alumno);
               
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error Al Cargar ArrayList", "Erro", JOptionPane.WARNING_MESSAGE);
        }
        return listaAlumnos;
    }
       
}

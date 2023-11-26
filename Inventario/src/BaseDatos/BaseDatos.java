package BaseDatos;
import Principal.Libro;
import Principal.Estudiante;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class BaseDatos {
    static Connection conn = null;
    static Statement stmt = null;
    static PreparedStatement st = null;
  
    public static Connection esteblecerConexion()throws SQLException, ClassNotFoundException{
        try {   
            Class.forName("org.sqlite.JDBC");
            
            String url = "jdbc:sqlite:C:\\SQLite\\inventario.db";
            conn = DriverManager.getConnection(url);
            
            System.out.println("Conexión a la base de datos establecida correctamente");
            System.out.println("La base de datos se ha creado en: " + conn.getMetaData().getURL());
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return conn;
    }
    
    public static void crearTablas() throws ClassNotFoundException, SQLException{
        
        try {
            BaseDatos.esteblecerConexion();
     
            stmt = conn.createStatement();
            String sql = "CREATE TABLE biblioteca"
                    + "(id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + "titulo TEXT NOT NULL, "
                    + "genero TEXT NOT NULL, "
                    + "autor TEXT NOT NULL, "
                    + "año INTEGER NOT NULL, "
                    + "estado TEXT NOT NULL)";
            stmt.executeUpdate(sql);
            
            String sql2 = "CREATE TABLE usuarios"
                    + "(id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + "nombre TEXT NOT NULL, "
                    + "apellido TEXT NOT NULL, "
                    + "cantidadLibros INTEGER NOT NULL, "
                    + "FOREIGN KEY(id) REFERENCES biblioteca(id))";
            stmt.executeUpdate(sql2);
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new ClassCastException(e.getMessage());
        }
    }
    
    public static void cerrar() throws SQLException {
      if (conn != null) {
         conn.close();
      }
   }
    
    public static void insertarLibro(Libro libro) throws SQLException, ClassNotFoundException {
        try {
           
            BaseDatos.esteblecerConexion();
            
            st = conn.prepareStatement("INSERT INTO biblioteca (titulo, genero, autor, año, estado) values (?,?,?,?,?)");
            
            st.setString(1, libro.getTitulo());
            st.setString(2, libro.getGenero());
            st.setString(3, libro.getAutor());
            st.setInt(4, libro.getAño());
            st.setString(5, libro.getEstado());
            st.execute();
            System.out.println("Libro añadido correctamente");
            
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void insertarEstudiante(Estudiante estudiante) throws SQLException, ClassNotFoundException {
        try {
           
            BaseDatos.esteblecerConexion();
            
            st = conn.prepareStatement("INSERT INTO usuarios (nombre, apellido, cantidadLibros) values (?,?,?)");
            
            st.setString(1, estudiante.getNombre());
            st.setString(2, estudiante.getApellido());
            st.setInt(3, estudiante.getCantidadLibros());
            st.execute();
            System.out.println("Estudiante añadido correctamente");
            
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static String buscarLibro(String nombre) throws SQLException, ClassNotFoundException{
        
        String titulo = nombre;
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT estado FROM biblioteca WHERE titulo='" + titulo + "'");
        
        //System.out.println(rs.getString("estado"));
        return rs.getString("estado");
    }
    
    public static String buscarLibro(int id) throws SQLException, ClassNotFoundException{
        
        int identificador = id;
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT estado FROM biblioteca WHERE id='" + identificador + "'");
        
        //System.out.println(rs.getString("estado"));
        return rs.getString("estado");
    }
    
    public static void modificarEstado(String nombre, String estado)throws SQLException, ClassNotFoundException {
        String titulo = nombre;
        stmt = conn.createStatement();
        
        switch(estado){
            case "libre":
                String sql = "UPDATE biblioteca SET estado='ocupado' WHERE titulo='" + titulo + "'";
                stmt.executeUpdate(sql);
                break;
            case "ocupado":
                String sql1 = "UPDATE biblioteca SET estado='libre' WHERE titulo='" + titulo + "'";
                stmt.executeUpdate(sql1);  
                break;
            default:
                System.out.println("Estado no encontrado");
                break;
        }
    }
    
    public static void modificarEstado(int id, String estado)throws SQLException, ClassNotFoundException {
        int identificador = id;
        stmt = conn.createStatement();

        switch(estado){
            case "libre":
                String sql = "UPDATE biblioteca SET estado='ocupado' WHERE id='" + identificador + "'";
                stmt.executeUpdate(sql);
                break;
            case "ocupado":
                String sql1 = "UPDATE biblioteca SET estado='libre' WHERE id='" + identificador + "'";
                stmt.executeUpdate(sql1);  
                break;
            default:
                System.out.println("Estado no encontrado");
                break;
        }
    }
    
    public static void entregarLibro(String nombre, String apellido) throws SQLException{
        stmt = conn.createStatement();
        
        ResultSet rs = stmt.executeQuery("SELECT cantidadLibros FROM usuarios WHERE nombre='" + nombre + "'");
        int cantidadLibrosActual = rs.getInt("cantidadLibros");
        
        String sql = "UPDATE usuarios SET cantidadLibros='" + (cantidadLibrosActual + 1) + "' WHERE nombre='" + nombre + "'";
        stmt.executeUpdate(sql);    
    }
    
    public static void recibirLibro(String nombre, String apellido) throws SQLException{
        stmt = conn.createStatement();
        
        ResultSet rs = stmt.executeQuery("SELECT cantidadLibros FROM usuarios WHERE nombre='" + nombre + "'");
        int cantidadLibrosActual = rs.getInt("cantidadLibros");
        
        String sql = "UPDATE usuarios SET cantidadLibros='" + (cantidadLibrosActual - 1) + "' WHERE nombre='" + nombre + "'";
        stmt.executeUpdate(sql);
    }
}
package Principal;
import java.util.ArrayList;

public class Estudiante extends Persona{
    ArrayList<Libro> listaLibros = new ArrayList<>();
    int cantidadLibros = 0;
    
    public Estudiante(String nombre, String apellido, int id){
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }

    public void retirarLibro(Libro libro){}
    public void devolverLibro(Libro libro){}

    public void getDatos(){
        System.out.println(this.nombre + ", ID: " + this.id);
    }

    public void getLibros(){
        for (Libro l :listaLibros) {
            System.out.println(l.titulo);
        }
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }
}

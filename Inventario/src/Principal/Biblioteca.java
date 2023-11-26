package Principal;
import java.util.ArrayList;

public class Biblioteca {
    public int cantidadLibros = 0;
    public ArrayList<Libro> libros = new ArrayList<Libro>();
    public String nombre;
    private static Biblioteca instance;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarLibros(){

        System.out.println("Libros disponibles:");

        for (Libro l :libros) {
            System.out.println(l.titulo);
        }
    }

    public void entregarLibro(Libro libro){

        boolean existe = false;

        for (Libro l :libros) {
            if (libro.titulo == l.titulo){
                existe = true;
                break;
            }
        }

        if(existe == true) {
            System.out.println(libro.titulo + " listo para retirar");
            libros.remove(libro);
        } else {
            System.out.println(libro.titulo + " no se encuentra disponible en este momento");
        }

    }

    public void guardarLibro(Libro libro){
        libros.add(libro);
        cantidadLibros++;
    }

    public static Biblioteca getInstance(String nombre) {
        if (instance == null) {
            instance = new Biblioteca(nombre);
        }
        return instance;
    }
}

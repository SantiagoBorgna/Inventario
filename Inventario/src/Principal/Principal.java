package Principal;

import PanelGrafico.Pantalla;
import java.sql.SQLException;

public class Principal {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
//        Pantalla pantalla = new Pantalla().setVisible(true);
        //Libro primero = new Libro("Harry Potter y la piedra filosofal", "Fantasía", 1, 1997, "J.K.Rowling");
        //Libro segundo = new Libro("La divina comedia", "Historia", 2, 1321, "Dante Alighieri");
        
        //Fabrica fabrica = new FabricaConcreta();
        //Persona estudiante1 = fabrica.factoryMethod("Juan", "Perez", 1);
        //Persona estudiante2 = fabrica.factoryMethod("Francisco", "Gomez", 2);
        
        //BaseDatos.BaseDatos.insertarLibro(primero);
        //BaseDatos.BaseDatos.insertarLibro(segundo);
        
        //BaseDatos.BaseDatos.insertarEstudiante((Estudiante) estudiante1);
        //BaseDatos.BaseDatos.insertarEstudiante((Estudiante) estudiante2);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
        
        Biblioteca uno =  Biblioteca.getInstance("uno");

        
        //uno.mostrarLibros();
        //estudiante1.retirarLibro();
        //uno.mostrarLibros();
    }
    
}

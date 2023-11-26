package Principal;

public class FabricaConcreta extends Fabrica{
    String nombre;
    int id;

    public Persona factoryMethod(String nombre, String apellido, int id) {
        return new Estudiante(nombre, apellido, id);
    }
}

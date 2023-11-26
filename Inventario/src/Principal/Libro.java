package Principal;

public class Libro {
    public String titulo;
    public String genero;
    public int id;
    public int año;
    public String autor;
    String estado;

    public Libro(String titulo, String genero, int id, int año, String autor) {
        this.titulo = titulo;
        this.genero = genero;
        this.id = id;
        this.año = año;
        this.autor = autor;
        this.estado = "libre";
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getId() {
        return id;
    }

    public int getAño() {
        return año;
    }

    public String getAutor() {
        return autor;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
}

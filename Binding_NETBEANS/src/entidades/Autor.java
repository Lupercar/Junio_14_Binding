package entidades;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private int id;
    private String nombre;
    private List<Libro> libros = new ArrayList<>(); 
    
    public Autor(){
        this(0, "");
    }

    public Autor(int id, String nombre) {
        super();
        this.setId(id);
        this.setLibros(libros);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}//fin class entidades.Autor

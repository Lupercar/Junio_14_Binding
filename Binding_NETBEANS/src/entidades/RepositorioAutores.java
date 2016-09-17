package entidades;

import java.util.ArrayList;
import java.util.List;

public class RepositorioAutores {
    static private List<Autor> autores = new ArrayList<>(); 
    
    static{
        List<Libro> libros = new ArrayList<>();
        
        libros.add(new Libro(1, "Libro1")); 
        libros.add(new Libro(2, "Libro2"));
        
        autores.add(new Autor(1, "Autor1", libros)); 
    }
}//fin class entidades.RepositorioAutores

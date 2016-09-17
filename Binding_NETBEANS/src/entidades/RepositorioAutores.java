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
        
        libros = new ArrayList<>();
        
        libros.add(new Libro(3, "Libro3")); 
        libros.add(new Libro(4, "Libro4"));
        libros.add(new Libro(5, "Libro5"));
        
        autores.add(new Autor(2, "Autor2", libros)); 
    }
    
    public List<Autor> getAutores(){
        return autores; 
    }
}//fin class entidades.RepositorioAutores

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
        
        List<Libro> libros2 = new ArrayList<>();
        
        libros2.add(new Libro(3, "Libro3")); 
        libros2.add(new Libro(4, "Libro4"));
        
        autores.add(new Autor(2, "Autor2", libros2)); 
    }
}//fin class entidades.RepositorioAutores

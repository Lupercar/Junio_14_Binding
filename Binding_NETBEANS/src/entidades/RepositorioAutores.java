package entidades;

import java.util.ArrayList;
import java.util.List;

public class RepositorioAutores {
    static private List<Autor> autores = new ArrayList<>(); 
    
    static{
        autores.add(new Autor(1, "Autor1")); 
    }
}//fin class entidades.RepositorioAutores

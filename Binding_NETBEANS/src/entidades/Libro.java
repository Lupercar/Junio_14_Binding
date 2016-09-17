package entidades;

class Libro {
    private int id;
    private String titulo;
    
    public Libro(){
        
    }
    
    public int getId(){
        return this.id; 
    }
    
    public void setId(int id){
        this.id = id; 
    }
    
    public String getTitulo(){
        return this.titulo; 
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo; 
    }
}//fin class entidades.Libro

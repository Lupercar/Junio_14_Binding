package entidades;

class Libro {
    private int id;
    private String titulo;
    
    public Libro(){
        this(0, ""); 
    }
    
    public Libro(int id, String titulo){
        super(); 
        this.setId(id);
        this.setTitulo(titulo);
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

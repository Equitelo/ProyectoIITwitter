package redsocialproyectoii;

public class Tweets {
    private String usuario;
    private String texto;
    private String fecha;
    private Tweets post[];
    private int numeroTwets;

    public int getNumeroTwets() {
        return numeroTwets;
    }
    
    public Tweets(String usuario, String text, String fecha){
        this.usuario=usuario;
        this.texto=text;
        this.fecha=fecha;
    }
    
    public String getUsuario(){
        return usuario;
    }
    
    public String getText(){
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public void setFecha(String fecha){
        this.fecha=fecha;
    }
    
    public String getFecha(){
        return fecha;
    }
    public Tweets[] getTweets() {
        return this.post;
    }
}

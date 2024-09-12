package redsocialproyectoii;
public class Usuario {
    private String nombre;
    public String user;
    private String pass;
    private String genero;
    private int edad;
    private String fecha;
    //para arreglo de comentarios
    private int indexTweet;
    private Tweets post[];
    
    public Usuario(String nombre, String usuario, String contra,String genero,int edad, String fecha){
        this.nombre=nombre;
        this.user=usuario;
        this.pass=contra;
        this.genero=genero;
        this.edad=edad;
        this.fecha=fecha;
        this.indexTweet=0;
    }
    
    public void setUser(String user){
        this.user=user;
    }
    
    public String getUser() {
        return this.user;
    }
    
    public String getPass() {
        return pass;
    }
    
//    public boolean setTweet(String user, Tweets post){
//        if (indexTweet < this.post.length) {
//            this.post[indexTweet] = post;
//            indexTweet++;
//            return true;
//        }
//        return false;
//    }
//    
//    public Tweets[] getTweets() {
//        return this.post;
//    }
}

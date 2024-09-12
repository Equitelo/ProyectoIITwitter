package redsocialproyectoii;

public class Hashtags {
    private int contador;
    private char signo;
    private String palabra;

    public Hashtags(String palabra){
        this.signo='#';
        this.palabra=palabra;
    }

    public String getPalabra(){
        return this.palabra;
    }

    public Hashtags []hashtag = new Hashtags[100];

    public Hashtags getArreglo(int index){
        return hashtag[index];
    }

    public void agregarHash(Hashtags tendencia){
        if(contador<hashtag.length){
            hashtag[contador]=tendencia;
            contador++;
        }
    }
}

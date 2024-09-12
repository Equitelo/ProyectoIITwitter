/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redsocialproyectoii;

public class AgregarTweet {
    
    Tweets []twittear;
    
    public AgregarTweet(){
        twittear = new Tweets[100];
    }
    
    public Tweets buscarTweets(String tweet){
        for (Tweets t: twittear) {
            if(t!=null && t.getText().equals(tweet)){
                return t;
            }
        }
        return null;
    }
    
    public boolean agregarTweet(String usuario, String texto, String fecha){
        if(buscarTweets(texto)==null){
            for (int pos =0 ; pos < twittear.length ; pos++) {
                if(twittear[pos] == null){
                    twittear[pos] = new Tweets(usuario, texto, fecha);
                    return true;
                }
            }
        }
        return false;
    }
}

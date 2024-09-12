package redsocialproyectoii;

public class AdminUsuarios {
    private static final int MAX_TWITS = 50;
    private static Usuario []admin;
    private static int contador = 0;
//    private static Tweets[] twitsporUsuario = new Tweets[MAX_TWITS];
//    private static Tweets[] twitsUsuarios = new Tweets[MAX_TWITS];

    public AdminUsuarios() {
        admin = new Usuario[10];
    }
    
    public Usuario buscarUsuario(String user){
        for (Usuario usr: admin) {
            if(usr != null && usr.getUser().equals(user)){
                return usr;
            }
        }
        return null;
    }
    public void agregarCuenta(Usuario cuenta){
        if(contador<admin.length){
            admin[contador]=cuenta;
            contador++;
        }
    }
    //Logica para la navegacion en busqueda de Usuarios
    public String [] busquedaLista(String busqueda){
        int cantidad = 0;
        for (int i = 0; i < admin.length; i++) {
            if(admin[i]!=null && admin[i].getUser().toLowerCase().contains(busqueda.toLowerCase())){
                cantidad++;
            }
        }
        if (cantidad==0) {
            return null;
        }
        String[] nombres = new String[cantidad];
        cantidad = 0;
        for (int i = 0; i < admin.length; i++) {
            if(admin[i]!=null && admin[i].getUser().toLowerCase().contains(busqueda.toLowerCase())){
                nombres[cantidad] = admin[i].getUser();
                cantidad++;
            }
        }
        return nombres;
    }
    
    //logica para mantener tweets
    
//    public static Tweets getTweetDeUsuario(String user){
//        for (int i = 0; i < contador; i++) {
//            if(admin[i] != null && admin[i].getUser().equals(user)){
//                return twitsporUsuario[i];
//            }
//        }
//        return null;
//    }
//    
//    public static Tweets obtenerTwitsUsuario(String user){
//        for (int obtenertwi = 0; obtenertwi < contador; obtenertwi++) {
//            if(admin[obtenertwi] != null && admin[obtenertwi].getUser().equals(user)){
//                return twitsUsuarios[obtenertwi];
//            }
//        }
//        return null;
//    }
//    
//    public static String verTweetsUsuario(String user){
//        Tweets twitsUsuario = getTweetDeUsuario(user);
//        if(twitsUsuario == null){
//            return "no hay tweets";
//        }
//        Tweets[] listaTwits = twitsUsuario.getTweets();
//        StringBuilder resultado = new StringBuilder();
//        for (int resul = twitsUsuario.getNumeroTwets() - 1; resul >= 0; resul++) {
//            if (admin[resul]!=null) {
//                return listaTwits[resul];
//            }
//        }
//        return null; 
//    }
}

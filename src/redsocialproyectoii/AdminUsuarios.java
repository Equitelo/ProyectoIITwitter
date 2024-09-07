package redsocialproyectoii;

public class AdminUsuarios {
    private static  AdminUsuarios instance;
    public Usuario[] Admin;
    private int contador = 0;

    public AdminUsuarios() {
        Admin = new Usuario[100];
    }
    
    public static AdminUsuarios getInstance(){
        if (instance==null) {
            instance = new AdminUsuarios();
        }
        return instance;
    }
    
    public boolean BuscarUsuario(String user) {
        for (Usuario search : Admin) {
            if (search != null && search.getUser().equals(user)) {
                return true;
            }
        }
        return false;
    }
    
    public void agregarCuenta(Usuario cuenta){
        if(contador<Admin.length){
            Admin[contador]=cuenta;
            contador++;
        }
    }
    //Logica para la navegacion en busqueda de Usuarios
    public String [] busquedaLista(String busqueda){
        int cantidad = 0;
        for (int i = 0; i < Admin.length; i++) {
            if(Admin[i]!=null && Admin[i].getUser().toLowerCase().contains(busqueda.toLowerCase())){
                cantidad++;
            }
        }
        if (cantidad==0) {
            return null;
        }
        String[] nombres = new String[cantidad];
        cantidad = 0;
        for (int i = 0; i < Admin.length; i++) {
            if(Admin[i]!=null && Admin[i].getUser().toLowerCase().contains(busqueda.toLowerCase())){
                nombres[cantidad] = Admin[i].getUser();
                cantidad++;
            }
        }
        return nombres;
    }
    
}

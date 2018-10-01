package Entrega;

public class Admin {

    private static String corr;
    private static String pass;

    public Admin() {
    }

    public void crear(String correo, String password) {
        corr = correo;
        pass = password;
    }

    public String leer(String correo) {
        return this.pass;
    }

    public void actualizar(String password) {
        this.pass = password;
    }

    public static String getCorr() {
        return corr;
    }
    
    public static String getPass() {
        return pass;
    }
}

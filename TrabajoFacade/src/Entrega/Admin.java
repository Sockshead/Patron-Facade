package Entrega;

public class Admin {

    private static String corr;
    private static String pass;
    private String nomb;
    private String ape;
    private int age;

    public Admin() {
    }

    public void crear(String correo, String password, String nombre, String apellido, int edad) {
        corr = correo;
        pass = password;
        nomb = nombre;
        ape = apellido;
        age = edad;
    }

    public String leer(String correo) {
        String salida = "Contraseña: " + pass + " Nombre: " + nomb + " Apellido: " + ape + " Edad: " + age;
        return salida;
    }

    public void actualizar(String password, String nombre, String apellido, int edad) {
        pass = password;
        nomb = nombre;
        ape = apellido;
        age = edad;
    }

    public static String getCorr() {
        return corr;
    }
    
    public static String getPass() {
        return pass;
    }

    public String getNomb() {
        return nomb;
    }

    public String getApe() {
        return ape;
    }

    public int getAge() {
        return age;
    }
}

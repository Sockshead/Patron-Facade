package Entrega;

public abstract class Usuario implements IUsuario{

    private String Correo;
    private String Pass;
    private String nombre;
    private String apellido;
    private int edad;

    abstract public void adicionar(String correo, String password, String nombre, String apellido, int edad);

    abstract public void modificar(String password, String nombre, String apellido, int edad);

    abstract public String consultar(String correo);

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

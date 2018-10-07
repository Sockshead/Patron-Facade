package Entrega;

public abstract class Usuario implements IUsuario{

    private String Correo;
    private String Pass;

    abstract public void adicionar(String correo, String password);

    abstract public void modificar(String password);

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

}

package Entrega;

public interface IUsuario {

    public void adicionar(String correo, String password);
    public void modificar(String password);
    public String consultar(String correo);
    public String getCorreo();
}

package Entrega;

public interface IUsuario {

    public void adicionar(String correo, String password, String nombre, String apellido, int edad);
    public void modificar(String password, String nombre, String apellido, int edad);
    public String consultar(String correo);
    public String getCorreo();
}

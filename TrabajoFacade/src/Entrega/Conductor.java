package Entrega;

public class Conductor extends Usuario {

    public Conductor() {
        super();
    }

    public void adicionar(String correo, String password) {
        super.setCorreo(correo);
        super.setPass(password);

    }

    public void modificar(String password) {
        super.setPass(password);
    }

    public String consultar(String correo) {
        return super.getPass();
    }
    
}
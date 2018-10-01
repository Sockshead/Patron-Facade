package Entrega;

public class AdapterAdmin extends Usuario {

    private Admin adapterAdmin;

    public AdapterAdmin() {
        super();
        this.adapterAdmin = new Admin();
    }

    public void adicionar(String correo, String password) {
        adapterAdmin.crear(correo, password); 
        super.setCorreo(adapterAdmin.getCorr());
        super.setPass(adapterAdmin.getPass());
    }

    public void modificar(String password) {
        adapterAdmin.actualizar(password);
        super.setPass(adapterAdmin.getPass());
    }

    public String consultar(String correo) {
        return super.getPass();
    }
}
package Entrega;

public class AdapterAdmin extends Usuario {

    private Admin adapterAdmin;

    public AdapterAdmin() {
        super();
        this.adapterAdmin = new Admin();
    }

    public void adicionar(String correo, String password, String nombre, String apellido, int edad) {
        adapterAdmin.crear(correo, password, nombre, apellido, edad); 
        super.setCorreo(adapterAdmin.getCorr());
        super.setPass(adapterAdmin.getPass());
        super.setNombre(adapterAdmin.getNomb());
        super.setApellido(adapterAdmin.getApe());
        super.setEdad(adapterAdmin.getAge());
    }

    public void modificar(String password, String nombre, String apellido, int edad) {
        adapterAdmin.actualizar(password, nombre, apellido, edad);
        super.setPass(adapterAdmin.getPass());
        super.setNombre(adapterAdmin.getNomb());
        super.setApellido(adapterAdmin.getApe());
        super.setEdad(adapterAdmin.getAge());
    }

    public String consultar(String correo) {
        return adapterAdmin.leer(correo);
    }
}
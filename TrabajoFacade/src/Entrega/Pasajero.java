package Entrega;

public class Pasajero extends Usuario {

    public Pasajero() {
        super();
    }

    public void adicionar(String correo, String password, String nombre, String apellido, int edad) {
        super.setCorreo(correo);
        super.setPass(password);
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setEdad(edad);
    }

    public void modificar(String password, String nombre, String apellido, int edad) {
        super.setPass(password);
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setEdad(edad);
    }

    public String consultar(String correo) {
        String salida = "Contraseña: " + super.getPass() + " Nombre: " + super.getNombre() + " Apellido: " + super.getApellido() + " Edad: " + super.getEdad();
        return salida;
    }
}

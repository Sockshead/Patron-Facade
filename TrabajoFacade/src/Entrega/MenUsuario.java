package Entrega;

import javax.swing.JOptionPane;

public class MenUsuario {

    private Facade fac = new Facade();
    private Usuario usuario;

    public MenUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void menuConductor() {
        char opcion;
        do {
            String x = JOptionPane.showInputDialog("=======MENU CONDUCTOR=========\n"
                    + "1. Crear ruta \n"
                    + "2. Historial viajes \n"
                    + "3. Modificar \n"
                    + "4. Consultar \n"
                    + "0. SALIR "
            );
            opcion = x.charAt(0);
            switch (opcion) {
                case '1':
                    System.out.println("WIP");
                    break;
                case '2':
                    System.out.println("WIP");
                    break;
                case '3':
                    String pass = JOptionPane.showInputDialog("Ingrese su nueva contraseña");
                    try {
                        fac.modConductor(usuario.getCorreo(), pass);
                        System.out.println("Conductor Modificado Exitosamente y a tato le tiembla el cora");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case '4':
                    try {
                        String resp = fac.consultarConductor(usuario.getCorreo());
                        JOptionPane.showMessageDialog(null, "El usuario es: " + usuario.getCorreo() + ", su contraseña es: " + resp + " y es un Conductor.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case '0':
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ESE CASO NO EXISTE..!", "Error", 0);
                    break;
            }
        } while (opcion != '0');
    }

    public void menuPasajero() {
        char opcion;
        do {
            String x = JOptionPane.showInputDialog("=======MENU PASAJERO=========\n"
                    + "1. Buscar ruta \n"
                    + "2. Historial viajes \n"
                    + "3. Modificar \n"
                    + "4. Consultar \n"
                    + "0. SALIR "
            );
            opcion = x.charAt(0);
            switch (opcion) {
                case '1':
                    System.out.println("WIP");
                    break;
                case '2':
                    System.out.println("WIP");
                    break;
                case '3':
                    String pass = JOptionPane.showInputDialog("Ingrese su nueva contraseña");
                    try {
                        fac.modPasajero(usuario.getCorreo(), pass);
                        System.out.println("Pasajero Modificado Exitosamente y a tato le tiembla el cora");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case '4':
                    try {
                        String resp = fac.consultarPasajero(usuario.getCorreo());
                        JOptionPane.showMessageDialog(null, "El usuario es: " + usuario.getCorreo() + ", su contraseña es: " + resp + " y es un Pasajero.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case '0':
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ESE CASO NO EXISTE..!", "Error", 0);
                    break;
            }
        } while (opcion != '0');
    }

    public void menuAdmin() {
        char opcion;
        do {
            String x = JOptionPane.showInputDialog("=======MENU ADMINISTRADOR=========\n"
                    + "1. Ingresar multa \n"
                    + "2. Cancelar cuenta \n"
                    + "3. Modificar \n"
                    + "4. Consultar \n"
                    + "0. SALIR "
            );
            opcion = x.charAt(0);
            switch (opcion) {
                case '1':
                    System.out.println("WIP");
                    break;
                case '2':
                    System.out.println("WIP");
                    break;
                case '3':
                    String pass = JOptionPane.showInputDialog("Ingrese su nueva contraseña");
                    try {
                        fac.modAdministrador(usuario.getCorreo(), pass);
                        System.out.println("Administrador Modificado Exitosamente y a tato le tiembla el cora");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case '4':
                    try {
                        String resp = fac.consultarAdministrador(usuario.getCorreo());
                        JOptionPane.showMessageDialog(null, "El usuario es: " + usuario.getCorreo() + ", su contraseña es: " + resp + " y es un Administrador.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case '0':
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ESE CASO NO EXISTE..!", "Error", 0);
                    break;
            }
        } while (opcion != '0');
    }
}

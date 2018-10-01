package Entrega;

import javax.swing.JOptionPane;

public class MenuPpal {

    private String correo;
    private String password;
    private Proxy prox;

    public static void main(String[] args) {
        new MenuPpal();
    }

    public MenuPpal() {
        this.prox = new Proxy();
        this.correo = "";
        this.password = "";
        this.menu();
    }

    private void menu() {
        char opcion;
        do {
            String entrada = JOptionPane.showInputDialog("=======Bienvenido=========\n"
                    + "1. Iniciar Sesion \n "
                    + "2. Crear Usuario \n "
                    + "0. Salir");
            opcion = entrada.charAt(0);
            switch (opcion) {
                case '0':
                    JOptionPane.showMessageDialog(null, "CHAO PESCAO..!", "Despedida", 2);
                    System.exit(0);
                    break;
                case '1':
                    this.inicioSesion();
                    break;
                case '2':
                    this.crearUsuario();
                    break;
            }
        } while (opcion != '0');
    }

    public void inicioSesion() {
        correo = JOptionPane.showInputDialog("Ingrese el correo:");
        password = JOptionPane.showInputDialog("Ingrese la contraseña:");
        try {
            prox.validarUs(correo, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void crearUsuario() {
        char opcion;
        do {
            String entrada = JOptionPane.showInputDialog("=======Crear Nuevo=========\n"
                    + "1. Conductor \n "
                    + "2. Pasajero \n "
                    + "3. Administrador \n "
                    + "0. Regresar");
            opcion = entrada.charAt(0);
            switch (opcion) {
                case '0':
                    this.menu();
                    break;
                case '1':
                    this.casoNuevoConductor();
                    this.menu();
                    break;
                case '2':
                    this.casoNuevoPasajero();
                    this.menu();
                    break;
                case '3':
                    this.casoNuevoAdmin();
                    this.menu();
                    break;
            }
        } while (opcion != '0');
    }

    public void casoNuevoConductor() {
        correo = JOptionPane.showInputDialog("Ingrese el correo:");
        password = JOptionPane.showInputDialog("Ingrese la contraseña:");
        try {
            prox.addUs(correo, password, "conductor");
            System.out.println("Conductor Agregado Exitosamente y a tato le tiembla el cora");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void casoNuevoPasajero() {
        correo = JOptionPane.showInputDialog("Ingrese el correo:");
        password = JOptionPane.showInputDialog("Ingrese la contraseña:");
        try {
            prox.addUs(correo, password, "pasajero");
            System.out.println("Pasajero Agregado Exitosamente y a tato le tiembla el cora");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void casoNuevoAdmin() {
        correo = JOptionPane.showInputDialog("Ingrese el correo:");
        password = JOptionPane.showInputDialog("Ingrese la contraseña:");
        try {
            prox.addUs(correo, password, "admin");
            System.out.println("Administrador Agregado Exitosamente y a tato le tiembla el cora");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

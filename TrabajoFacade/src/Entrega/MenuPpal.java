package Entrega;

import javax.swing.JOptionPane;

public class MenuPpal {

    private String correo;
    private String password;
    private String ID;
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
        ID = JOptionPane.showInputDialog("Ingrese su cedula:");
        correo = JOptionPane.showInputDialog("Ingrese el correo:");
        password = JOptionPane.showInputDialog("Ingrese la contraseña:");
        try {
            prox.validarUs(correo, password, ID);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
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
        ID = JOptionPane.showInputDialog("Ingrese su cedula:");
        correo = JOptionPane.showInputDialog("Ingrese el correo:");
        password = JOptionPane.showInputDialog("Ingrese la contraseña:");
        try {
            prox.addUs(correo, password, ID, "conductor");
            JOptionPane.showMessageDialog(null,"Conductor Agregado Exitosamente y a tato le tiembla el cora");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }

    public void casoNuevoPasajero() {
        ID = JOptionPane.showInputDialog("Ingrese su cedula:");
        correo = JOptionPane.showInputDialog("Ingrese el correo:");
        password = JOptionPane.showInputDialog("Ingrese la contraseña:");
        try {
            prox.addUs(correo, password, ID, "pasajero");
            JOptionPane.showMessageDialog(null,"Pasajero Agregado Exitosamente y a tato le tiembla el cora");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }

    public void casoNuevoAdmin() {
        ID = JOptionPane.showInputDialog("Ingrese su cedula:");
        correo = JOptionPane.showInputDialog("Ingrese el correo:");
        password = JOptionPane.showInputDialog("Ingrese la contraseña:");
        try {
            prox.addUs(correo, password, ID, "admin");
            JOptionPane.showMessageDialog(null,"Administrador Agregado Exitosamente y a tato le tiembla el cora");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
}

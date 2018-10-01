package Entrega;

import javax.swing.JOptionPane;

public class MenUsuario {

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
                    System.out.println("WIP");
                    break;
                case '4':
                    System.out.println("WIP");
                    break;
                case '0':
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ESE CASO NO EXISTE..!", "Error", 0);
                    break;
            }
        } while (opcion != '0');
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
                    System.out.println("WIP");
                    break;
                case '4':
                    System.out.println("WIP");
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
                    System.out.println("WIP");
                    break;
                case '4':
                    System.out.println("WIP");
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

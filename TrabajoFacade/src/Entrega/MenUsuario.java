package Entrega;

import javax.swing.JOptionPane;

public class MenUsuario {

    private Facade fac;
    private Usuario usuario;
    private String ID;

    public MenUsuario(Usuario usuario, Facade fac) {
        this.usuario = usuario;
        this.fac = fac;
    }

    public void menuConductor(String ID) {
        char opcion;
        this.ID = ID;
        do {
            String x = JOptionPane.showInputDialog("=======MENU CONDUCTOR=========\n"
                    + "1. Rutas \n"
                    + "2. Historial viajes \n"
                    + "3. Modificar \n"
                    + "4. Consultar \n"
                    + "0. SALIR "
            );
            opcion = x.charAt(0);
            switch (opcion) {
                case '1':
                    this.rutasC();
                    break;
                case '2':
                    System.out.println("WIP");
                    break;
                case '3':
                    String pass = JOptionPane.showInputDialog("Ingrese su nueva contraseña");
                    try {
                        fac.modConductor(usuario.getCorreo(), pass, ID);
                        System.out.println("Conductor Modificado Exitosamente y a tato le tiembla el cora");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case '4':
                    try {
                        String resp = fac.consultarConductor(usuario.getCorreo(), ID);
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

    public void menuPasajero(String ID) {
        char opcion;
        do {
            String x = JOptionPane.showInputDialog("=======MENU PASAJERO=========\n"
                    + "1. Rutas \n"
                    + "2. Historial viajes \n"
                    + "3. Modificar \n"
                    + "4. Consultar \n"
                    + "0. SALIR "
            );
            opcion = x.charAt(0);
            switch (opcion) {
                case '1':
                    this.rutasP();
                    break;
                case '2':
                    System.out.println("WIP");
                    break;
                case '3':
                    String pass = JOptionPane.showInputDialog("Ingrese su nueva contraseña");
                    try {
                        fac.modPasajero(usuario.getCorreo(), pass, ID);
                        System.out.println("Pasajero Modificado Exitosamente y a tato le tiembla el cora");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case '4':
                    try {
                        String resp = fac.consultarPasajero(usuario.getCorreo(), ID);
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

    public void menuAdmin(String ID) {
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
                        fac.modAdministrador(usuario.getCorreo(), pass, ID);
                        System.out.println("Administrador Modificado Exitosamente y a tato le tiembla el cora");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case '4':
                    try {
                        String resp = fac.consultarAdministrador(usuario.getCorreo(), ID);
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

    private void rutasC() {
        Ruta ruta;
        char opcion;
        do {
            String entrada = JOptionPane.showInputDialog("=======Menu Rutas Conductor=========\n"
                    + "1. Guardar nueva ruta \n "
                    + "2. Ver rutas \n "
                    + "0. Salir");
            opcion = entrada.charAt(0);
            switch (opcion) {
                case '0':
                    JOptionPane.showMessageDialog(null, "CHAO PESCAO..!", "Despedida", 2);
                    System.exit(0);
                    break;
                case '1':
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la ruta:");
                    float valor = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la ruta:"));
                    int cupos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los cupos de su vehiculo:"));
                    String fecha = JOptionPane.showInputDialog("Ingrese la fecha de la ruta:");
                    String hora = JOptionPane.showInputDialog("Ingrese la hora de la ruta:");
                    String destino = JOptionPane.showInputDialog("Ingrese el nombre del destino:");

                    ruta = fac.newRuta(nombre, valor, cupos, fecha, hora, destino);
                    this.addCalle(ruta);
                    
                case '2':
                    System.out.println("Hola");
                    //verRutas();
                    break;
                case '3':
                    break;
            }
        } while (opcion != '0');
    }

    public void addCalle(Ruta ruta) {
        char opcion;
        do {
            String entrada = JOptionPane.showInputDialog("=======Desea agregar una calle?=========\n"
                    + "1. Si \n "
                    + "2. No ");
            opcion = entrada.charAt(0);
            switch (opcion) {
                case '1':
                    float oX = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el punto de origen en X:"));
                    float oY = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el punto de origen en Y:"));
                    float dX = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el punto de destino en X:"));
                    float dY = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el punto de destino en Y:"));
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la calle:");
                    float disM = (float) Math.sqrt((float) Math.pow((dX - oX), 2) + (float) Math.pow((dY - oY), 2));
                    float velocidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la velocidad promedio:"));
                    velocidad = (velocidad * 1000) / 3600;
                    float tiempo = (disM / velocidad) / 60;
                    fac.newCalle(ruta, oX, oY, dX, dY, nombre, disM, tiempo);
                    break;
                case '2':
                    fac.mostrarRuta(ruta);
                    break;
            }
        } while (opcion != '0');
    }

    private void rutasP() {
        char opcion;
        do {
            String entrada = JOptionPane.showInputDialog("=======Menu RutasPasajero=========\n"
                    + "1. Buscar ruta \n "
                    + "2. Ver viajes \n "
                    + "0. Salir");
            opcion = entrada.charAt(0);
            switch (opcion) {
                case '0':
                    JOptionPane.showMessageDialog(null, "CHAO PESCAO..!", "Despedida", 2);
                    System.exit(0);
                    break;
                case '1':

                    break;
                case '2':

                    break;
                case '3':
                    break;
            }
        } while (opcion != '0');
    }

    private void verRutas() {
        Ruta rut;
        for (int i = 0; i < fac.rutas.size(); i++) {
            rut = fac.rutas.get(i);
            rut.mostrar();
        }
    }
}

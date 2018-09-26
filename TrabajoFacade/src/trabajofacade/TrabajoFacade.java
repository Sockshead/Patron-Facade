/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajofacade;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JUan Camilo Posada
 */
public class TrabajoFacade {
    public static void main(String[] args) {
        String correo;
        String password;
        String rol;
        facede f= new facede();

                int entrada = Integer.parseInt(JOptionPane.showInputDialog("1. Conductor \n 2. Pasajero \n 3. Administrador \n 0. Salir"));
                switch (entrada) {
                        case 0:
                            System.exit(0);
                            break;
                        case 1:
                            Usuario usuario = new Conductor();
                            int entrada1 = Integer.parseInt(JOptionPane.showInputDialog("1. Adicionar \n 2. Modificar \n 3. Consultar \n 0. salir \n\n Canelar para retroceder"));
                            switch (entrada1) {
                                case 0:
                                    System.exit(0);
                                    break;
                                case 1:
                                    correo = JOptionPane.showInputDialog("Ingrese el correo:");
                                    if (f.MiLista.isEmpty()) {
                                        password = JOptionPane.showInputDialog("Ingrese la contraseña:");
                                        usuario.adicionar(correo, password);
                                        f.MiLista.add(usuario);
    }
}
                }
    }
}
    
                /*do {
                    switch (entrada) {
                        case 0:
                            System.exit(0);
                            break;
                        case 1:
                            Usuario usuario = new Conductor();
                            int entrada1 = Integer.parseInt(JOptionPane.showInputDialog("1. Adicionar \n 2. Modificar \n 3. Consultar \n 0. salir \n\n Canelar para retroceder"));
                            switch (entrada1) {
                                case 0:
                                    System.exit(0);
                                    break;
                                case 1:
                                    correo = JOptionPane.showInputDialog("Ingrese el correo:");
                                    if (MiLista.isEmpty()) {
                                        password = JOptionPane.showInputDialog("Ingrese la contraseña:");
                                        usuario.adicionar(correo, password);
                                        MiLista.add(usuario);
                                    } else {
                                        for (int i = 0; i < MiLista.size(); i++) {
                                            System.out.println("a tato le tiembla el cora");
                                            Usuario us = MiLista.get(i);
                                            if (us.getCorreo().equalsIgnoreCase(correo) && us instanceof Conductor) {
                                                existe = true;
                                            }
                                        }
                                        if (!existe) {
                                            password = JOptionPane.showInputDialog("Ingrese la contraseña:");
                                            usuario.adicionar(correo, password);
                                            MiLista.add(usuario);

                                        } else {
                                            JOptionPane.showMessageDialog(null, "Correo ya existente");
                                        }
                                    }
                                    break;
                                case 2:
                                    existe = false;
                                    correo = JOptionPane.showInputDialog("Ingrese el correo:");
                                    if (MiLista.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "No hay cuentas registradas");
                                    } else {
                                        for (int i = 0; i < MiLista.size(); i++) {
                                            usuario = MiLista.get(i);
                                            if (usuario.getCorreo().equalsIgnoreCase(correo) && usuario instanceof Conductor) {
                                                existe = true;
                                            }
                                        }
                                        if (existe) {
                                            MiLista.remove(usuario);
                                            password = JOptionPane.showInputDialog("Ingrese la contraseña:");
                                            usuario.modificar(password);
                                            MiLista.add(usuario);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Esta cuenta no existe");
                                        }
                                    }
                                    break;
                                case 3:
                                    existe = false;
                                    correo = JOptionPane.showInputDialog("Ingrese el correo:");
                                    if (MiLista.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "No hay cuentas registradas");

                                    } else {
                                        for (int i = 0; i < MiLista.size(); i++) {
                                            usuario  = MiLista.get(i);
                                            if (usuario.getCorreo().equalsIgnoreCase(correo) && usuario instanceof Conductor) {
                                                existe = true;
                                            }
                                        }
                                        if (existe) {
                                            JOptionPane.showMessageDialog(null, "La contraseña es: " + usuario.consultar(correo));
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Esta cuenta no existe");
                                        }
                                    }
                                    break;
                            }
                            break;
                        //
                        case 2:
                            existe = false;
                            usuario = new Pasajero();
                            int entrada2 = Integer.parseInt(JOptionPane.showInputDialog("1. Adicionar \n 2. Modificar \n 3. Consultar \n 0. salir \n\n Canelar para retroceder"));
                            switch (entrada2) {
                                case 0:
                                    System.exit(0);
                                    break;
                                case 1:
                                    correo = JOptionPane.showInputDialog("Ingrese el correo:");
                                    if (MiLista.isEmpty()) {
                                        password = JOptionPane.showInputDialog("Ingrese la contraseña:");
                                        usuario.adicionar(correo, password);
                                        MiLista.add(usuario);
                                    } else {
                                        for (int i = 0; i < MiLista.size(); i++) {
                                            System.out.println("a tato le tiembla el cora");
                                            Usuario us = MiLista.get(i);
                                            if (us.getCorreo().equalsIgnoreCase(correo) && us instanceof Pasajero) {
                                                existe = true;
                                            }

                                        }
                                        if (!existe) {
                                            password = JOptionPane.showInputDialog("Ingrese la contraseña:");
                                            usuario.adicionar(correo, password);
                                            MiLista.add(usuario);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Correo ya existente");
                                        }
                                    }
                                    break;
                                case 2:
                                    existe = false;
                                    correo = JOptionPane.showInputDialog("Ingrese el correo:");
                                    if (MiLista.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "No hay cuentas registradas");
                                    } else {
                                        for (int i = 0; i < MiLista.size(); i++) {
                                            usuario = MiLista.get(i);
                                            if (usuario.getCorreo().equalsIgnoreCase(correo) && usuario instanceof Pasajero) {
                                                existe = true;
                                            }
                                        }
                                        if (existe) {
                                            password = JOptionPane.showInputDialog("Ingrese la contraseña:");
                                            usuario.modificar( password);
                                            MiLista.add(usuario);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Esta cuenta no existe");
                                        }
                                    }
                                    break;
                                case 3:
                                    existe = false;
                                    correo = JOptionPane.showInputDialog("Ingrese el correo:");
                                    if (MiLista.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "No hay cuentas registradas");

                                    } else {
                                        for (int i = 0; i < MiLista.size(); i++) {
                                            usuario= MiLista.get(i);
                                            if (usuario.getCorreo().equalsIgnoreCase(correo) && usuario instanceof Pasajero) {
                                                existe = true;
                                            }
                                        }
                                        if (existe) {
                                            JOptionPane.showMessageDialog(null, "La contraseña es: " + usuario.consultar(correo));
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Esta cuenta no existe");
                                        }
                                    }
                                    break;
                            }
                            break;
                        //
                        case 3:
                            usuario = new AdapterAdmin();
                            existe = false;
                            int entrada3 = Integer.parseInt(JOptionPane.showInputDialog("1. Adicionar \n 2. Modificar \n 3. Consultar \n 0. salir \n\n Canelar para retroceder"));
                            switch (entrada3) {
                                case 0:
                                    System.exit(0);
                                    break;
                                case 1:
                                    correo = JOptionPane.showInputDialog("Ingrese el correo:");
                                    if (MiLista.isEmpty()) {
                                        password = JOptionPane.showInputDialog("Ingrese la contraseña:");
                                        usuario.adicionar(correo, password);
                                        MiLista.add(usuario);
                                    } else {
                                        for (int i = 0; i < MiLista.size(); i++) {
                                            System.out.println("a tato le tiembla el cora");
                                            Usuario us = MiLista.get(i);
                                            if (us.getCorreo().equalsIgnoreCase(correo) && us instanceof AdapterAdmin) {
                                                existe = true;
                                            }
                                        }
                                        if (!existe) {
                                            password = JOptionPane.showInputDialog("Ingrese la contraseña:");
                                            usuario.adicionar(correo, password);
                                            MiLista.add(usuario);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Correo ya existente");
                                        }
                                    }
                                    break;
                                case 2:
                                    existe = false;
                                    correo = JOptionPane.showInputDialog("Ingrese el correo:");
                                    if (MiLista.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "No hay cuentas registradas");
                                    } else {
                                        for (int i = 0; i < MiLista.size(); i++) {
                                            usuario  = MiLista.get(i);
                                            if (usuario.getCorreo().equalsIgnoreCase(correo) && usuario instanceof AdapterAdmin) {
                                                existe = true;
                                            }
                                        }
                                        if (existe) {
                                            MiLista.remove(usuario);
                                            password = JOptionPane.showInputDialog("Ingrese la contraseña:");
                                            usuario.modificar(password);
                                            MiLista.add(usuario);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Esta cuenta no existe");
                                        }
                                    }
                                    break;
                                case 3:
                                    existe = false;
                                    correo = JOptionPane.showInputDialog("Ingrese el correo:");
                                    if (MiLista.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "No hay cuentas registradas");

                                    } else {
                                        for (int i = 0; i < MiLista.size(); i++) {
                                            usuario = MiLista.get(i);
                                            if (usuario.getCorreo().equalsIgnoreCase(correo) && usuario instanceof AdapterAdmin) {
                                                existe = true;
                                            }
                                        }
                                        if (existe) {
                                            JOptionPane.showMessageDialog(null, "La contraseña es: " + usuario.consultar(correo));

                                        } else {
                                            JOptionPane.showMessageDialog(null, "Esta cuenta no existe");

                                        }
                                    }
                                    break;
                            }
                            break;
                    }
                } while ((0 <= entrada && entrada <= 3));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingrese una opcion del menu valida");
                confir = true;
            }
        } while (confir); */



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrega;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Facade {

    public ArrayList<Usuario> usuarios = new ArrayList<>();

    public void agregarConductor(String correo, String password) throws Exception {
        boolean existe = false;
        boolean agregado = false;
        Usuario usuario = new Conductor();
        if (usuarios.isEmpty()) {
            usuario.adicionar(correo, password);
            if (usuarios.add(usuario)) {
                agregado = true;
            }
        } else {
            for (int i = 0; i < usuarios.size(); i++) {
                Usuario us = usuarios.get(i);
                if (us.getCorreo().equalsIgnoreCase(correo) && us instanceof Conductor) {
                    existe = true;
                }
            }
            if (!existe) {
                usuario.adicionar(correo, password);
                if (usuarios.add(usuario)) {
                    agregado = true;
                }
            }
        }
        if (existe) {
            throw new Exception("Conductor con el correo " + correo + " ya existe.");
        }
        if (!agregado) {
            throw new Exception("Conductor no agregado.");
        }
    }

    public void agregarPasajero(String correo, String password) throws Exception {
        boolean existe = false;
        boolean agregado = false;
        Usuario usuario = new Pasajero();

        if (usuarios.isEmpty()) {
            usuario.adicionar(correo, password);
            if (usuarios.add(usuario)) {
                agregado = true;
            }
        } else {
            for (int i = 0; i < usuarios.size(); i++) {
                System.out.println("a tato le tiembla el cora");
                Usuario us = usuarios.get(i);
                if (us.getCorreo().equalsIgnoreCase(correo) && us instanceof Pasajero) {
                    existe = true;
                }
            }
            if (!existe) {
                usuario.adicionar(correo, password);
                if (usuarios.add(usuario)) {
                    agregado = true;
                }
            }
        }
        if (existe) {
            throw new Exception("Pasajero con el correo " + correo + " ya existe.");
        }
        if (!agregado) {
            throw new Exception("Pasajero no agregado.");
        }
    }

    public void agregarAdministador(String correo, String password) throws Exception {
        boolean existe = false;
        boolean agregado = false;
        Usuario usuario = new AdapterAdmin();

        if (usuarios.isEmpty()) {
            usuario.adicionar(correo, password);
            if (usuarios.add(usuario)) {
                agregado = true;
            }
        } else {
            for (int i = 0; i < usuarios.size(); i++) {
                System.out.println("a tato le tiembla el cora");
                Usuario us = usuarios.get(i);
                if (us.getCorreo().equalsIgnoreCase(correo) && us instanceof AdapterAdmin) {
                    existe = true;
                }
            }
            if (!existe) {
                usuario.adicionar(correo, password);
                if (usuarios.add(usuario)) {
                    agregado = true;
                }
            }
        }
        if (existe) {
            throw new Exception("Administrador con el correo " + correo + " ya existe.");
        }
        if (!agregado) {
            throw new Exception("Administrador no agregado.");
        }
    }

    public void modConductor(String correo, String password) throws Exception {
        boolean existe = false;
        Usuario usuario = null;
        if (usuarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay cuentas registradas");
        } else {
            for (int i = 0; i < usuarios.size(); i++) {
                usuario = usuarios.get(i);
                if (usuario.getCorreo().equalsIgnoreCase(correo) && usuario instanceof Conductor) {
                    existe = true;
                }
            }
            if (existe) {
                usuarios.remove(usuario);
                usuario.modificar(password);
                usuarios.add(usuario);
            }
        }
        if (!existe) {
            throw new Exception("Conductor con el correo " + correo + " no existe.");
        }
    }

    public void modPasajero(String correo, String password) throws Exception {
        boolean existe = false;
        Usuario usuario = null;
        if (usuarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay cuentas registradas");
        } else {
            for (int i = 0; i < usuarios.size(); i++) {
                usuario = usuarios.get(i);
                if (usuario.getCorreo().equalsIgnoreCase(correo) && usuario instanceof Conductor) {
                    existe = true;
                }
            }
            if (existe) {
                usuarios.remove(usuario);
                usuario.modificar(password);
                usuarios.add(usuario);
            }
        }
        if (!existe) {
            throw new Exception("Pasajero con el correo " + correo + " no existe.");
        }
    }

    public void modAdministrador(String correo, String password) throws Exception {
        boolean existe = false;
        Usuario usuario = null;
        if (usuarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay cuentas registradas");
        } else {
            for (int i = 0; i < usuarios.size(); i++) {
                usuario = usuarios.get(i);
                if (usuario.getCorreo().equalsIgnoreCase(correo) && usuario instanceof Conductor) {
                    existe = true;
                }
            }
            if (existe) {
                usuarios.remove(usuario);
                usuario.modificar(password);
                usuarios.add(usuario);
            }
        }
        if (!existe) {
            throw new Exception("Administrador con el correo " + correo + " no existe.");
        }
    }

    public String consultarConductor(String correo) throws Exception {
        boolean encontrado = false;
        Usuario usuario = null;
        String found = "";
        
        System.out.println(correo);

        if (usuarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay cuentas registradas");
        } else {
            for (int i = 0; i < usuarios.size(); i++) {
                usuario = usuarios.get(i);
                if (usuario.getCorreo().equalsIgnoreCase(correo) && usuario instanceof Conductor) {
                    encontrado = true;
                }
            }
            if (encontrado) {
                found = usuario.consultar(correo);
            }
        }
        if (!encontrado) {
            throw new Exception("Conductor con el correo " + correo + " no existe.");
        }
        return found;
    }

    public String consultarPasajero(String correo) throws Exception {
        boolean encontrado = false;
        Usuario usuario = null;
        String found = "";

        if (usuarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay cuentas registradas");
        } else {
            for (int i = 0; i < usuarios.size(); i++) {
                usuario = usuarios.get(i);
                if (usuario.getCorreo().equalsIgnoreCase(correo) && usuario instanceof Conductor) {
                    encontrado = true;
                }
            }
            if (encontrado) {
                found = usuario.consultar(correo);
            }
        }
        if (!encontrado) {
            throw new Exception("Conductor con el correo " + correo + " no existe.");
        }
        return found;
    }

    public String consultarAdministrador(String correo) throws Exception {
        boolean encontrado = false;
        Usuario usuario = null;
        String found = "";

        if (usuarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay cuentas registradas");
        } else {
            for (int i = 0; i < usuarios.size(); i++) {
                usuario = usuarios.get(i);
                if (usuario.getCorreo().equalsIgnoreCase(correo) && usuario instanceof Conductor) {
                    encontrado = true;
                }
            }
            if (encontrado) {
                found = usuario.consultar(correo);
            }
        }
        if (!encontrado) {
            throw new Exception("Conductor con el correo " + correo + " no existe.");
        }
        return found;
    }
}

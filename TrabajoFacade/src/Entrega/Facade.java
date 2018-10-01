/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrega;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Facade {

    public ArrayList<Usuario> misUsuarios = new ArrayList<>();

    public void agregarConductor(String correo, String password) throws Exception {
        boolean existe = false;
        boolean agregado = false;
        Usuario usuario = new Conductor();
        if (misUsuarios.isEmpty()) {
            usuario.adicionar(correo, password);
            if (misUsuarios.add(usuario)) {
                agregado = true;
            }
        } else {
            for (int i = 0; i < misUsuarios.size(); i++) {
                Usuario us = misUsuarios.get(i);
                if (us.getCorreo().equalsIgnoreCase(correo) && us instanceof Conductor) {
                    existe = true;
                }
            }
            if (!existe) {
                usuario.adicionar(correo, password);
                if (misUsuarios.add(usuario)) {
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

        if (misUsuarios.isEmpty()) {
            usuario.adicionar(correo, password);
            if (misUsuarios.add(usuario)) {
                agregado = true;
            }
        } else {
            for (int i = 0; i < misUsuarios.size(); i++) {
                System.out.println("a tato le tiembla el cora");
                Usuario us = misUsuarios.get(i);
                if (us.getCorreo().equalsIgnoreCase(correo) && us instanceof Pasajero) {
                    existe = true;
                }
            }
            if (!existe) {
                usuario.adicionar(correo, password);
                if (misUsuarios.add(usuario)) {
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

        if (misUsuarios.isEmpty()) {
            usuario.adicionar(correo, password);
            if (misUsuarios.add(usuario)) {
                agregado = true;
            }
        } else {
            for (int i = 0; i < misUsuarios.size(); i++) {
                System.out.println("a tato le tiembla el cora");
                Usuario us = misUsuarios.get(i);
                if (us.getCorreo().equalsIgnoreCase(correo) && us instanceof AdapterAdmin) {
                    existe = true;
                }
            }
            if (!existe) {
                usuario.adicionar(correo, password);
                if (misUsuarios.add(usuario)) {
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
        
        if (misUsuarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay cuentas registradas");
        } else {
            for (int i = 0; i < misUsuarios.size(); i++) {
                usuario = misUsuarios.get(i);
                if (usuario.getCorreo().equalsIgnoreCase(correo) && usuario instanceof Conductor) {
                    existe = true;
                }
            }
            if (existe) {
                misUsuarios.remove(usuario);
                usuario.modificar(password);
                misUsuarios.add(usuario);
            }
        }
        if (!existe) {
            throw new Exception("Conductor con el correo " + correo + " no existe.");
        }
    }

    public void modPasajero(String correo, String password) throws Exception {
        boolean existe = false;
        Usuario usuario = null;
        
        if (misUsuarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay cuentas registradas");
        } else {
            for (int i = 0; i < misUsuarios.size(); i++) {
                usuario = misUsuarios.get(i);
                if (usuario.getCorreo().equalsIgnoreCase(correo) && usuario instanceof Pasajero) {
                    existe = true;
                }
            }
            if (existe) {
                misUsuarios.remove(usuario);
                usuario.modificar(password);
                misUsuarios.add(usuario);
            }
        }
        if (!existe) {
            throw new Exception("Pasajero con el correo " + correo + " no existe.");
        }
    }

    public void modAdministrador(String correo, String password) throws Exception {
        boolean existe = false;
        Usuario usuario = null;
        
        if (misUsuarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay cuentas registradas");
        } else {
            for (int i = 0; i < misUsuarios.size(); i++) {
                usuario = misUsuarios.get(i);
                if (usuario.getCorreo().equalsIgnoreCase(correo) && usuario instanceof AdapterAdmin) {
                    existe = true;
                }
            }
            if (existe) {
                misUsuarios.remove(usuario);
                usuario.modificar(password);
                misUsuarios.add(usuario);
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

        if (misUsuarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay cuentas registradas");
        } else {
            for (int i = 0; i < misUsuarios.size(); i++) {
                usuario = misUsuarios.get(i);
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

        if (misUsuarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay cuentas registradas");
        } else {
            for (int i = 0; i < misUsuarios.size(); i++) {
                usuario = misUsuarios.get(i);
                if (usuario.getCorreo().equalsIgnoreCase(correo) && usuario instanceof Pasajero) {
                    encontrado = true;
                }
            }
            if (encontrado) {
                found = usuario.consultar(correo);
            }
        }
        if (!encontrado) {
            throw new Exception("Pasajero con el correo " + correo + " no existe.");
        }
        return found;
    }

    public String consultarAdministrador(String correo) throws Exception {
        boolean encontrado = false;
        Usuario usuario = null;
        String found = "";

        if (misUsuarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay cuentas registradas");
        } else {
            for (int i = 0; i < misUsuarios.size(); i++) {
                usuario = misUsuarios.get(i);
                if (usuario.getCorreo().equalsIgnoreCase(correo) && usuario instanceof AdapterAdmin) {
                    encontrado = true;
                }
            }
            if (encontrado) {
                found = usuario.consultar(correo);
            }
        }
        if (!encontrado) {
            throw new Exception("Administrador con el correo " + correo + " no existe.");
        }
        return found;
    }
}

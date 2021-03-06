package Entrega;

import java.util.ArrayList;
import javax.swing.JOptionPane;

class Proxy implements IMenu {

    private static Proxy instanciaUnica = null;
    private ArrayList<Usuario> usuarios;
    private Facade fac;
    MenUsuario menu;
    Usuario user;
    String ID;

    public static Proxy rConstructora() {
        if (instanciaUnica == null) {
            instanciaUnica = new Proxy();
        }
        return instanciaUnica;
    }

    public Proxy() {
        usuarios = new ArrayList();
        fac = new Facade();
    }

    public void performOperations() {
        if (user instanceof AdapterAdmin) {
            menu = new MenUsuario(user, fac);
            menu.menuAdmin(ID);
        } else if (user instanceof Conductor) {
            menu = new MenUsuario(user, fac);
            menu.menuConductor(ID);
        } else if (user instanceof Pasajero) {
            menu = new MenUsuario(user, fac);
            menu.menuPasajero(ID);
        } else {
            JOptionPane.showMessageDialog(null, "You don't have access to this folder");
        }
    }

    public void validarUs(String usuario, String password, String ID) throws Exception {
        Usuario us;
        boolean encontrado = false;

        for (int i = 0; i < usuarios.size(); i++) {
            us = usuarios.get(i);
            if (us.getCorreo().equalsIgnoreCase(usuario) && us.getPass().equalsIgnoreCase(password)) {
                encontrado = true;
                user = us;
                this.ID = ID;
                this.performOperations();
            }
        }
        if (!encontrado) {
            throw new Exception("Usuario no encontrado");
        }
    }

    public void addUs(String correo, String password, String nombre, String apellido, int edad, String ID, String tipo) throws Exception {
        boolean agregado = false;
        Usuario user;
        if (tipo.equalsIgnoreCase("conductor")) {
            try {
                fac.agregarConductor(correo, password, nombre, apellido, edad, ID);
                user = new Conductor();
                user.adicionar(correo, password, nombre, apellido, edad);
                usuarios.add(user);
            } catch (Exception e) {
                throw e;
            }
            agregado = true;
        } else if (tipo.equalsIgnoreCase("pasajero")) {
            try {
                fac.agregarPasajero(correo, password, nombre, apellido, edad, ID);
                user = new Pasajero();
                user.adicionar(correo, password, nombre, apellido, edad);
                usuarios.add(user);
            } catch (Exception e) {
                throw e;
            }
            agregado = true;
        } else if (tipo.equalsIgnoreCase("admin")) {
            try {
                fac.agregarAdministador(correo, password, nombre, apellido, edad, ID);
                user = new AdapterAdmin();
                user.adicionar(correo, password, nombre, apellido, edad);
                usuarios.add(user);
            } catch (Exception e) {
                throw e;
            }
            agregado = true;
        }
        if (!agregado) {
            throw new Exception("Error agregando usuario");
        }
    }

    public void modUs(String correo, String password, String nombre, String apellido, int edad) {
        for (Usuario us : usuarios) {
            if (us.getCorreo().equalsIgnoreCase(correo)) {
                us.modificar(password, nombre, apellido, edad);
            }
        }
    }

    public boolean elimUs(String correo) {
        boolean elim = false;
        for (int a=0;a<usuarios.size();a++) {
            if (usuarios.get(a).getCorreo().equals(correo)) {
                usuarios.remove(a);
                elim=true;
            }
        }
        return elim;
    }

    public MenUsuario getMenu() {
        return menu;
    }

    public void setMenu(MenUsuario menu) {
        this.menu = menu;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

}

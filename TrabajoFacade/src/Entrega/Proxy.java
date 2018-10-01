package Entrega;

import java.util.ArrayList;

class Proxy implements IMenu {

    private static Proxy instanciaUnica = null;
    private ArrayList<Usuario> usuarios;
    private Facade fac;
    MenUsuario menu;
    Usuario user;

    public Proxy() {
        usuarios = new ArrayList();
        fac = new Facade();
    }

    public static Proxy rConstructora() {
        if (instanciaUnica == null) {
            instanciaUnica = new Proxy();
        }
        return instanciaUnica;
    }

    public void performOperations() {
        if (user instanceof AdapterAdmin) {
            menu = new MenUsuario(user);
            menu.menuAdmin();
        } else if (user instanceof Conductor) {
            menu = new MenUsuario(user);
            menu.menuConductor();
        } else if (user instanceof Pasajero) {
            menu = new MenUsuario(user);
            menu.menuPasajero();
        } else {
            System.out.println("You don't have access to this folder");
        }
    }

    public void validarUs(String usuario, String password) throws Exception {
        Usuario us;
        boolean encontrado = false;

        for (int i = 0; i < usuarios.size(); i++) {
            us = usuarios.get(i);
            if (us.getCorreo().equalsIgnoreCase(usuario) && us.consultar(usuario).equalsIgnoreCase(password)) {
                encontrado = true;
                user = us;
                this.performOperations();
            }
        }
        if (!encontrado) {
            throw new Exception("Usuario no encontrado");
        }
    }

    public void addUs(String correo, String password, String tipo) throws Exception {
        boolean agregado = false;
        Usuario user;
        if (tipo.equalsIgnoreCase("conductor")) {
            try {
                fac.agregarConductor(correo, password);
                user = new Conductor();
                user.adicionar(correo, password);
                usuarios.add(user);
            } catch (Exception e) {
                throw e;
            }
            agregado = true;
        } else if (tipo.equalsIgnoreCase("pasajero")) {
            try {
                fac.agregarPasajero(correo, password);
                user = new Pasajero();
                user.adicionar(correo, password);
                usuarios.add(user);
            } catch (Exception e) {
                throw e;
            }
            agregado = true;
        } else if (tipo.equalsIgnoreCase("admin")) {
            try {
                fac.agregarAdministador(correo, password);
                user = new AdapterAdmin();
                user.adicionar(correo, password);
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

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
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

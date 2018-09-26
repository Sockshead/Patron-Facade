/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajofacade;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Facade {

    public ArrayList<Usuario> MiLista = new ArrayList<>();

    public boolean agregarConductor(String correo, String password) {
        boolean existe = false;
        boolean agregado = false;
        Usuario usuario = new Conductor();
        if (MiLista.isEmpty()) {
            usuario.adicionar(correo, password);
            if (MiLista.add(usuario)) {
                agregado = true;

            }
        } else {
            for (int i = 0; i < MiLista.size(); i++) {
                System.out.println("a tato le tiembla el cora");
                Usuario us = MiLista.get(i);
                if (us.getCorreo().equalsIgnoreCase(correo) && us instanceof Conductor) {
                    existe = true;
                }
            }
            if (!existe) {
                usuario.adicionar(correo, password);
                if (MiLista.add(usuario)) {
                    agregado = true;
                }
            }
        }
        return agregado;
    }

    public boolean agregarPasajero(String correo, String password){
    boolean existe = false;
    boolean agregado = false;
    Usuario usuario = new Pasajero();

    if (MiLista.isEmpty ()) {
            usuario.adicionar(correo, password);
        if (MiLista.add(usuario)) {
            agregado = true;

        }
    }

    
        else {
            for (int i = 0; i < MiLista.size(); i++) {
            System.out.println("a tato le tiembla el cora");
            Usuario us = MiLista.get(i);
            if (us.getCorreo().equalsIgnoreCase(correo) && us instanceof Pasajero) {
                existe = true;
            }
        }
        if (!existe) {
            usuario.adicionar(correo, password);
            if (MiLista.add(usuario)) {
                agregado = true;
            }
        }
    }
    return agregado;

}
public boolean agregarAdministador(String correo, String password){
    boolean existe = false;
    boolean agregado = false;
    Usuario usuario = new AdapterAdmin();

    if (MiLista.isEmpty ()) {
            usuario.adicionar(correo, password);
        if (MiLista.add(usuario)) {
            agregado = true;

        }
    }

    
        else {
            for (int i = 0; i < MiLista.size(); i++) {
            System.out.println("a tato le tiembla el cora");
            Usuario us = MiLista.get(i);
            if (us.getCorreo().equalsIgnoreCase(correo) && us instanceof Admin) {
                existe = true;
            }
        }
        if (!existe) {
            usuario.adicionar(correo, password);
            if (MiLista.add(usuario)) {
                agregado = true;
            }
        }
    
}
}
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrega;

import java.util.HashMap;

/**
 *
 * @author JUan Camilo Posada
 */
public class FactoryUsuarios {

    private HashMap<String, IUsuario> miLista = new HashMap();

    public void agregarUsuario(String key, IUsuario user) {
        miLista.put(key, user);
    }
    public void eliminarUsuario(String key) {
        miLista.remove(key);
    }
    public void actualizarUsuario(String key, IUsuario user) {
        IUsuario userR;
        userR= miLista.get(key);
        if(userR==null){
            
        }else{
            miLista.put(key, user);
        }
        miLista.remove(key, user);
    }
}

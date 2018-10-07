package Entrega;

import java.util.HashMap;

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
        userR = miLista.get(key);
        if (userR == null) {

        } else {
            miLista.put(key, user);
        }
    }

    public IUsuario buscar(String key) {
        return miLista.get(key);
    }
}

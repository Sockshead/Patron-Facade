/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajofacade;

/**
 *
 * @author Santiago
 */
public class Conductor extends Usuario {

    public Conductor() {
        super();
    }

    public void adicionar(String correo, String password) {
        super.setCorreo(correo);
        super.setPass(password);

    }

    public void modificar(String password) {
        super.setPass(password);
    }

    public String consultar(String correo) {
        return super.getPass();
    }
    
}
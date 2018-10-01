/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrega;

/**
 *
 * @author Santiago
 */
public class Admin {

    private static String corr;
    private static String pass;

    public Admin() {
    }

    public void crear(String correo, String password) {
        corr = correo;
        pass = password;

    }

    public String leer(String correo) {
        return this.pass;
    }

    public void actualizar( String password) {
        
        this.pass=password;
    }


}
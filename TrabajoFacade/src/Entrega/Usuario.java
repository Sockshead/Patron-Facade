/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrega;

/**
 *
 * @author JUan Camilo Posada
 */
public abstract class Usuario {
      private String Correo;
    private String Pass;
    
    abstract public void adicionar(String correo, String password);
    abstract public void modificar( String password);
    abstract public String consultar(String correo);

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }
    
}

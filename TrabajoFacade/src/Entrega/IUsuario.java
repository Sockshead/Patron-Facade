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
public interface IUsuario {

    public void adicionar(String correo, String password);
    public void modificar(String password);
    public String consultar(String correo);
    public String getCorreo();
}

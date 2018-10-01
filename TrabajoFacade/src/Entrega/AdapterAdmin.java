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
public class AdapterAdmin extends Usuario {

    private Admin adapterAdmin;

    public AdapterAdmin() {
        super();
        this.adapterAdmin = new Admin();
    }

    public void adicionar(String correo, String password) {
        adapterAdmin.crear(correo, password);

        
    }

    public void modificar(String password) {
        adapterAdmin.actualizar(password);
    }

    public String consultar(String correo) {
        String pass = this.adapterAdmin.leer(correo);

        return pass;
    }
    
    public String getCorreo(){
       return adapterAdmin.getCorr();
    }
}
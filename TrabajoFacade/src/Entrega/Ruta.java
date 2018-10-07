package Entrega;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ruta implements Composite {

    private String idConductor;
    private String nombre;
    private float valor;
    private int cupos;
    private ArrayList<String> pasajeros;
    private String fecha;
    private String hora;
    private String destino;
    private ArrayList<Composite> componentes;

    public Ruta(String idConductor, String nombre, float valor, int cupos, String fecha, String hora, String destino) {
        this.setIdConductor(idConductor);
        this.setNombre(nombre);
        this.setValor(valor);
        this.setCupos(cupos);
        pasajeros = new ArrayList();
        this.setFecha(fecha);
        this.setHora(hora);
        this.setDestino(destino);
        this.setComponentes(new ArrayList());
    }

    public Ruta() {
        setNombre("");
        setComponentes(new ArrayList());
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String mostrar() {
        String text = "\n se guardo la ruta " + this.getNombre() + " con el valor de: " + this.getValor() + ", los cupos: " + this.getCupos()
                + " en la fecha: " + this.getFecha() + " a la hora: " + this.getHora() + " hacia el destino: " + this.getDestino() + "\n";
        for (Composite c : this.getComponentes()) {
            text = text + c.mostrar();
        }
        return text;
    }

    public void add(Composite e) {
        getComponentes().add(e);
    }

    public ArrayList<Composite> getComponentes() {
        return componentes;
    }

    private void setComponentes(ArrayList<Composite> componentes) {
        this.componentes = componentes;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public ArrayList<String> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<String> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(String idConductor) {
        this.idConductor = idConductor;
    }

    public void reservaCupo(String id) throws Exception{
        if (cupos != 0) {
            pasajeros.add(id);
            cupos--;
        } else {
            throw new Exception("No hay cupos disponibles en esta ruta");
        }
    }
}

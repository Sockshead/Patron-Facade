package Entrega;

import java.util.ArrayList;

public class Ruta implements Composite {
    private String nombre;
    private float valor;
    private int cupos;
    private String[] pasajeros;
    private String fecha;
    private String hora;
    private String destino;
    private ArrayList <Composite> componentes;
    
    public Ruta(String nombre, float valor, int cupos, String fecha, String hora, String destino){
        this.setNombre(nombre);
        this.setValor(valor);
        this.setCupos(cupos);
        pasajeros = new String[this.getCupos()];
        this.setFecha(fecha);
        this.setHora(hora);
        this.setDestino(destino);
        this.setComponentes(new ArrayList());
    }
    
    public Ruta(){
        setNombre("");
        setComponentes(new ArrayList());
    }
    
    public String getNombre(){
        return nombre;
    }
    
    private void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void mostrar(){
        for(Composite c: this.getComponentes()) c.mostrar();
        System.out.println("se guardo la ruta "+this.getNombre()+" con el valor de: "+this.getValor()+", los cupos: "+this.getCupos()
                +" en la fecha: "+this.getFecha()+" a la hora: "+this.getHora()+" hacia el destino: "+this.getDestino());
    }
    
    public void add(Composite e){
        getComponentes().add(e);
    }
    
    public ArrayList<Composite> getComponentes(){
        return componentes;
    }
    
    private void setComponentes(ArrayList<Composite> componentes){
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

    public String[] getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(String[] pasajeros) {
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
}

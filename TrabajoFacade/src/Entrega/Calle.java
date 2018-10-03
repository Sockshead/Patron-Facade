package Entrega;

public class Calle implements Composite{
    private float oX,oY,dX,dY, disM,velocidad, tiempo;
    private String nombre;
    
    public Calle() {
        setNombre("");
    }
    
    public void mostrar(){
        System.out.println("Coordenada de origen en x: "+this.getoX()+" Coordenada de origen en y: "+this.getoY()+" Coordenada de destino en x: "+this.getdX()
                +" Coordenada de destino en y: "+this.getdY()+" nombre de calle: "+this.getNombre()+" distancia en metros: "+this.getDisM()
                +" tiempo en minutos "+this.getTiempo());
    }
    
    public Calle(float oX,float oY,float dX,float dY,String nombre,float disM, float tiempo){
        setoX(oX);
        setoY(oY);
        setdX(dX);
        setdY(dY);
        setNombre(nombre);
        setDisM(disM);
        setTiempo(tiempo);
    }

    public float getVelocidad() {
        return velocidad;
    }

    private void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public float getTiempo() {
        return tiempo;
    }

    private void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }

    public float getoX() {
        return oX;
    }

    private void setoX(float oX) {
        this.oX = oX;
    }

    public float getoY() {
        return oY;
    }

    private void setoY(float oY) {
        this.oY = oY;
    }

    public float getdX() {
        return dX;
    }

    private void setdX(float dX) {
        this.dX = dX;
    }

    public float getdY() {
        return dY;
    }

    private void setdY(float dY) {
        this.dY = dY;
    }

    public float getDisM() {
        return disM;
    }

    private void setDisM(float disM) {
        this.disM = disM;
    }

    public String getNombre(){
        return nombre;
    }
    
    private void setNombre(String nombre){
        this.nombre = nombre;
    }
}

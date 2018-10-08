package Entrega;

public class Baloto extends MediosDePago {

    String fecha;

    public Baloto(component pMediosPago) {
        super(pMediosPago);
    }

    public String mostrarValores() {

        return " Pago realizado por: " + super.mostrarValores() + " Fecha: " + this.fecha;
    }

    public void asignarValores(String pPago) {
        super.asignarValores("Baloto");
        this.fecha = pPago;
    }
}

package Entrega;

public class Efectivo extends MediosDePago {

    String fecha;

    public Efectivo(component pMediosPago) {
        super(pMediosPago);
    }

    public String mostrarValores() {
        return " Pago realizado por: " + super.mostrarValores() + " Fecha: " + this.fecha;
    }

    public void asignarValores(String pPago) {
        super.asignarValores("Efectivo");
        this.fecha = pPago;
    }
}

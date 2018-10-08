package Entrega;

public class Credito extends MediosDePago {

    String fecha;
    String banco;

    public Credito(component pMediosPago) {
        super(pMediosPago);
    }

    public String mostrarValores() {
        return " Pago realizado por: " + super.mostrarValores() + " fecha: " + this.fecha + " banco: " + this.banco;
    }

    public void asignarValores(String pPago) {
        super.asignarValores("Credito");
        String[] info = pPago.split(",");
        this.fecha = info[0];
        this.banco = info[1];
    }
}

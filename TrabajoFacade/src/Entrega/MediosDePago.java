package Entrega;

abstract class MediosDePago implements component {

    protected component mediosPagopse;
    protected String mediopag = "";

    public MediosDePago(component pMediosPago) {
        mediosPagopse = pMediosPago;
    }

    public String mostrarValores() {
        return this.mediosPagopse.mostrarValores() + " Pago realizado por: " + mediopag;
    }

        public void asignarValores(String pPago) {
            this.mediopag = pPago;
        }
}

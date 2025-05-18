public abstract class MetodoPago {
    protected double monto;

    public MetodoPago(double monto){
        this.monto = monto;
    }

    public abstract void procesarPago();

    public void mostrarResumen() {
        System.out.println("------------------------------");
        System.out.println("|     RESUMEN   DE   PAGO     |");
        System.out.println("| * Monto -> $"+monto);
        System.out.println("------------------------------");
    }

    public abstract boolean autenticar();
}

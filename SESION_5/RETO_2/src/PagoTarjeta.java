public class PagoTarjeta extends MetodoPago{

    private double fondo;
    public PagoTarjeta(double monto, double fondo){
        super(monto);
        this.fondo = fondo;
    }

    @Override
    public void procesarPago(){
        System.out.println("Tipo de pago: Pago con tarjeta");
        System.out.println("   Pagando  : $"+monto);
    }

    @Override
    public boolean autenticar() {
        return fondo >= monto;
    }
}

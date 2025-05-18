public class PagoTransferencia extends MetodoPago{
    private boolean validar;

    public PagoTransferencia(double monto, boolean validar) {
        super(monto);
        this.validar = validar;
    }
    @Override
    public void procesarPago() {
        System.out.println("Tipo de pago: Transferencia");
        System.out.println("   Pagando  : $"+monto);
    }

    @Override
    public boolean autenticar() {
        return validar;
    }
}

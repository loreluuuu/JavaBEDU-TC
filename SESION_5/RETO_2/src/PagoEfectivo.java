public class PagoEfectivo extends MetodoPago {

    public PagoEfectivo(double monto){
        super(monto);
    }

    @Override
    public void procesarPago(){
        System.out.println("Tipo de pago: Efectivo");
        System.out.println("   Pagando  : $"+monto);
    }

    @Override
    public boolean autenticar() {
        return true;
    }
}

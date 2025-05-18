public class CajaRegistradora {
    public static void main(String[] args) {
        MetodoPago[] pagos = {
                new PagoEfectivo(5300),
                new PagoTarjeta(784, 1300),
                new PagoTransferencia(250, false)
        };

        for (MetodoPago pago : pagos) {
            if (pago.autenticar()) {
                System.out.println("------------------------------");
                System.out.println("   Autenticado correctamente  ");
                pago.procesarPago();
                pago.mostrarResumen();
            } else {
                System.out.println(" Fallo de autenticación");
            }
        }
    }
}
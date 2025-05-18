import java.util.Objects;

public class CuentaFiscal {
    private String rfc;
    private double saldoDisp;

    public CuentaFiscal(String rfc, double saldoDisp){
        this.rfc = rfc;
        if (saldoDisp <= 0){
            System.out.println("¡Operación invalida! \nSaldo = 0");
            saldoDisp = 0;
        } else {
            this.saldoDisp = saldoDisp;
        }
    }

    public String getRFC(){
        return rfc;
    }

    public double Saldo(){
        return saldoDisp;
    }

    public void mostrarCuenta() {
        System.out.println("---------------------------------------");
        System.out.println("        C U E N T A   F I S C A L      ");
        System.out.println("RFC: " + rfc);
        System.out.println("Saldo diponible: $"+saldoDisp);
    }

    public boolean validarRFC(DeclaracionImpuestos d){
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }

}


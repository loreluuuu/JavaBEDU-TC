public class Main {
    public static void main(String[] args) {
        DeclaracionImpuestos D = new DeclaracionImpuestos("GACL050208MSFH", 5000);
        CuentaFiscal CF = new CuentaFiscal("GACL050208MSFH", 3400);

        System.out.println("---------------------------------------");
        System.out.println("      DECLARACIÓN   DE   IMPUESTOS     ");
        System.out.println("RFC:    "+D.rfcContribuyente());
        System.out.println("Monto: $"+D.montoDeclarado());
        CF.mostrarCuenta();
        boolean rfc = CF.validarRFC(D);
        System.out.println("¿Es válido?: " + rfc);
        System.out.println("---------------------------------------");
    }
}
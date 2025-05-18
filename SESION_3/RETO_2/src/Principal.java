public class Principal {
    public static void main(String[] args) {
        Factura F1 = new Factura(13989.28,"Compra Eq. Computo", "GACL050208LAJ");
        System.out.println(F1.getResumen());
        Factura F2 = new Factura(5384, "Autopartes Vicent", null);
        System.out.println(F2.getResumen());
    }
}
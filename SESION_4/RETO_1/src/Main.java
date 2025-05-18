public class Main {
    public static void main(String[] args) {
        Factura F1 = new Factura("F080205","Lorena Granados", 1500);
        Factura F2 = new Factura("F080205","Yunnuen Fortanell", 3200);

        System.out.println("Factura 1:");
        System.out.println(F1);
        System.out.println("Factura 2:");
        System.out.println(F2);

        System.out.println("¿Son iguales? "+F1.equals(F2));

        System.out.println("Hash Factura 1: " + F1.hashCode());
        System.out.println("Hash Factura 1: " + F2.hashCode());
    }
}
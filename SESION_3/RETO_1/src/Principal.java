public class Principal {
    public static void main(String[] args) {
        Pasajero P = new Pasajero("Lorena Granados", "A147DHDJ");
        Vuelo V = new Vuelo("I124", "Roma, España", "21:45");

        System.out.println("El pasajero reserva un asiento");
        V.reservarAs(P);
        System.out.println("---R E S E R V A D O -----");
        V.obtenerItinerario();
        System.out.println("-------------------------------");
        V.cancelarRes();
        System.out.println("-------------------------------");
        V.obtenerItinerario();
        System.out.println("-------------------------------");
        V.reservarAs("Taylor Swift","PT131989");
        System.out.println("-------------------------------");
        V.obtenerItinerario();
    }
}
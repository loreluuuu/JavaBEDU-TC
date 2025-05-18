public class Vuelo {
    final String codigoVuelo;
    String destino;
    String horaSalida;
    Pasajero asientoReservado;

    public Vuelo(String codigoVuelo, String destino, String horaSalida) {
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
    }

    public boolean reservarAs(Pasajero p){
        if (asientoReservado == null) {
            asientoReservado = p;
            return true;
        } else {
            return false;
        }
    }

    public boolean reservarAs(String nombre, String pasaporte){
        Pasajero nPas = new Pasajero(nombre, pasaporte);
        System.out.println("Asiento reservado");
        return reservarAs(nPas);
    }

    public void cancelarRes(){
        asientoReservado = null;
        System.out.print("Reserva cancelada");
    }

    public String obtenerItinerario(){
        System.out.println("--------------------------------");
        System.out.println("|    INFORMACION  DE  VUELOS    |");
        System.out.println("--------------------------------");
        System.out.println(" Código de vuelo: "+codigoVuelo);
        System.out.println("      Destino:    "+destino);
        System.out.println(" Hora de salida:  "+horaSalida);
        if (asientoReservado == null){
            System.out.println(" Asiento disponible ");
        } else {
            System.out.println(" Pasajero: "+asientoReservado.nombre);
        }
        return "";
    }
}

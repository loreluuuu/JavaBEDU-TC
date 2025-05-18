public class Ambulancia extends UnidadEmergencia {

    public Ambulancia(Sirena sirena, SistemaGPS sGPS, Operador operador){
        super(sirena, sGPS, operador);
    }

    @Override
    public void responder(){
        System.out.println("Ambulancia: Respondiendo a la emergencia");
    }

    public void iniciarOperacion() {
        activarUnidad();
        localizar();
        activarSirena();
        reportarse();
        responder();
    }
}

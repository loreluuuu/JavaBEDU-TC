public class Patrulla extends UnidadEmergencia{

    public Patrulla(Sirena sirena, SistemaGPS sGPS, Operador operador){
        super(sirena, sGPS, operador);
    }

    @Override
    public void responder(){
        System.out.println("Patrulla: Respondiendo a la emergencia");
    }

    public void iniciarOperacion() {
        activarUnidad();
        localizar();
        activarSirena();
        reportarse();
        responder();
    }
}

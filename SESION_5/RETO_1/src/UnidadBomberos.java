public class UnidadBomberos extends UnidadEmergencia{

    public UnidadBomberos(Sirena sirena, SistemaGPS sGPS, Operador operador){
        super(sirena, sGPS, operador);
    }

    @Override
    public void responder(){
        System.out.println("Unidad de bomberos: Respondiendo a la emergencia");
    }

    public void iniciarOperacion() {
        activarUnidad();
        localizar();
        activarSirena();
        reportarse();
        responder();
    }
}

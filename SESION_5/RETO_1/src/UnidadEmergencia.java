public abstract class UnidadEmergencia {
    protected String nombre;
    protected Sirena sirena = new Sirena();
    protected SistemaGPS sGPS = new SistemaGPS();
    protected Operador operador = new Operador("Juan");

    public UnidadEmergencia(Sirena sirena, SistemaGPS sGPS, Operador operador) {
        this.sirena = sirena;
        this.sGPS = sGPS;
        this.operador = operador;
    }

    public abstract void responder();

    public void activarUnidad(){
        System.out.println("Estado: Activo");
    }
    public void activarSirena(){
        sirena.activarSirena();
    }
    public void localizar(){
        sGPS.localizar();
    }
    public void reportarse(){
        operador.reportarse();
    }
}

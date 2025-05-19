public class MainNarrativa {

    private final TransicionHistoria transicion;
    private final GestorDialogo dialogo;
    private final LogicaDecision decision;

    public MainNarrativa(TransicionHistoria transicion, GestorDialogo dialogo, LogicaDecision decision) {
        this.transicion = transicion;
        this.dialogo = dialogo;
        this.decision = decision;
    }

    public void ejecutarEscena() {
        dialogo.mostrarDialogo("Narrador", "Te encuentras frente a un espeso y oscuro bosque.");
        boolean entraAlBosque = decision.tomarDecision();

        if (entraAlBosque) {
            dialogo.mostrarDialogo("Narrador", "Decides adentrarte en el bosque, a pesar del miedo.");
            dialogo.mostrarDialogo("Bosque", "Susurros extraños rodean tus pasos...");
        } else {
            dialogo.mostrarDialogo("Narrador", "Prefieres dar media vuelta y regresar a casa.");
        }

        transicion.siguienteEscena();
    }

    public static void main(String[] args) {
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        MainNarrativa narrativa = new MainNarrativa(transicion, dialogo, decision);
        narrativa.ejecutarEscena();
    }
}
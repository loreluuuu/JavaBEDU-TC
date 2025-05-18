import java.util.Optional;

public class Factura {
    private double monto;
    private String desc;
    private Optional<String> rfc;

    public Factura(double monto, String desc, String rfc){
        this.monto = monto;
        this.desc = desc;
        this.rfc = Optional.ofNullable(rfc);
    }

    public String getResumen(){
        String resumen = "** F A C T U R A C I Ó N **\n";
        resumen += "* Descripción: "+desc+"\n";
        resumen += "* Monto:       "+monto+"\n";
        resumen += "* RFC:         "+rfc.orElse("NO PROPORCIONADO")+"\n";
        return resumen;
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> muestra = new ArrayList<>();
        muestra.add("Homo sapiens");
        muestra.add("Mus musculus");
        muestra.add("Arabidopsis thaliana");
        muestra.add("Homo sapiens");

        System.out.println("Orden de llegada de las muestras:");
        for (String muestraOrdenada : muestra) {
            System.out.println("-> " + muestraOrdenada);
        }

        HashSet<String> espUni = new HashSet<>(muestra);

        System.out.println("\nEspecies únicas:");
        for (String especie : espUni) {
            System.out.println("-> " + especie);

        Map<String, String> mInvest = new HashMap<>();
        mInvest.put("M-001", "Dra. López");
        mInvest.put("M-002", "Dr. Hernández");
        mInvest.put("M-003", "Dr. Granados");

        System.out.println("\n ID de muestra a investigador:");
        for (Map.Entry<String, String> m : mInvest.entrySet()) {
            System.out.println(m.getKey() + " → " + m.getValue());
        }

        String id = "M-003";
        System.out.println("\nInvestigador: "+id+ " -> "+mInvest.get(id));
    }
}
    }
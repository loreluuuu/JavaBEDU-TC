import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        List<Tema> T = new ArrayList<>();
        T.add(new Tema("Lectura comprensiva", 2));
        T.add(new Tema("Matemáticas básicas", 1));
        T.add(new Tema("Cuidado del medio ambiente", 3));

        Collections.sort(T);
        System.out.println("📦 Órdenes ordenadas por producto (orden natural):");
        for (Tema op : T) {
            System.out.println(op);
        }

        T.sort(new Comparator<Tema>() {
            @Override
            public int compare(Tema a, Tema b) {
                return Integer.compare(a.prioridad, b.prioridad);
            }
        });

        System.out.println("Órden por prioridad:");
        for (Tema op : T) {
            System.out.println(op);
        }

        ConcurrentHashMap<String, String> repositorio = new ConcurrentHashMap<>();
        repositorio.put("Lectura comprensiva", "https://recursos.edu/lectura");
        repositorio.put("Matemáticas básicas", "https://recursos.edu/mate");
    }
}
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RegistrosSimulacion {
    public static void main(String[] args) {
        Path ruta = Paths.get("config/parametros.txt");
        String contenido = "- Tiempo de ciclo: 55.8 segundos\n" +
                "- Velocidad de línea: 1.2 m/s\n" +
                "- Número de estaciones: 8";

        try {
            if (!Files.exists(ruta.getParent())) {
                Files.createDirectories(ruta.getParent());
            }

            Files.write(ruta, contenido.getBytes());
            System.out.println("Archivo escrito exitosamente.");

            if (Files.exists(ruta)) {
                String textoLeido = Files.readString(ruta);
                System.out.println("Contenido leído:");
                System.out.println(textoLeido);
            } else {
                System.out.println("El archivo no fue creado.");
            }

        } catch (IOException e) {
            System.out.println("Error al trabajar con el archivo: " + e.getMessage());
        }
    }
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;

public class AnalizadorDeLogs {
    public static void main(String[] args) {
        Path rutaLog = Paths.get("errores.log");
        Path rutaRegistroFallos = Paths.get("registro_fallos.txt");

        int totalLineas = 0;
        int cantidadErrores = 0;
        int cantidadWarnings = 0;

        try (BufferedReader lector = Files.newBufferedReader(rutaLog)) {
            String linea;

            while ((linea = lector.readLine()) != null) {
                totalLineas++;
                if (linea.contains("ERROR")) {
                    cantidadErrores++;
                }
                if (linea.contains("WARNING")) {
                    cantidadWarnings++;
                }
            }

            System.out.println("-------------------------------------------");
            System.out.println("Resumen del análisis:");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Cantidad de errores: " + cantidadErrores);
            System.out.println("Cantidad de advertencias: " + cantidadWarnings);
            System.out.println("-------------------------------------------");

            int totalEventos = cantidadErrores + cantidadWarnings;
            double porcentaje = totalLineas > 0 ? (totalEventos * 100.0) / totalLineas : 0;
            System.out.printf("Porcentaje de líneas con errores/advertencias: %.2f%%\n", porcentaje);

        } catch (IOException e) {
            System.out.println("Error al leer el archivo de logs: " + e.getMessage());

            try (BufferedWriter escritor = Files.newBufferedWriter(rutaRegistroFallos)) {
                escritor.write("Error al procesar errores.log: " + e.getMessage());
            } catch (IOException ex) {
                System.out.println("Además, falló al escribir en registro_fallos.txt: " + ex.getMessage());
            }
        }
    }
}
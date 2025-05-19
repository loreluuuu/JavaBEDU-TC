import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    @Override
    public boolean tomarDecision() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Proceder con acción ¨x¨ (sí/no): ");
        String respuesta = scanner.nextLine().trim().toLowerCase();
        return respuesta.equals("sí");
    }
}

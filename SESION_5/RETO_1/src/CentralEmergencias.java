public class CentralEmergencias {
    public static void main(String[] args) {

        Operador O1 = new Operador("Hugo");
        Operador O2 = new Operador("Cheto");
        Operador O3 = new Operador("Francisco");

        Ambulancia A = new Ambulancia(new Sirena(), new SistemaGPS(),O1);
        Patrulla P = new Patrulla(new Sirena(), new SistemaGPS(),O2);
        UnidadBomberos UB = new UnidadBomberos(new Sirena(), new SistemaGPS(),O3);

        System.out.println("-------------------------------");
        System.out.println("|       A M B U L A C I A     |");
        A.iniciarOperacion();
        System.out.println("-------------------------------");
        System.out.println("|        P A T R U L L A       |");
        P.iniciarOperacion();
        System.out.println("--------------------------------");
        System.out.println("|         B O M B E R O S       |");
        UB.iniciarOperacion();
    }
}
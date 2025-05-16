import java.util.Scanner;

public class CajeroAutomatico {
    public int saldo;
    public int op;
    public int deposito;
    public int retiro;
    public CajeroAutomatico(){
    }

    public void menu(){
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            op = sc.nextInt();
            if (op == 1){
                consultar();
            } else if (op == 2) {
                depositar();
            } else if (op == 3) {
                retirar();
            } else if (op == 4){
                System.out.print("¡Hasta luego! :D");
            } else {
                System.out.print("Opcion invalida");
            }
        } while (op < 4);
    }

    public void consultar(){
        System.out.println("--------------------------");
        System.out.println("------- C U E N T A ------");
        System.out.println("Saldo actual -> $"+saldo);
        System.out.println("--------------------------");
    }
    public void depositar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad a depositar -> $");
        deposito = sc.nextInt();
        saldo += deposito;
    }
    public void retirar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad a retirar -> $");
        retiro = sc.nextInt();
        if (retiro < saldo){
            saldo -= retiro;
            System.out.println("--------------------------");
            System.out.println("------- C U E N T A ------");
            System.out.println("-- Retiro éxitoso --");
            System.out.println("Saldo anterior ->"+ --saldo);
            System.out.println("Saldo actual ->"+saldo);
            System.out.println("Retiro ->"+retiro);
            System.out.println("--------------------------");
        } else {
            System.out.println(" -- SALDO INSUFICIENTE -- ");
            menu();
        }
    }
}

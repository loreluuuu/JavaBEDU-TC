import java.util.Scanner;
public class SimuladorFarmacia {
    public String nMed;
    public double precio;
    public int cant;
    public double totsDesc;
    public double totcDesc;

    public SimuladorFarmacia(){
    }

    public void solicitar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del medicamento: ");
        nMed = sc.nextLine();
        System.out.println("Precio unitario: ");
        precio = sc.nextInt();
        System.out.println("Cantidad de pzas:");
        cant = sc.nextInt();
        calcular();
    }

    private void calcular(){
        totsDesc = precio * cant;
        String mensaje = (totsDesc > 500)? "Aplica descuento -15%" :"N/A descuento";
        System.out.println(mensaje);
        double totalFinal = (totsDesc > 500) ? totsDesc-(totsDesc * 0.15) : totsDesc;
        System.out.println("Total a pagar: $" + totalFinal);
    }
}

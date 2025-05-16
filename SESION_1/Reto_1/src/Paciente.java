import java.util.Scanner;
public class Paciente {
    public String nombre;
    public int edad;
    public String nExp;

    public void solicitar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del paciente:  ");
        nombre = sc.nextLine();
        System.out.print("Edad del paciente:    ");
        edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Número de expediente: ");
        nExp = sc.nextLine();
    }

    public void mostrarInformacion(){
        System.out.println(" Paciente : "+nombre);
        System.out.println("   Edad   : "+edad);
        System.out.println("Expediente:"+nExp);
    }
}
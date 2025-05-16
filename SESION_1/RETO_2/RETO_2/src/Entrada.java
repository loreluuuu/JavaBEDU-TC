public class Entrada {
    public String nEvent;
    public double precio;

    public Entrada(String nEvent, double precio){
        this.nEvent = nEvent;
        this.precio = precio;
    }
    public void mostarInformacion(){
        System.out.println("----------------------------");
        System.out.println("|      E N T R A D A S     |");
        System.out.println("----------------------------");
        System.out.println("| EVENTO: "+nEvent);
        System.out.println("| PRECIO: $"+precio);
        System.out.println("----------------------------");
    }
}

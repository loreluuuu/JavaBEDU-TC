import java.util.*;

class Tema implements Comparable<Tema>{
    public String titulo;
    public int prioridad;

    public Tema (String titulo, int prioridad){
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(Tema otro){
        return this.titulo.compareTo(otro.titulo);
    }

    @Override
    public String toString(){
        return "Prioidad: "+prioridad+" Titulo: "+titulo;
    }

}

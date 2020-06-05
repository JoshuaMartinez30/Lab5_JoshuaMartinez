package lab5_joshuamartinez;
public class Tipo extends Escuadron{
    private String nombre, poder, debilidad, escuadron;
    private int fuerza, agilidad_fisica, agilidad, mental;

    public Tipo() {
        super();
    }

    public Tipo(String nombre, String poder, String debilidad, String escuadron, int fuerza, int agilidad_fisica, int agilidad, int mental) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.escuadron = escuadron;
        this.fuerza = fuerza;
        this.agilidad_fisica = agilidad_fisica;
        this.agilidad = agilidad;
        this.mental = mental;
    }
    
    
}

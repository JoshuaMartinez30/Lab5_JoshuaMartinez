
package lab5_joshuamartinez;


public class Villano {
    private String nombre, poder, debilidad, escuadron;
    private int fuerza, agilidad_fisica, agilidad, mental;

    public Villano() {
       
    }

    public Villano(String nombre, String poder, String debilidad, String escuadron, int fuerza, int agilidad_fisica, int agilidad, int mental) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.escuadron = escuadron;
        this.fuerza = fuerza;
        this.agilidad_fisica = agilidad_fisica;
        this.agilidad = agilidad;
        this.mental = mental;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getEscuadron() {
        return escuadron;
    }

    public void setEscuadron(String escuadron) {
        this.escuadron = escuadron;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidad_fisica() {
        return agilidad_fisica;
    }

    public void setAgilidad_fisica(int agilidad_fisica) {
        this.agilidad_fisica = agilidad_fisica;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getMental() {
        return mental;
    }

    public void setMental(int mental) {
        this.mental = mental;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
}

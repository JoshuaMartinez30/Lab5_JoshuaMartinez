package lab5_joshuamartinez;

import java.util.ArrayList;

public class Escuadron {
    private String nombre, lugar_base, lider, tipo;
    private ArrayList lista = new ArrayList();

    public Escuadron() {
    }

    public Escuadron(String nombre, String lugar_base, String lider, String tipo, ArrayList lista) {
        this.nombre = nombre;
        this.lugar_base = lugar_base;
        this.lider = lider;
        this.tipo = tipo;
        setLista(lista);
    }

    public Escuadron(String nombre, String lugar_base, String tipo) {
        this.nombre = nombre;
        this.lugar_base = lugar_base;
        this.tipo = tipo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar_base() {
        return lugar_base;
    }

    public void setLugar_base(String lugar_base) {
        this.lugar_base = lugar_base;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList getLista() {
        return lista;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}

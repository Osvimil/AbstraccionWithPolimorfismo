/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seminarioocho;

/**
 *
 * @author oswaldosaldivar
 */
public abstract class  Figura {
    
    private String nombre;
    private String color;
    
    public Figura(String nombre, String color){
        this.nombre=nombre;
        this.color=color;
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double calcularArea();
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactoapp;


public class Contacto
{
       private String nombre;
    private int telefono;
 
    public Contacto(String nombre, int telefono) {
        this.nombre = nombre; // constructor inicializa la variable
        this.telefono = telefono;
    }
     
    public Contacto(String nombre) {
        this.nombre = nombre;
        this.telefono = 0;   //constructor sin inicializar
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public int getTelefono() {
        return telefono;
    }
 
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
 
    public boolean equals(Contacto c){ //equals es comparacion
         
        if(this.nombre.trim().equalsIgnoreCase(c.getNombre().trim())){ //trim toma mayusculas yminusculas
            return true;  //this es el constructor
        }
         
        return false;
         
    }
     
    @Override
    public String toString() {
        return "nombre=" + nombre + ", telefono=" + telefono;
}
}

/*Trabajo hecho por
Juan Manuel Gonzalez Rincon
Jose Daniel Morales Gomez

*/
package main;

import javax.swing.JOptionPane;
public class Facultad {
    private String Nombre;
    private int Oficina;
    private int Telefono;
    private String Decano;

    public Facultad(String Nombre, int Oficina, int Telefono, String Decano) {
        this.Nombre = Nombre;
        this.Oficina = Oficina;
        this.Telefono = Telefono;
        this.Decano = Decano;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getOficina() {
        return Oficina;
    }

    public void setOficina(int Oficina) {
        this.Oficina = Oficina;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getDecano() {
        return Decano;
    }

    public void setDecano(String Decano) {
        this.Decano = Decano;
    }
     public void mostrarFacultad(){
        JOptionPane.showMessageDialog(null, "Nombre: " +Nombre+ "\nOficina: "+Oficina+ "\nTelefono: "+Telefono+"\nDecano: "+Decano);
    }
      public void mostrarFacultad2(){
        JOptionPane.showMessageDialog(null, "Nombre: " +Nombre+ "\nOficina: "+Oficina+ "\nTelefono: "+Telefono+"\nDecano: "+Decano);
    }
}

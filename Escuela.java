
/*Trabajo hecho por
Juan Manuel Gonzalez Rincon
Jose Daniel Morales Gomez

*/
package main;

import javax.swing.JOptionPane;
public class Escuela {
    private int Oficina;
    private int Telefono;
    private String Director;

    public Escuela(int Oficina, int Telefono, String Director) {
        this.Oficina = Oficina;
        this.Telefono = Telefono;
        this.Director = Director;
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

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }
    public void mostrarEscuela(){
        JOptionPane.showMessageDialog(null, "Oficina: " +Oficina+ "\nTelefono: "+Telefono+"\nDirector: "+Director);
    }
}

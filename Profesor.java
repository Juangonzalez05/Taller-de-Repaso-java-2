
/*Trabajo hecho por
Juan Manuel Gonzalez Rincon
Jose Daniel Morales Gomez

*/
package main;

import javax.swing.JOptionPane;
public class Profesor {
    private String Nombre;
    private String Nombre2;
    private String Nombre3;
    private String Email;
    private String Email2;
    private String Email3;

    public Profesor(String Nombre, String Nombre2, String Nombre3, String Email, String Email2, String Email3) {
        this.Nombre = Nombre;
        this.Nombre2 = Nombre2;
        this.Nombre3 = Nombre3;
        this.Email = Email;
        this.Email2 = Email2;
        this.Email3 = Email3;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre2() {
        return Nombre2;
    }

    public void setNombre2(String Nombre2) {
        this.Nombre2 = Nombre2;
    }

    public String getNombre3() {
        return Nombre3;
    }

    public void setNombre3(String Nombre3) {
        this.Nombre3 = Nombre3;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEmail2() {
        return Email2;
    }

    public void setEmail2(String Email2) {
        this.Email2 = Email2;
    }

    public String getEmail3() {
        return Email3;
    }

    public void setEmail3(String Email3) {
        this.Email3 = Email3;
    }
     public void mostrarProfesor(){
        JOptionPane.showMessageDialog(null, "Profesor 1: " +Nombre+"\n Email 1: "+Email+ "\nProfesor 2: "+Nombre2+ "\n Email 2: "+Email2+"\nProfesor 3: "+Nombre3+"\n Email 3: "+Email3);
    }

  

    
}

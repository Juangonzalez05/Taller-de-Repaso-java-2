/*Trabajo hecho por
Juan Manuel Gonzalez Rincon
Jose Daniel Morales Gomez

*/
package main;
import javax.swing.JOptionPane;

public class Universidad {
    private String Nombre;
    private String Direccion;
    private int Telefono;
    private String Extension;
    private String Tipo;

    public Universidad(String Nombre, String Direccion, int Telefono, String Extension, String Tipo) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Extension = Extension;
        this.Tipo = Tipo;
    }

   
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getExtension() {
        return Extension;
    }

    public void setExtension(String Extension) {
        this.Extension = Extension;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, "Nombre: " +Nombre+ "\nDireccion: "+Direccion+ "\nTelefono: "+Telefono+"\nExtension de la Universidad: "+Extension+"\nTipo publica o privada: "+Tipo);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuclases;

/**
 *
 * @author Ricardo Yunhon
 */
public class clEmpresa {
    public String Nombre;
    public String Direccion;
    public String RUC;
    public String Telefono;
    
    public clEmpresa(){}

    public clEmpresa(String Nombre, String Direccion, String RUC, String Telefono) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.RUC = RUC;
        this.Telefono= Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getRUC() {
        return RUC;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }
    
    public void mostrarVehiculo() 
    {
        System.out.println("******************************");        
        System.out.println("* Información de la Empresa: *");
        System.out.println("******************************");        
        System.out.println("");        
        System.out.println("Nombre: " + Nombre);
        System.out.println("Direccion: " + Direccion);
        System.out.println("RUC: " + RUC);
        System.out.println("Telefono: " + RUC);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuclases;

import java.util.ArrayList;
import java.util.List;

//import clVehiculo;
/**
 *
 * @author Ricardo Yunhon
 */
public class manejoVehiculo {
    private List<clVehiculo> vehiculos;
    
    public manejoVehiculo()
    {
        vehiculos=new ArrayList<>();
    }
    
    public void creaVehiculo(clVehiculo vehiculo)
    {
        vehiculos.add(vehiculo);
    }
    
    public void mostrarVehiculos() {
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println("VehIculo " + (i + 1));
            vehiculos.get(i).mostrarVehiculo();
            System.out.println();
        }
    }
}

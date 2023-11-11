/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuclases;

import java.util.Scanner;

/**
 *
 * @author Ricardo Yunhon
 */
public class MenuClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in); 
        manejoEmpresa mEmpresa=new manejoEmpresa();
        manejoVehiculo mVehiculo=new manejoVehiculo();
        
        Boolean status=true;
        
        while (status)
        {
            System.out.println("");            
            System.out.println("********************");
            System.out.println("* Menu de Opciones *");
            System.out.println("********************");
            System.out.println("");  
            System.out.println("1. Agregar Vehiculo");
            System.out.println("2. Mostrar Lista Vehiculos");
            System.out.println("3. Agregar Empresa");
            System.out.println("4. Mostrar Lista Empresas");
            System.out.println("5. Salir de la Aplicacion");
            System.out.print("Seleccione una Opcion: ");
            System.out.println("");
            System.out.println("");
            
            int opcion=scanner.nextInt();
            
            switch(opcion)
            {
                case 1:
                    System.out.println("*********************************");
                    System.out.println("* Digite Los Datos del vehiculo *");
                    System.out.println("*********************************");
                    System.out.println("");
                    System.out.print("Ingrese la marca: ");                   
                    String marca=scanner.next();
                    System.out.print("Ingrese el modelo: ");                   
                    String modelo=scanner.next();
                    System.out.print("Ingrese el placa: ");                   
                    String placa=scanner.next();
                    System.out.print("Ingrese el Cantidad de Ocupantes : ");                   
                    int cantOcupantes=scanner.nextInt();
                    System.out.print("Ingrese el Año de Fabricacion : ");                   
                    int year=scanner.nextInt();                    
                    clVehiculo nvoVehiculo =new clVehiculo(marca,modelo,placa,cantOcupantes, year);
                    mVehiculo.creaVehiculo(nvoVehiculo);
                    break;
                case 2:
                    mVehiculo.mostrarVehiculos();
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("*****************************");
                    System.out.println("* Digite Info de la Empresa *");
                    System.out.println("*****************************");
                    System.out.println("");
                    System.out.print("Ingresa el nombre de la Empresa: ");                   
                    String nombre=scanner.next();
                    System.out.print("Ingresa la direccion de la Empresa: ");                   
                    String direccion=scanner.next();
                    System.out.print("Ingresa el RUC de la Empresa: ");                   
                    String ruc=scanner.next();
                    System.out.print("Ingresa el Telefono de la Empresa: ");                   
                    String telefono=scanner.next();
                    clEmpresa nvaEmpresa=new clEmpresa(nombre,direccion,ruc,telefono);
                    mEmpresa.creaEmpresa(nvaEmpresa);
                    break;
                case 4:
                    mEmpresa.mostrarEmpresa();
                    break;
                case 5:
                    status=false;
                    System.out.println("");
                    System.out.println("************************");
                    System.out.println("* Fin de la Aplicacion *");
                    System.out.println("************************");
                    break;                
                default:
                    System.out.println("Opción no válida.");
                    break;                    
            }
        }
    }
    
}

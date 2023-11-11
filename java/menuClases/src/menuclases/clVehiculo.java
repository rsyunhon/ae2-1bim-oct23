/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuclases;

/**
 *
 * @author Ricardo Yunhon
 */
public class clVehiculo {
    public String marca;
    public String modelo;
    public String placa;
    public int cantOcupantes;
    public int year;
    
    public clVehiculo()
    {}

    public clVehiculo(String marca, String modelo, String placa, int cantOcupantes, int year) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cantOcupantes = cantOcupantes;
        this.year= year;
    }

    public void setCantOcupantes(int cantOcupantes) {
        this.cantOcupantes = cantOcupantes;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCantOcupantes() {
        return cantOcupantes;
    }

    public int getYear() {
        return year;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
    public void mostrarVehiculo() {
        System.out.println("Información del VehIculo:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Cantidad de Ocupantes: " + cantOcupantes);
        System.out.println("Año de Fabricacion: " + year);
    }
    
}

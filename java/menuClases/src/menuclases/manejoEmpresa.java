/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuclases;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Ricardo Yunhon
 */
public class manejoEmpresa {
    private List<clEmpresa> empresas;
    
    public manejoEmpresa()
    {
        empresas=new ArrayList<>();
    }
    
    public void creaEmpresa(clEmpresa empresa)
    {
        empresas.add(empresa);
    }
    
    public void mostrarEmpresa() {
        for (int i = 0; i < empresas.size(); i++) {
            System.out.println("Empresa " + (i + 1));
            empresas.get(i).mostrarVehiculo();
            System.out.println();
        }
    }    
}

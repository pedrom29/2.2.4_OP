/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121;

/**
 *
 * @author Pedro
 */
public class Validador {
    
    public boolean verificarClave(String rut, String clave){
        String primeros = rut.substring(0,4);
        
        if (primeros.equals(clave)){
            return true;
            
        }else{
            return false;
        }
    
    }
    
    public boolean verificarCompra(int valorCompra, int montoDisponible){
        int resta = valorCompra-montoDisponible;
        System.out.println(""+valorCompra+ "-" +montoDisponible+ "= "+resta);
        if (valorCompra-montoDisponible>=0){
            
            return true;
        }else{
            return false;
        }
    }
}
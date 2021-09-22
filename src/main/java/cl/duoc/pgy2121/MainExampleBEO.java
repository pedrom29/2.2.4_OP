/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class MainExampleBEO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Trabajador empleado1 = new Trabajador("Juan Pérez", "12189443", "5");        
        Trabajador gift1 = new Trabajador("6018741302285000", "1218", 35000, "30 de octubre 2020","Juan Perez");
                
        Trabajador empleado2 = new Trabajador("Rosita Morales", "18112345", "K");
        Trabajador gift2 = new Trabajador("7149741202186111", "1811", 55000, "30 de octubre 2021","Rosita Morales");
        
        Validador validador = new Validador();
        
        boolean validaClave = validador.verificarClave(empleado1.rut,gift1.clave);
        if (validaClave == true){
           System.out.println("La clave es correcta.");
        }else{
            System.out.println("La clave es incorrecta.");
        }
        
        System.out.println("Ingrese valor de la compra");
        int valorCompra = teclado.nextInt();
        System.out.println("Ingrese el rut del dueño de la giftcard");
        String rut = teclado.next();
        boolean validaMonto;
        if (rut.equals(empleado1.rut)){
            validaMonto = validador.verificarCompra(valorCompra, gift1.monto);
            if (validaMonto == true){
                System.out.println("El empleado " +empleado1.nombre + " puede comprar.");
            }else{
                System.out.println("El empleado "+empleado1.nombre + " necesita complementar su compra");
            }
        }else{
            validaMonto = validador.verificarCompra(valorCompra, gift2.monto);
            if (validaMonto == true){
                System.out.println("El empleado "+empleado2.nombre + " puede comprar.");
            }else{
                System.out.println("El empleado "+empleado2.nombre + " necesita complementar su compra");
            }
        }                
    }
    
}

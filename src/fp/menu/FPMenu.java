/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.menu;
import java.util.*;
/**
 *
 * @author alumno
 */
public class FPMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static int menu(){
        int opcion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculo de areas");
        System.out.println("Menu");
        System.out.println("Introduce la opcion deseada");
        System.out.println("Area de cuadrados");
        System.out.println("Area de circulos");
        System.out.println("Area de triangulos");
        opcion = entrada.nextInt();
        return opcion;
        
        
        
    }
}

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
        menu();
        calculaAreas();
    }
    public static int menu(){
        int opcion;
        Scanner entrada = new Scanner(System.in);
        do{
        System.out.println("Calculo de areas");
        System.out.println("Menu");
        System.out.println("Introduce la opcion deseada");
        System.out.println("Area de cuadrados");
        System.out.println("Area de circulos");
        System.out.println("Area de triangulos");
        System.out.println("Salir");
        opcion = entrada.nextInt();
        }while(opcion<0 || opcion>=4);
        return opcion;
        
    }
    public static float calculaAreas(int op){
        float area;
        switch(op){
            case 1:
                area = areaCuadrado();
                break;
            case 2:
                area = areaCirculo();
                break;
            case 3:
                area = areaTriangulo();
                break;
            default:
                mensajeSalida();
        }
        return area;
    }
}


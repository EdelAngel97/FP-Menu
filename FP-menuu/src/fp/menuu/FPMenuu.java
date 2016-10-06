/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.menuu;
import java.util.*;
/**
 *
 * @author LuisGuillermo
 */
public class FPMenuu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //Forma 1
    /* int m;
    float a;
    m=menu();
    a=calculaAreas(m);
    muestraResultado(a,m);*/
    
    //Forma 2
    muestraResultado(calculaAreas(menu()));
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
                area=0;
        }
        return area;
    }
    public static float solicitarDatos(String tipo){
        float dato;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el dato");
        dato = teclado.nextFloat();
        return dato;
    }
    public static float areaCuadrado(){
        float l,area;
        l = solicitarDatos("lado");
        area = l*l;
        return area;
    }
    public static float areaCirculo(){
        float r,area;
        final double pi;
        pi = 3.1416;
        r=solicitarDatos("radio");
        area = (float) (pi*Math.pow(r,2));
        return area;
      }
    public static float areaTriangulo(){
        float a,b,area;
        a = solicitarDatos("altura");
        b = solicitarDatos("base");
        area = a*b/2;
        return area;
    }
    public static void mensajeSalida(){
        System.out.println("Salida");
    }
    
    public static void muestraResultado (float area){
        System.out.println("El area es" + area );
        
    }
    
    public static void muestraResultado(float a,int r){
        String figura;
        if(r==1){figura = "cuadrado";}
        else{
            if(r==2){figura = "circulo";}
            else{
                figura = "triangulo";
            }
        }
    System.out.println("El area del" + figura + "es de" +a);
    
}
    
    
    
}

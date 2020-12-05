/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila_edd;

import java.util.Scanner;

/**
 *
 * @author PC7
 */
public class Pila_EDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc=0;//varibale para utilizar como opcion
        int dato=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("1.Pila");
        System.out.println("Ingrese el tamaño de la pila:");//se solicita el tamño de la pila
        int tamaño=leer.nextInt();
        Pila A=new Pila (tamaño);//se almacena el dato introducido desde la variable
         
         do{//para rpetir el menu y no termine.
             System.out.println("¿Que desea relizar con la pila?");  
             System.out.println("1.Insertar dato.");
             System.out.println("2.Verificar si se encuentra vacia.");
             System.out.println("3.Tamaño de la pila.");
             System.out.println("4.Salir");
             opc=leer.nextInt();
             switch (opc){
                 case 1://opcion paras ingresar dstos a la pila
                     System.out.println("Ingrese los dato:");
                     A.Insertar(dato=leer.nextInt());//metodo para ingresar los datos
                     System.out.println("Dato ingresado");
                     System.out.println("");
                     break;
                 
                 case 2:  
                     System.out.println(A.vacio());//metodo para saber si se encuentra 
                     System.out.println("");
                 case 3:
                     System.out.println(A.tamaño());//metodo para saber el tmaño de la pila e imprime en pantalla 
                     break;
                case 4:
                    
             }
         } while (opc !=5);  
    }
    
}

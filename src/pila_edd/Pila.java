/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila_edd;

/**
 *
 * jalil garcia jeronimo
 */
public class Pila {

    int Vector_Pila[];//vector para almacenar los datos a la pila
    int Cima;//variable para saber que dato esta primero

    public Pila(int Tamano) {//tamño de la pila
        Vector_Pila = new int[Tamano];
        Cima = 0;

    }

    public void Insertar(int datos) {//metodo para insertar las dato a la pila
        Vector_Pila[Cima] = datos;
        Cima++;
    }

    public int Elimiar() {//metodo para eliminar el dato
        int eliminar = 0;
        if (Cima == 0) {
            System.out.println("La pila se encunetra vacia");
        } else {
            eliminar = Vector_Pila[Cima];
            Cima--;
        }
        return eliminar;
    }

    public boolean vacio() {//metodo para saber si la pila esta vacia o llena 
        if (Cima == 0) {
            return true;

        } else {
            return false;
        }
    }

    public int tamaño() {//metodo para saber el tamaño d ela pila y mostrarlo en pantalla
        return Vector_Pila.length ;
        

    }
    
}

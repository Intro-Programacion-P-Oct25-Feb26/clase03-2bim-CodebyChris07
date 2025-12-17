/*
 Se tienen 5 estaciones de trabajo, cada una de las cuales tiene un encargado,
del cual se conocen su nombre y la producción (en dólares) que tuvo por cada 
uno de los meses del año. Elaborar un algoritmo que lea los 5 nombres y los 
guarde en un arreglo, y que haga lo mismo con los 12 meses de producción de 
cada una de las estaciones y los almacene en una matriz de 5 x 12. Se requiere 
que imprima el siguiente reporte:
Análisis de Producción 
Estación 
Nombre Estación 1 - Total Producción: $ 1000 
Nombre Estación 2 - Total Producción: $ 3000 
Nombre Estación 3 - Total Producción: $ 1200 
Nombre Estación 4 - Total Producción: $ 1300 
Nombre Estación 5 - Total Producción: $ 2400

Estación más productiva: Nombre Estación 2 
Encargado de la estación: Nombre del encago de la estación 
Cantidad de la estación más productiva: $ 3000
 */
package paquete05;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] estaciones = new int[5][12];
        String[] nombres = new String[5];
        double[] produccion = new double[5];
        
        for(int fila = 0; fila < estaciones.length; fila++){
        System.out.println("Ingrese el nombre de la estacion a la que pertenece");
        nombres[fila] = entrada.nextLine();
        double suma = 0;
        
        for(int col = 0; col < estaciones[fila].length; col++){
            
        
        
        }
        
        
        }
    }

}

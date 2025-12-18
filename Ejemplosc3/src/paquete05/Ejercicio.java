/*
    Se tienen 5 estaciones de trabajo, cada una de las cuales tiene un 
encargado, del cual se conocen su nombre y la producción (en dólares) que tuvo 
por cada uno de los meses del año. Elaborar un algoritmo que lea los 5 nombres
y los guarde en un arreglo, y que haga lo mismo con los 12 meses de producción 
de cada una de las estaciones y los almacene en una matriz de 5 x 12. Se 
requiere que imprima el siguiente reporte: 
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
        int[] produccion = new int[5];

        int mayorProduccion = 0;
        int indiceMejor = 0;
        String reporte = "";

        for (int fila = 0; fila < estaciones.length; fila++) {
            System.out.printf("Ingrese el nombre de la estacion %d:\n", fila + 1);
            nombres[fila] = entrada.nextLine();

            int suma = 0;

            for (int col = 0; col < estaciones[fila].length; col++) {
                System.out.printf("Ingrese la produccion del mes %d para %s:\n",
                        col + 1, nombres[fila]);
                estaciones[fila][col] = entrada.nextInt();
                suma += estaciones[fila][col];
            }
            entrada.nextLine(); // limpieza de buffer
            produccion[fila] = suma;
        }

        // Buscar estación más productiva
        mayorProduccion = produccion[0];
        indiceMejor = 0;

        for (int i = 1; i < produccion.length; i++) {
            if (produccion[i] > mayorProduccion) {
                mayorProduccion = produccion[i];
                indiceMejor = i;
            }
        }

        reporte += "Analisis de Produccion\nEstacion\n";

        for (int i = 0; i < produccion.length; i++) {
            reporte += String.format("%s - Total Produccion: $%d\n",
                    nombres[i], produccion[i]);
        }

        reporte += String.format(
                "\nEstacion mas productiva: %s Estacion %s\n" +
                "Encargado de la estacion: %s\n" +
                "Cantidad de la estacion mas productiva: $%d\n",
                nombres[indiceMejor],
                indiceMejor + 1,
                nombres[indiceMejor],
                mayorProduccion);

        System.out.println(reporte);
    }
}
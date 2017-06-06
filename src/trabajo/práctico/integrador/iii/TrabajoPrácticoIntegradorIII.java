/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo.práctico.integrador.iii;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TrabajoPrácticoIntegradorIII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;

        char[][] planilla = {
            {'P', 'P', 'P', 'P', 'P', 'P', 'T', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'T'},
            {'A', 'P', 'P', 'P', 'P', 'P', 'A', 'P', 'P', 'P', 'T', 'P', 'P', 'P', 'A', 'P'},
            {'T', 'P', 'A', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'A', 'P', 'P'},
            {'P', 'P', 'T', 'T', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'},
            {'T', 'P', 'P', 'P', 'P', 'A', 'P', 'P', 'A', 'P', 'P', 'A', 'P', 'P', 'P', 'A'},
            {'P', 'P', 'P', 'P', 'T', 'T', 'P', 'P', 'P', 'P', 'A', 'P', 'P', 'P', 'P', 'A'},
            {'P', 'P', 'A', 'P', 'P', 'P', 'T', 'T', 'A', 'P', 'P', 'A', 'P', 'A', 'P', 'P'},
            {'P', 'P', 'P', 'P', 'A', 'A', 'T', 'P', 'P', 'P', 'P', 'A', 'A', 'P', 'P', 'A'},
            {'P', 'P', 'A', 'P', 'A', 'T', 'P', 'P', 'A', 'P', 'P', 'P', 'P', 'P', 'P', 'P'}};

        String[] apellidos = {"Alberti", "Azcuénaga", "Belgrano", "Castelli", "Larrea",
            "Matheu", "Moreno", "Paso", "Saavedra"};

        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        Scanner entrada = new Scanner(System.in);

        int opciones = entrada.nextInt();
        switch (opciones) {

            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:
                 opcion4(planilla);
                break;

        }

        for (int filaNombres = 0; filaNombres < apellidos.length; filaNombres++) {
            System.out.print(apellidos[filaNombres]);
            System.out.println("");
        }

    }

    
    
    static void opcion4(char[][] a){
                      int contador = 0;

     for (int filaAlumnos = 0; filaAlumnos < a.length; filaAlumnos++) {
                    for (int columnaClases = 0; columnaClases < a[0].length; columnaClases++) {
                        //System.out.print(llegadasTardes[i][j] + "\t");
                        if (a[filaAlumnos][columnaClases] == 'T') {
                            contador++;
                        }
                    }

                    // System.out.println("");  baja una linea en cada conteo
                }
                System.out.println("el total de llegadas tade es: " + contador);    
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cmeppsmedicion;

import java.util.Scanner;

/**
 *
 * @author juanm
 */
public class CMEPPSmedicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] palabras = {"HOLA","JUEGO","JUGADOR","PRUEBA","QUESO"};
        String palabra = palabras[(int)(Math.random()*3)];
        Juego juego = new Juego(new Jugador(), new Jugador(), palabra);
        Scanner scan = new Scanner(System.in);
        String eleccion = "s";
        while(!eleccion.equals("n")) {
            juego.iniciarPartida();
            System.out.println("Volver a jugar? [s/n]");
            eleccion = scan.nextLine().toLowerCase();
        }
        System.out.println("Hasta luego");
        
        
    }
    
}

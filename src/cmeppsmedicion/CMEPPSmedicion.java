/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cmeppsmedicion;

/**
 *
 * @author juanm
 */
public class CMEPPSmedicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] palabras = {"HOLA","JUEGO","JUGADOR"};
        String palabra = palabras[(int)Math.random()*3];
        Juego juego = new Juego(new Jugador(), new Jugador(), palabra);
    }
    
}

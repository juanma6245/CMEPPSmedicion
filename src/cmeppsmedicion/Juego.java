/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmeppsmedicion;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juanm
 */
public class Juego {

    private Jugador jugador1;
    private Jugador jugador2;
    private String palabra;

    public Juego(Jugador jugador1, Jugador jugador2, String palabra) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.palabra = palabra.toUpperCase();
    }

    public void iniciarPartida() {
        System.out.println("--------------------------------------------------");
        System.out.println("Iniciando partida");
        boolean encontrado = false;
        String palabraDesordenada = this._desordenar();
        System.out.println("La palabra es " + palabraDesordenada);
        while (!encontrado) {
            System.out.println("Jugador1");
            for (String string : jugador1.getHistorial()) {
                System.out.println(string);
            }
            System.out.println("Jugador2");
            for (String string : jugador2.getHistorial()) {
                System.out.println(string);
            }
            Scanner scan = new Scanner(System.in);
            String palabraNueva;
            System.out.println("Jugador1 escriba palabra: ");
            palabraNueva = scan.nextLine();
            if (this._comprobarSolucion(palabraNueva)) {
                jugador1.escribePalabra(palabraNueva + "\tACIERTO");
                encontrado = true;
            } else {
                jugador1.escribePalabra(palabraNueva + "\tFALLO");
            }
            System.out.println("Jugador1");
            for (String string : jugador1.getHistorial()) {
                System.out.println(string);
            }
            if (!encontrado) {
                System.out.println("Jugador2 escriba palabra: ");
                palabraNueva = new String();
                palabraNueva = scan.nextLine();
                scan.nextLine();
                if (this._comprobarSolucion(palabraNueva)) {
                    jugador2.escribePalabra(palabraNueva + "\tACIERTO");
                    encontrado = true;
                } else {
                    jugador2.escribePalabra(palabraNueva + "\tFALLO");
                }
                System.out.println("Jugador2");
                for (String string : jugador2.getHistorial()) {
                    System.out.println(string);
                }
            }

        }
        jugador1.reset();
        jugador2.reset();
    }

    private String _desordenar() {
        String response = new String(this.palabra);
        int posicion;
        char cambiarCaracter;
        for(int i = 0; i<this.palabra.length(); i++) {
            posicion = (int)(Math.random()*this.palabra.length());
            cambiarCaracter = this.palabra.charAt(i);
            response = this.palabra.substring(0, posicion) + cambiarCaracter + this.palabra.substring(posicion);
        }
        return response;
    }

    private boolean _comprobarSolucion(String palabraNueva) {
        return palabraNueva.toUpperCase().equals(palabra);
    }
}

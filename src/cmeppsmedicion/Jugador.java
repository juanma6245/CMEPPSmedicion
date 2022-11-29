/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmeppsmedicion;

import java.util.ArrayList;

/**
 *
 * @author juanm
 */
public class Jugador {
    ArrayList<String> historial;

    public Jugador() {
        this.historial = new ArrayList<String>();
    }

    public ArrayList<String> getHistorial() {
        return historial;
    }
    
    public String getUltimaPalabra() {
        return this.historial.get(this.historial.size() - 1);
    }
    
    public void escribePalabra(String palabra) {
        this.historial.add(palabra);
    }
}

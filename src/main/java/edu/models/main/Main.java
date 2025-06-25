/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.models.main;

import edu.models.cartas.CartaGenerica;
import edu.models.manos.CartaAlta;
import edu.models.manos.DoblePar;

/**
 *
 * @author estudiantes
 */
public class Main {
    public static void main (String arg[]){
        CartaGenerica cartaA = new CartaGenerica("A", 11); 
        CartaGenerica carta5 = new CartaGenerica("5", 5); 
        
        DoblePar manoDoblePar = new DoblePar();
        
        manoDoblePar.agregarCartasAMano(cartaA);
        manoDoblePar.agregarCartasAMano(carta5);
        manoDoblePar.agregarCartasAMano(carta5);
        
        manoDoblePar.getDescripcion();
    }
}

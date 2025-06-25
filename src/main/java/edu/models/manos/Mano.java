/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.models.manos;

import edu.models.cartas.CartaGenerica;
import java.util.ArrayList;

/**
 *
 * @author estudiantes
 */
public abstract class Mano {
    protected ArrayList<CartaGenerica> cartas;
    protected int valorMano;
    
    public Mano(){
        cartas = new ArrayList<>();
        valorMano = 0;
    }
    
    public void agregarCartasAMano(CartaGenerica cartaGenerica){
        cartas.add(cartaGenerica);
    }
   
    public int getValorMano(){
        for(CartaGenerica carta : cartas){
            valorMano += carta.getValor();
        }
        return valorMano;
    }
    
    public abstract void getDescripcion();
    
    public abstract int multiplicarMano();
}

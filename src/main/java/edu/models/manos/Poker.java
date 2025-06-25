/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.models.manos;

import edu.models.cartas.CartaGenerica;

/**
 *
 * @author estudiantes
 */
public class Poker extends Mano{

    public Poker() {
        super();
    }

    @Override
    public int multiplicarMano() {
        return 4 * getValorMano();
    }

    @Override
    public void getDescripcion() {
        System.out.print("Poker: ");
        for(CartaGenerica carta : cartas){
            System.out.print(carta.getNombre() + ", ");
        }
        System.out.print("Valor: " + multiplicarMano());
    }
}
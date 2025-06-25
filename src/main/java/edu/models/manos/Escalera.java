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
public class Escalera extends Mano{

    public Escalera() {
        super();
    }

    @Override
    public int multiplicarMano() {
        return 3 * getValorMano();
    }

    @Override
    public void getDescripcion() {
        System.out.print("Escalera: ");
        for(CartaGenerica carta : cartas){
            System.out.print(carta.getNombre() + ", ");
        }
        System.out.print("Valor: " + multiplicarMano());
    }
}
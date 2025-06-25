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
public class DoblePar extends Mano{

    public DoblePar() {
        super();
    }

    @Override
    public int multiplicarMano() {
        return 2 * getValorMano();
    }

    @Override
    public void getDescripcion() {
        System.out.print("Doble par: ");
        for(CartaGenerica carta : cartas){
            System.out.print(carta.getNombre() + ", ");
        }
        System.out.print("Valor: " + valorMano + " multiplicador: 2. " + "Valor final: " + multiplicarMano());
    }
}
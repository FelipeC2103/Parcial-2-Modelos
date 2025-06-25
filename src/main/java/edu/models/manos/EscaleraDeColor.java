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
public class EscaleraDeColor extends Mano{

    public EscaleraDeColor() {
        super();
    }

    @Override
    public int multiplicarMano() {
        return 5 * getValorMano();
    }

    @Override
    public void getDescripcion() {
        System.out.print("Escalera de color: ");
        for(CartaGenerica carta : cartas){
            System.out.print(carta.getNombre() + ", ");
        }
        System.out.print("Valor: " + multiplicarMano());
    }
}
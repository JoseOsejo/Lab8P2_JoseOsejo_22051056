/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrerasdiscovery;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author jcoq2
 */
public class McQueen extends Auto
{
    private Random rand = new Random();
    public McQueen(int numeroIdentificador,String nombreCorredor, Color color) {
        super(numeroIdentificador,nombreCorredor, color);
    }

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }

    @Override
    public int distanciaRecorrida() {
        return rand.nextInt(190-30)+30;
    }
    
    
    
    
}

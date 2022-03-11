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
    int randomNumber = rand.nextInt(190-30)+30;
    public McQueen(int numeroIdentificador,int distanciaRecorrida,String nombreCorredor, Color color) {
        super(numeroIdentificador, randomNumber, nombreCorredor, color);
    }
    
    
    
    
}

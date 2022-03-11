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
public class Nascar extends Auto
{
    Random r = new Random();
    
    public Nascar(int numeroIdentificador, int distanciaRecorrida, String nombreCorredor, Color color) {
        super(numeroIdentificador, distanciaRecorrida, nombreCorredor, color);
    }

    @Override
    public int distanciaRecorrida() {
        return r.nextInt(180-40)+40; //To change body of generated methods, choose Tools | Templates.
    }




    
}

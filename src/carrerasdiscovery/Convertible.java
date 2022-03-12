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
public class Convertible extends Auto
{

    Random r = new Random();
    public Convertible(int numeroIdentificador, String nombreCorredor, Color color) {
        super(numeroIdentificador, nombreCorredor, color);
    }

    @Override
    public int distanciaRecorrida() {
       return r.nextInt(200-20)+20;  //To change body of generated methods, choose Tools | Templates.
    }





    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrerasdiscovery;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author jcoq2
 */
public class Auto implements Serializable
{

    private int numeroIdentificador;/*tiene que ser unico*/
    private int distanciaRecorrida;
    private String nombreCorredor;
    private Color color;

    private static final long SerialVersionUID = 783L;

    public Auto(int numeroIdentificador,String nombreCorredor, Color color) {
        this.numeroIdentificador = numeroIdentificador;
        this.nombreCorredor = nombreCorredor;
        this.color = color;
    }

    public Auto(){
        
    }
    public int getNumeroIdentificador() {
        return numeroIdentificador;
    }

    public void setNumeroIdentificador(int numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }

    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(int distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public String getNombreCorredor() {
        return nombreCorredor;
    }

    public void setNombreCorredor(String nombreCorredor) {
        this.nombreCorredor = nombreCorredor;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" + "numeroIdentificador=" + numeroIdentificador + ", distanciaRecorrida=" + distanciaRecorrida + ", nombreCorredor=" + nombreCorredor + ", color=" + color + '}';
    }

    public  int distanciaRecorrida(){
        return 0;
    }
    
    
}

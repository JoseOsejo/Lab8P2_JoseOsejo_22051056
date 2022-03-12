/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrerasdiscovery;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jcoq2
 */
public class TablaDeCarreras implements Runnable
{

 private ArrayList<Auto> listaAutos = new ArrayList();
    private boolean comenzarCarrera;
    private JTable tablaCarrera;
    private int largoDeLaCarrera;
    private boolean progresar;
    private JProgressBar barraProgresoCarrera;

    public TablaDeCarreras(JTable tablaCarrera, JProgressBar barraProgresoCarrera, ArrayList<Auto> listaAutos) {
        comenzarCarrera = true;
        progresar = true;
        this.tablaCarrera = tablaCarrera;
        this.listaAutos = listaAutos;
        this.barraProgresoCarrera = barraProgresoCarrera;
        largoDeLaCarrera = barraProgresoCarrera.getMaximum();
    }

    public ArrayList<Auto> getListaAutos() {
        return listaAutos;
    }

    public void setListaAutos(ArrayList<Auto> listaAutos) {
        this.listaAutos = listaAutos;
    }

    public boolean isComenzarCarrera() {
        return comenzarCarrera;
    }

    public void setComenzarCarrera(boolean comenzarCarrera) {
        this.comenzarCarrera = comenzarCarrera;
    }

    public JTable getTablaCarrera() {
        return tablaCarrera;
    }

    public void setTablaCarrera(JTable tablaCarrera) {
        this.tablaCarrera = tablaCarrera;
    }

    public int getLargoDeLaCarrera() {
        return largoDeLaCarrera;
    }

    public void setLargoDeLaCarrera(int largoDeLaCarrera) {
        this.largoDeLaCarrera = largoDeLaCarrera;
    }

    public boolean isProgresar() {
        return progresar;
    }

    public void setProgresar(boolean progresar) {
        this.progresar = progresar;
    }

    public JProgressBar getBarraProgresoCarrera() {
        return barraProgresoCarrera;
    }

    public void setBarraProgresoCarrera(JProgressBar barraProgresoCarrera) {
        this.barraProgresoCarrera = barraProgresoCarrera;
    }

    private void actualizarTablaCarrera() {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        for (Auto auto : listaAutos) {
            System.out.println(auto.getNombreCorredor());
            Object[] nuevaRow = {
                auto.getNumeroIdentificador(),
                auto.getNombreCorredor(),
                auto.getDistanciaRecorrida()
            };
            modeloTabla.addRow(nuevaRow);
        }
        tablaCarrera.setModel(modeloTabla);
    }

    @Override
    public void run() {
        while (comenzarCarrera) {
            if (progresar) {
                for (int i = 0; i < tablaCarrera.getRowCount(); i++) {
                    String n = (String) tablaCarrera.getValueAt(i, 1);
                    System.out.println("id " + n);
                    for (Auto auto : listaAutos) {
                        if (n.equals(auto.getNombreCorredor())) {
                            int randomDistance = auto.distanciaRecorrida();
                            auto.setDistanciaRecorrida(auto.getDistanciaRecorrida() + randomDistance);
                            break;
                        }
                    }
                     try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                }
                //actualizar la tabla de las careras
                actualizarTablaCarrera();
                barraProgresoCarrera.setValue(barraProgresoCarrera.getValue() + 10);
                if (barraProgresoCarrera.getValue() >= largoDeLaCarrera) {
                    comenzarCarrera = false;
                }
            }
        }
    }
    
}

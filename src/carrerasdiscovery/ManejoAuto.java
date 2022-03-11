/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrerasdiscovery;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author jcoq2
 */
public class ManejoAuto {

    File archivo = null;
    private ArrayList<Auto> listaAutos = new ArrayList();

    public ManejoAuto(String ruta) {
        archivo = new File(ruta);
    }

    public void setAuto(Auto auto) {
        listaAutos.add(auto);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Auto> getListaAutos() {
        return listaAutos;
    }

    public void setListaAutos(ArrayList<Auto> listaAutos) {
        this.listaAutos = listaAutos;
    }

    public void leerArchivoAuto() throws ClassNotFoundException {
        listaAutos = new ArrayList();
        FileInputStream f = null;
        ObjectInputStream o = null;
        Auto autoTemp;
        try {
            if (archivo.exists()) {
                f = new FileInputStream(archivo);
                o = new ObjectInputStream(f);
                try {
                    while ((autoTemp = (Auto) o.readObject()) != null) {
                        listaAutos.add(autoTemp);
                    }
                } catch (EOFException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException io) {
            io.printStackTrace();
        }
        try {
            o.close();
            f.close();
        } catch (Exception e) {

        }
    }
    
    
     public void escribirArchivoAuto(){
        FileOutputStream f = null;
        ObjectOutputStream o = null;
        try{
            f = new FileOutputStream(archivo);
            o = new ObjectOutputStream(f);
            for (Auto auto : listaAutos) {
                o.writeObject(auto);
            }
            o.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
        try{            
            o.close();
            f.close();
        }catch(Exception e){
        }
    }
    
    
    

}

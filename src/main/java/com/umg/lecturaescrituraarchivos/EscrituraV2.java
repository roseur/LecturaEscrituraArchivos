/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.lecturaescrituraarchivos;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Rosi
 */
public class EscrituraV2 {
    public static void main(String[] args) {
        String path = "C:\\Users\\Rosi\\Desktop\\";
        String nombre = "prueba_v2.txt";
        try {
            FileWriter fw = new FileWriter(path+nombre);
            fw.write("Hola mundo v2");
            fw.close();
        } catch (IOException ex) {
            System.out.println("Ocurrio un problema al tratar de escribir el archivo");
            System.out.println(ex.getMessage());
        }
        
        System.out.println("Archivo guardado exitosamente");
        
    }
}

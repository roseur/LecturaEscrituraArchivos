/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.lecturaescrituraarchivos;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Rosi
 */
public class LecturaV1 {

    public static void main(String[] args) {
        String path = "C:\\Users\\Rosi\\Desktop\\pruebaLectura.txt";
        try ( FileReader fr = new FileReader(path)) {
            int caracter;
            String contenido = "";
            while ((caracter = fr.read()) != -1) {
                contenido = contenido + (char) caracter;
            }
            System.out.println(contenido);
        } catch (IOException ex) {
            System.out.println("Ocurrio un error al leer el archivo");
            //Imprimir el mensaje de error que Java dio
            System.out.println(ex.getMessage()); 
        }
    }
}

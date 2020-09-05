/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.lecturaescrituraarchivos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Rosi
 */
public class LecturaV1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Rosi\\Desktop\\pruebaLectura.txt");
        int caracter;
        String contenido = "";
        while((caracter=fr.read())!= -1){
            contenido = contenido + (char)caracter;
        }
        System.out.println(contenido);
    }
}

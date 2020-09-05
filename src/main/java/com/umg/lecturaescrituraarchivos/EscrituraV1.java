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
public class EscrituraV1 {
    public static void main(String[] args) throws IOException {
        //De esta forma escribiria el archivo en la ubicacion del proyecto
        //FileWriter fw = new FileWriter("prueba_v1.txt");
        //Aqui le estamos especificando la ubicacion completa de donde debe crear/guardar el archivo de texto
        FileWriter fw = new FileWriter("C:\\Users\\Rosi\\Desktop\\prueba_v1.txt");
        fw.write("Hola mundo v1");
        fw.close();
        System.out.println("Archivo guardado exitosamente");
    }
}

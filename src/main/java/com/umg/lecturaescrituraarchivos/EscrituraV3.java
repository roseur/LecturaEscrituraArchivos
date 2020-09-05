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
public class EscrituraV3 {
    public static void main(String[] args){
        String ubicacion = "C:\\Users\\Rosi\\Desktop\\";
        String nombreArchivo = "prueba_v3.txt";
        try (FileWriter fw = new FileWriter(ubicacion+nombreArchivo, true)) {
            fw.write("Hola mundo\n");
            fw.append("Esta es otra linea\n");
        } catch (IOException ex) {
            System.out.println("Ocurrio un problema al tratar de escribir el archivo");
            System.out.println(ex.getMessage());
        }
        System.out.println("Archivo guardado exitosamente");
    }
}

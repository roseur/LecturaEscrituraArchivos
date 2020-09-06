/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.lecturaescrituraarchivos;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Rosi
 */
public class LecturaV2 {

    public static void main(String[] args) {
        String path = "C:\\Users\\Rosi\\Desktop\\pruebaLectura.txt";
        File archivo = new File(path);
        try (Scanner s= new Scanner(archivo)) {
            while (s.hasNextLine()) {
                System.out.println(s.nextLine());
            }
        } catch (Exception ex) {
            System.out.println("Ocurrio un error al leer el archivo");
            //Imprimir el mensaje de error que Java dio
            System.out.println(ex.getMessage());
        }

    }
}

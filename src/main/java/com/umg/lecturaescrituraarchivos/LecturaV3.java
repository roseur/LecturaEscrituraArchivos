/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.lecturaescrituraarchivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Rosi
 */
public class LecturaV3 {

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Rosi\\Desktop\\pruebaLectura.txt";
        String content = Files.readString(Paths.get(path));
        System.out.println(content);
    }
}

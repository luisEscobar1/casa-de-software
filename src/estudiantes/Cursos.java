/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copia;

import estudiantes.Estudiantes;
import estudiantes.Materia;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author Labing I5
 */
public class Cursos {

    public String grupo;
    public Materia mimateria;
    public ArrayList<Estudiantes> misestudiantes;
    boolean finArchivo = false;
    RandomAccessFile archivo = null;
    
    public Cursos() {
        
        

        try {
            archivo = new RandomAccessFile("cursos.txt", "rw" );
           
            System.out.println("El tamaño es: ” + archivo.length()");
            
            do {
                try {
                    c = (char) archivo.readByte();
                    if (c == 'i') {
                        archivo.seek(archivo.getFilePointer() – 1);
                        archivo.writeByte(Character.toUpperCase(c));
                    }
                } catch (EOFException eof) {
                    finArchivo = true;
                    archivo.close();
                    System.out.println("Convertidas a mayusculas" );
                }
            } while (!finArchivo);
        } catch (FileNotFoundException fe) {
            System.out.println("No se encontro el archivo");

        }

    }

    }

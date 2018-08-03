/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

/**
 *
 * @author jonathan carrascal
 * 
 */
public class Estudiantes extends persona{
// hereda de una clase de personas, esta el administrador y el estudiante
    public matricula matr;

    public Estudiantes( String nombre,int id) {
        
        this.nombre=nombre;
        this.id=id;
        
    }



}
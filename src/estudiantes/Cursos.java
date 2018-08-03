/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;



/**
 *
 * @author Labing I5
 */
public class Cursos {

    public String grupo;
    public Materia mimateria;

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Materia getMimateria() {
        return mimateria;
    }

    public void setMimateria(Materia mimateria) {
        this.mimateria = mimateria;
    }

    public Cursos(String grupo, Materia mimateria) {
        this.grupo = grupo;
        this.mimateria = mimateria;
    }
  

    }

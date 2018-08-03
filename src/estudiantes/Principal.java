
package estudiantes;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author LabingXEON
 */
public class Principal {
    //metodo para registrar estudiantes
    public void nuevoEstudiante(persona nombre, persona id){       
    
    
    
    }
    
    //metodo para inscribir materias
    public void inscribirCursos(materia m, Estudiantes es1){
     try {
         // create a new RandomAccessFile with filename test
         RandomAccessFile raf = new RandomAccessFile("Cursos.txt", "rw");

         // write something in the file
         raf.writeUTF(es1.getNombre()+"--->"+m);

         // set the file pointer at 0 position
         raf.seek(0);

         // print the string
         System.out.println("" + raf.readUTF());
      } catch (IOException ex) {
         ex.printStackTrace();
      }
        
    }
}

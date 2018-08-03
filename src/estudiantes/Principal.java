package estudiantes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 *
 * @author LabingXEON
 */
public class Principal {
    //metodo para registrar estudiantes

    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();
    int id = sc.nextInt();

    
    
    
    public void buscarE() throws FileNotFoundException, IOException {
       int i=sc.nextInt();
        
        RandomAccessFile raf = new RandomAccessFile("estudiantes.txt", "r");
        raf.seek(0);
        if(raf.read()==i){
            raf.skipBytes(4);
            System.out.println( raf.readUTF());
            
        }else{
            for(int I=0;i<raf.length();i++){
               int a=24;
                
                if(raf.readByte()==id){
                    raf.seek(a);
                    System.out.println(raf.readUTF());
                }
                a=a+24;
            }
        }
        
        
        
    }

    public void nuevoEstudiante(String n, int id) {
        char carac[] = new char[20];
        Estudiantes e = new Estudiantes(n, id);
        for (int i = 0; i < n.length();) {
            carac[i] = n.charAt(i);
        }

        try {

            // create a new RandomAccessFile with filename test
            RandomAccessFile raf = new RandomAccessFile("estudiantes.txt", "rw");
            raf.writeByte(id);
            
          
            for (int i = 0; i < carac.length; i++) {
                raf.writeUTF(String.valueOf(carac));

            }

            // write something in the file
            // set the file pointer at 0 position
            raf.seek(0);

            // print the string
            System.out.println("" + raf.readUTF());
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    //metodo para inscribir materias
    public void inscribirCursos(Materia m, Estudiantes es1) {
        try {
            // create a new RandomAccessFile with filename test
            RandomAccessFile raf = new RandomAccessFile("Cursos.txt", "rw");

            // write something in the file
            raf.writeUTF(es1.getNombre() + "--->" + m.getNombre() + "---->" + m.getCodigo());

            // set the file pointer at 0 position
            raf.seek(0);

            // print the string
            System.out.println("" + raf.readUTF());
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}

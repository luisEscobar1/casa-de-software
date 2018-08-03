
package estudiantes;

/**
 *
 * @author LabingXEON
 */
public class Admin extends persona{
    
    public String contraseña;

    public Admin(String contraseña) {
        this.contraseña = contraseña;
    }

    
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}

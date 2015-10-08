package Clases;

/**
 * Clase que modela el comportamiento de un Terapeuta.
 * @author Oscar Galván
 */
public class Terapeuta {
    
    private String nombre;
    private String nombreAsesor;
    
    /**
     * Constructor por defecto.
     */
    public Terapeuta() { 
        
    }
    
    /**
     * Constructor que inicializa los atributos de la clase.
     * @param nombre Nombre del terapeuta
     * @param nombreAsesor Nombre del asesor del terapeuta.
     */
    public Terapeuta(String nombre, String nombreAsesor) { 
        this.nombre = nombre;
        this.nombreAsesor = nombreAsesor;
    }
    
    /**
     * Método de acceso que regresa el nombre del terapeuta.
     * @return Nombre del terapeuta.
     */
    public String getNombre() { 
        return nombre;
    }
    
    /**.
     * Método de acceso que establece el nombre del terapeuta.
     * @param nombre Nombre del terapeuta.
     */
    public void setNombre(String nombre) { 
        this.nombre = nombre;
    }
    
    /**
     * Método de acceso que regresa el nombre del asesor.
     * @return Nombre del asesor.
     */
    public String getAsesor() { 
        return nombreAsesor;
    }
    
    /**
     * Método de acceso que establece el nombre del asesor.
     * @param nombreAsesor Nombre del asesor.
     */
    public void setAsesor(String nombreAsesor) { 
        this.nombreAsesor = nombreAsesor;
    }
    
    /**
     * Método toString que regresa los valores de la clase.
     * @return 
     */
    @Override
    public String toString() { 
        return "Nombre del terapeuta: " + nombre + ", Nombre del asesor: " + nombreAsesor;
    }
}

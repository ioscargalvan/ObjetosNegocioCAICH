package Clases;

/**
 * Clase que modela el comportamiento de un Material.
 * @author Oscar Galván
 */
public class Material {
    
    private String clave;
    private String nombre;
    
    /**
     * Constructor por defecto.
     */
    public Material() { 
        
    }
    
    /**
     * Constructor que inicializa los atributos de la clase.
     * @param clave Clave del material.
     * @param nombre Nombre del material.
     */
    public Material(String clave, String nombre) { 
        this.clave = clave;
        this.nombre = nombre;
    }

    /**
     * Método de acceso que regresa la clave del material.
     * @return Clave del material.
     */
    public String getClave() {
        return clave;
    }

    /**
     * Método de acceso que establece la clave del material.
     * @param clave Clave del material.
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * Método de acceso que regresa el nombre del material.
     * @return Nombre del material.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método de acceso que establece el nombre del material.
     * @param nombre Nombre del material.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Método toString que regresa los valores de la clase.
     * @return Cadena con los valores de la clase.
     */
    @Override
    public String toString() { 
        return "Clave: " + clave + ", Nombre: " + nombre;
    }
}

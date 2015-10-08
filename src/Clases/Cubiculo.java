package Clases;

/**
 * Clase que modela el comportamiento de un Cubículo.
 * @author Oscar Galván.
 */
public class Cubiculo {
    
    private Integer numero;
    
    /**
     * Constructor por defecto.
     */
    public Cubiculo() { 
        
    }
    
    /**
     * Constructor que inicializa los valores de la clase.
     * @param numero Número de cubículo.
     */
    public Cubiculo(Integer numero) { 
        this.numero = numero;
    }
    
    /**
     * Método de acceso que regresa el número del cubículo.
     * @return Número del cubículo.
     */
    public Integer getNumero() { 
        return numero;
    }
    
    /**
     * Método de acceso que establece el número del cubículo.
     * @param numero Número del cubículo.
     */
    public void setNumero(Integer numero) { 
        this.numero = numero;
    }
    
    /**
     * Método toString que regresa los valores de la clase.
     * @return Cadena con los valores de la clase.
     */
    @Override
    public String toString() { 
        return "Cubiculo #: " + numero;
    }
}

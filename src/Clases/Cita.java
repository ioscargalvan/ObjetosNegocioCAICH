package Clases;

import java.util.Calendar;
import java.util.List;

/**
 * Clase que modela el comportamiento de una cita.
 * @author Oscar Galván
 */
public class Cita {
    
    private Paciente paciente;
    private Terapeuta terapeuta;
    private Calendar fecha;
    private Cubiculo cubiculo;
    private List<Material> materiales;
    private String estado;
    
    /**
     * Constructor por defecto.
     */
    public Cita() { 
        
    }
    
    /** 
     * Constructor que inicializa todos los atributos de la clase.
     * @param paciente Paciente de la cita.
     * @param terapeuta Terapeuta del paciente de la cita.
     * @param fecha Fecha de la cita.
     * @param cubiculo Cubiculo donde se atenderá la cita.
     * @param materiales Materiales a utilizar.
     * @param estado Estado de la cita.
     */
    public Cita(Paciente paciente, Terapeuta terapeuta, Calendar fecha, Cubiculo cubiculo, List<Material> materiales, String estado) { 
        this.paciente = paciente;
        this.terapeuta = terapeuta;
        this.fecha = fecha;
        this.cubiculo = cubiculo;
        this.materiales = materiales;
        this.estado = estado;
    } 

    /**
     * Método de acceso que regresa atributo paciente.
     * @return Paciente de la cita.
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * Método de acceso que establece el atributo paciente. 
     * @param paciente Paciente de la cita.
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * Método de acceso que regresa al terapeuta asignado de la cita.
     * @return Terapeuta de la cita.
     */
    public Terapeuta getTerapeuta() {
        return terapeuta;
    }

    /**
     * Método de acceso que establece al terapeuta de la cita.
     * @param terapeuta Terapeuta de la cita.
     */
    public void setTerapeuta(Terapeuta terapeuta) {
        this.terapeuta = terapeuta;
    }

    /**
     * Método de acceso que regresa la fecha de la cita.
     * @return Fecha de la cita.
     */
    public Calendar getFecha() {
        return fecha;
    }

    /**
     * Método de acceso que establece la fecha de la cita.
     * @param fecha Fecha de la cita.
     */
    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    /**
     * Método de acceso que regresa el cubículo de la cita.
     * @return Cubículo de la cita.
     */
    public Cubiculo getCubiculo() {
        return cubiculo;
    }

    /**
     * Método de acceso que establece el cubículo de la cita.
     * @param cubiculo Cubículo de la cita.
     */
    public void setCubiculo(Cubiculo cubiculo) {
        this.cubiculo = cubiculo;
    }

    /**
     * Método de acceso que regresa una lista de los materiales a utilizar en la cita.
     * @return Lista de materiales.
     */
    public List<Material> getMateriales() {
        return materiales;
    }

    /**
     * Método de acceso que establece la lista de materiales a utilizar en la cita.
     * @param materiales Lista de materiales.
     */
    public void setMateriales(List<Material> materiales) {
        this.materiales = materiales;
    }

    /**
     * Método de acceso que regresa el estado de la cita. Maneja los estados de
     * Activo y Cancelado.
     * @return Estado de la cita.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Método de acceso que establece el estado de la cita. Se puede asignar
     * Activo y Cancelado.
     * @param estado Estado de la cita.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() { 
        return "Paciente: " + paciente.getNombre() + ", Terapeuta: " + terapeuta.getNombre() + 
                ", Fecha: " + fecha.get(Calendar.DAY_OF_MONTH) + "/" + (fecha.get(Calendar.MONTH)+1) + 
                "/" + fecha.get(Calendar.YEAR);
    }
    
}

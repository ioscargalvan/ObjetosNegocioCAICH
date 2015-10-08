package Clases;

/**
 * Clase que modela el comportamiento de un Paciente. Nota: No es la versión
 * final, se utilizará un prototipo para poder cumplir con los requerimientos
 * del caso de uso: Administrar Citas.
 *
 * @author Oscar Galván
 */
public class Paciente {

    private String nombre;
    private Terapeuta terapeuta;
    private boolean activo;

    /**
     * Constructor por defecto.
     */
    public Paciente() {

    }

    /**
     * Constructor que inicializa los atributos de la clase.
     *
     * @param nombre Nombre del paciente.
     * @param terapeuta Terapeuta asignado.
     * @param activo Si tiene un terapeuta asignado, su valor es true. False en
     * caso contrario.
     */
    public Paciente(String nombre, Terapeuta terapeuta, boolean activo) {
        this.nombre = nombre;
        this.terapeuta = terapeuta;
        this.activo = activo;
    }

    /**
     * Método de acceso que regresa el nombre del paciente.
     *
     * @return Nombre del paciente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método de acceso que establece el nombre del paciente.
     *
     * @param nombre Nombre del paciente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método de acceso que regresa el terapeuta asignado.
     *
     * @return Terapeuta asignado.
     */
    public Terapeuta getTerapeuta() {
        return terapeuta;
    }

    /**
     * Método de acceso que establece al terapeuta asignado.
     *
     * @param terapeuta Terapeuta asignado.
     */
    public void setTerapeuta(Terapeuta terapeuta) {
        this.terapeuta = terapeuta;
        if (terapeuta!=null) activo = true;
    }

    /**
     * Método de acceso que regresa si el paciente está activo.
     *
     * @return True en caso de estar activo, false en caso contario.
     */
    public boolean estaActivo() {
        return activo;
    }

    /**
     * Método de acceso que establece si el paciente está activo.
     *
     * @param activo True en caso de estar activo, false en caso contrario.
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    /**
     * Método toString que regresa los valores de la clase.
     * @return Cadena con los valores de la clase.
     */
    public String toString() {
        if (terapeuta == null) {
            return "Nombre del paciente: " + nombre + ", Activo: " + activo;
        } else {
            return "Nombre del paciente: " + nombre + ", Nombre del Terapeuta: " + terapeuta.getNombre() + ", Activo: " + activo;
        }

    }

}

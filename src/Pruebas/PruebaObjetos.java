package Pruebas;

import Clases.Cita;
import Clases.Cubiculo;
import Clases.Material;
import Clases.Paciente;
import Clases.Terapeuta;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Clase de prueba para los objetos del negocio.
 *
 * @author Oscar
 */
public class PruebaObjetos {

    public static void main(String[] args) {

        // Crea dos materiales.
        Material material1 = new Material("JU001", "Papá sexuado");
        Material material2 = new Material("JU044", "Juego de opuestos");

        // Imprime sus valores.
        System.out.println(material1.toString());
        System.out.println(material2.toString());

        // Cambia el nombre del segundo material.
        material2.setClave("C003");

        // Imprime su nuevo valor.
        System.out.println(material2.toString());

        // Crea un cubículo.
        Cubiculo cubiculo2 = new Cubiculo(2);

        // Imprime su valor.
        System.out.println(cubiculo2.toString());

        // Crea un nuevo terapeuta.
        Terapeuta terapeuta = new Terapeuta("Daniela Soto", "Andres Mejia");
        Terapeuta terapeuta2 = new Terapeuta("Elsa López", "Andres Mejia");

        // Imprime sus valores.
        System.out.println(terapeuta.toString());
        System.out.println(terapeuta2.toString());

        // Cambia el asesor del terapeuta 1
        terapeuta.setAsesor("Chris Martin");

        // Cambia el nombre del terapeuta 2
        terapeuta2.setNombre("Sam Williams");

        // Imprime sus valores.
        System.out.println(terapeuta.toString());
        System.out.println(terapeuta2.toString());

        // Crea un paciente con todos los valores.
        Paciente paciente = new Paciente("Oscar Galvan", terapeuta, true);

        // Crea un paciente sin terapeuta.
        Paciente pacienteSinAsignar = new Paciente("Ricardo", null, false);

        // Imprime sus valores.
        System.out.println(paciente.toString());
        System.out.println(pacienteSinAsignar.toString());

        // Asigna un terapeuta al paciente sin asignar.
        pacienteSinAsignar.setTerapeuta(terapeuta2);

        // Imprime sus valores, su actividad debería de ser true.
        System.out.println(pacienteSinAsignar.toString());

        // Crea una nueva fecha
        Calendar fecha = new GregorianCalendar(2015, 07, 10);

        // Crea una nueva lista de materiales.
        List<Material> listaMateriales = new ArrayList<Material>();

        // Agrega los materiales.
        listaMateriales.add(material1);
        listaMateriales.add(material2);

        // Crea una nueva Cita.
        Cita cita = new Cita(paciente, terapeuta, fecha, cubiculo2, listaMateriales, "Activa");

        // Despliega sus datos.
        System.out.println(cita.toString());

        List<Material> listaObtenida = cita.getMateriales();
        for (int i = 0; i < listaObtenida.size(); i++) {
            System.out.println(listaObtenida.get(i).toString());
        }

        // Cambia el estado de la cita.
        cita.setEstado("Cancelado");

        // Crea una nueva lista 
        List<Material> listaNueva = new ArrayList<Material>();
        listaNueva.add(new Material("C001", "Super Mario"));
        listaNueva.add(new Material("C002", "The Legend of Zelda"));

        // Establece la nueva lista.
        cita.setMateriales(listaNueva);

        // Obtiene e imprime los materiales nuevos.
        listaObtenida = cita.getMateriales();
        for (int i = 0; i < listaObtenida.size(); i++) {
            System.out.println(listaObtenida.get(i).toString());
        }
    }
}

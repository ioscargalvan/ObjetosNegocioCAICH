/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Oscar
 */
public class PruebaFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar fechaHoy = new GregorianCalendar(1995, 05, 11);
        Calendar fechaInicio = new GregorianCalendar(1995, 0, 1);
        
        int dia = fechaInicio.get(Calendar.DAY_OF_MONTH);
        int mes = fechaInicio.get(Calendar.MONTH);
        int anho = fechaInicio.get(Calendar.YEAR);
        
       // int primerDiaSemana = fechaInicio.get;
        System.out.println(dia + "/" + mes + "/" + anho);
        
   //     System.out.println(primerDiaSemana);
    }
    
}

package com.acme.controller;

import com.acme.model.Employee;
import com.acme.model.WorkingHours;

import java.util.List;

/**
 * Validate overlap working hours with established hour ranges
 *
 * @author JOG.
 * @version 1.0
 */
public class ValidateOverlap {

    /**
     *
     * @param listaRegistroTrabajo
     * @param listaJornadaTrabajo
     * @return
     */
    public boolean validateInterval(List<Employee> listaRegistroTrabajo, List<WorkingHours> listaJornadaTrabajo) {
        for (Employee valor : listaRegistroTrabajo) {
            int inicioHoraTrabajo = Integer.parseInt(valor.getStartTime());
            int finHoraTrabajo = Integer.parseInt(valor.getEndTime());

            for (WorkingHours tiempoPago : listaJornadaTrabajo) {
                int inicioHoraPago = Integer.parseInt(tiempoPago.getStartTime());
                int finHoraPago = Integer.parseInt(tiempoPago.getEndTime());
                // COMPARO INTERVALO HORAS
                if (validateOverlap(inicioHoraTrabajo, inicioHoraPago, finHoraTrabajo, finHoraPago, valor.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     *
     * @param inicioHoraTrabajo
     * @param inicioHoraPago
     * @param finHoraTrabajo
     * @param finHoraPago
     * @return
     */
    private boolean validateOverlap(int inicioHoraTrabajo, int inicioHoraPago, int finHoraTrabajo, int finHoraPago, String name) {
        if (inicioHoraTrabajo >= inicioHoraPago && inicioHoraTrabajo < finHoraPago && finHoraTrabajo > finHoraPago) {
            System.out.println("Payment to " + name + ": The range entered [" + inicioHoraTrabajo + "," + finHoraTrabajo + "] and " +
                    "[" + inicioHoraPago + "," + finHoraPago + "] overlap!");
            return true;
        } else {
            return false;
        }
    }
}

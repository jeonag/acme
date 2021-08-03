package com.acme.data;

import com.acme.model.WorkingHours;
import com.acme.model.Payments;

import java.util.Arrays;
import java.util.List;

/**
 * Ingreso de datos de las entidades
 *
 * @author JOG.
 * @version 1.0
 */
public class EnterData {
    /**
     * Enter data from working hours
     *
     * @return
     */
    public List<WorkingHours> registerWorkingHours() {
        WorkingHours semanaPrimerWorkingHours = new WorkingHours("HL1", "00", "09");
        WorkingHours semanaSegundoWorkingHours = new WorkingHours("HL2", "09", "18");
        WorkingHours semanaTercreWorkingHours = new WorkingHours("HL", "18", "24");
        List<WorkingHours> listaWorkingHoursLaboral = Arrays.asList(semanaPrimerWorkingHours, semanaSegundoWorkingHours, semanaTercreWorkingHours);
        return listaWorkingHoursLaboral;
    }

    /**
     * Enter data of payments according to working hours
     *
     * @return
     */
    public List<Payments> registerDataBase() {
        List<WorkingHours> listaWorkingHours = registerWorkingHours();
        WorkingHours primeraJornadaSemana = listaWorkingHours.get(0);
        WorkingHours segundaJornadaSemana = listaWorkingHours.get(1);
        WorkingHours terceraJornadaSemana = listaWorkingHours.get(2);

        Payments lunesPrimeraJornada = new Payments("MO", primeraJornadaSemana, 25);
        Payments lunesSegundaJornada = new Payments("MO", segundaJornadaSemana, 15);
        Payments lunesTerceraJornada = new Payments("MO", terceraJornadaSemana, 20);
        Payments martesPrimeraJornada = new Payments("TU", primeraJornadaSemana, 25);
        Payments martesSegundaJornada = new Payments("TU", segundaJornadaSemana, 15);
        Payments martesTerceraJornada = new Payments("TU", terceraJornadaSemana, 20);
        Payments miercolesPrimeraJornada = new Payments("WE", primeraJornadaSemana, 25);
        Payments miercolesSegundaJornada = new Payments("WE", segundaJornadaSemana, 15);
        Payments miercolesTerceraJornada = new Payments("WE", terceraJornadaSemana, 20);
        Payments juevesPrimeraJornada = new Payments("TH", primeraJornadaSemana, 25);
        Payments juevesSegundaJornada = new Payments("TH", segundaJornadaSemana, 15);
        Payments juevesTerceraJornada = new Payments("TH", terceraJornadaSemana, 20);
        Payments viernesPrimeraJornada = new Payments("FR", primeraJornadaSemana, 25);
        Payments viernesSegundaJornada = new Payments("FR", segundaJornadaSemana, 15);
        Payments viernesTerceraJornada = new Payments("FR", terceraJornadaSemana, 20);
        Payments sabadoPrimeraJornada = new Payments("SA", primeraJornadaSemana, 30);
        Payments sabadoSegundaJornada = new Payments("SA", segundaJornadaSemana, 20);
        Payments sabadoTerceraJornada = new Payments("SA", terceraJornadaSemana, 25);
        Payments domingoPrimeraJornada = new Payments("SU", primeraJornadaSemana, 30);
        Payments domingoSegundaJornada = new Payments("SU", segundaJornadaSemana, 20);
        Payments domingoTerceraJornada = new Payments("SU", terceraJornadaSemana, 25);

        List<Payments> listaHoraPagos = Arrays.asList(
                lunesPrimeraJornada, lunesSegundaJornada, lunesTerceraJornada,
                martesPrimeraJornada, martesSegundaJornada, martesTerceraJornada,
                miercolesPrimeraJornada, miercolesSegundaJornada, miercolesTerceraJornada,
                juevesPrimeraJornada, juevesSegundaJornada, juevesTerceraJornada,
                viernesPrimeraJornada, viernesSegundaJornada, viernesTerceraJornada,
                sabadoPrimeraJornada, sabadoSegundaJornada, sabadoTerceraJornada,
                domingoPrimeraJornada, domingoSegundaJornada, domingoTerceraJornada
        );
        return listaHoraPagos;
    }
}

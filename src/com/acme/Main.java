package com.acme;

import com.acme.controller.CalculateSalary;
import com.acme.controller.ValidateOverlap;
import com.acme.model.Employee;
import com.acme.model.WorkingHours;
import com.acme.model.Payments;
import com.acme.data.EnterData;
import com.acme.utils.ReadFile;
import com.acme.utils.CleanRegister;

import java.io.IOException;
import java.util.List;

/**
 * This class shows the results
 *
 * @author JOG.
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) throws IOException {
        // Load default data
        EnterData enterData = new EnterData();
        List<WorkingHours> listaJornadaTrabajo = enterData.registerWorkingHours();
        List<Payments> listaHoraPagos = enterData.registerDataBase();
        // Read register from txt file
        ReadFile readFile = new ReadFile();
        String registroEmpleado = readFile.readTxtFile();
        // List employee register
        CleanRegister cleanRegister = new CleanRegister();
        List<Employee> listaRegistroTrabajo = cleanRegister.cleanRegister(registroEmpleado);
        // Validate Overlap
        ValidateOverlap validateOverlap = new ValidateOverlap();
        if (validateOverlap.validateInterval(listaRegistroTrabajo, listaJornadaTrabajo)) {
            return;
        }
        // Get salary employee
        System.out.println(getResult(listaRegistroTrabajo, listaHoraPagos));
    }

    /**
     * Get salary result
     *
     * @return
     */
    private static String getResult(List<Employee> listaRegistroTrabajo, List<Payments> listaHoraPagos) {
        CalculateSalary calculateSalary = new CalculateSalary();
        Integer salarioHoras = calculateSalary.getSalary(listaRegistroTrabajo, listaHoraPagos);
        return "The amount to pay " + listaRegistroTrabajo.get(0).getName() + " is: " + salarioHoras;
    }
}

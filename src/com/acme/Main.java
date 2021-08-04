package com.acme;

import com.acme.controller.CalculateSalary; 
import com.acme.model.WorkingHours;
import com.acme.model.Payments;
import com.acme.data.EnterData;
import com.acme.utils.ReadFile; 

import java.io.IOException;
import java.util.List;

/**
 * This class shows the results of employees salaries
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
		List<String> listRegistroEmpleado = readFile.readTxtFile();

		CalculateSalary calculateSalary = new CalculateSalary();
		calculateSalary.getAllSalaries(listaJornadaTrabajo, listaHoraPagos, listRegistroEmpleado);
	}
}

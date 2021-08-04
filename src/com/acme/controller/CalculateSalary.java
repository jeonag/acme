package com.acme.controller;

import com.acme.model.Employee;
import com.acme.model.Payments;
import com.acme.model.WorkingHours;
import com.acme.utils.CleanRegister;

import java.util.List;

/**
 * Calculate employee salary
 *
 * @author JOG.
 * @version 1.0
 */
public class CalculateSalary {
	/**
	 * This method Gets salary
	 *
	 * @param listaRegistroTrabajo
	 * @param listaHoraPagos
	 * @return
	 */
	public Integer getSalary(List<Employee> listaRegistroTrabajo, List<Payments> listaHoraPagos) {
		int totalSalary = 0;
		for (Employee item : listaRegistroTrabajo) {
			int inicioHoraTrabajo = Integer.parseInt(item.getStartTime());
			int finHoraTrabajo = Integer.parseInt(item.getEndTime());
			// compares the registration day with the base day
			for (Payments tiempoPago : listaHoraPagos) {
				if (tiempoPago.getDay().equals(item.getDay())) {
					int inicioHoraPago = Integer.parseInt(tiempoPago.getHorario().getStartTime());
					int finHoraPago = Integer.parseInt(tiempoPago.getHorario().getEndTime());
					totalSalary = calculateSalary(inicioHoraTrabajo, inicioHoraPago, finHoraTrabajo, finHoraPago,
							tiempoPago.getPaidValue(), totalSalary);
				}
			}
		}
		return totalSalary;
	}

	/**
	 * This method calculate employee salary
	 *
	 * @param inicioHoraTrabajo
	 * @param inicioHoraPago
	 * @param finHoraTrabajo
	 * @param finHoraPago
	 * @param valorpago
	 * @param totalSalary
	 * @return
	 */
	private Integer calculateSalary(int inicioHoraTrabajo, int inicioHoraPago, int finHoraTrabajo, int finHoraPago,
			int valorpago, int totalSalary) {
		if (validateWorkingHours(inicioHoraTrabajo, inicioHoraPago, finHoraTrabajo, finHoraPago)) {
			for (int j = inicioHoraTrabajo; j < finHoraTrabajo; j++) {
				int pagoAux = 1;
				pagoAux = pagoAux * valorpago;
				totalSalary += pagoAux;
			}
		}
		return totalSalary;
	}

	/**
	 * This method validate working hours
	 *
	 * @param inicioHoraTrabajo
	 * @param inicioHoraPago
	 * @param finHoraTrabajo
	 * @param finHoraPago
	 * @return
	 */
	private boolean validateWorkingHours(int inicioHoraTrabajo, int inicioHoraPago, int finHoraTrabajo,
			int finHoraPago) {
		return (inicioHoraTrabajo >= inicioHoraPago && finHoraTrabajo <= finHoraPago);
	}

	/**
	 * Get all employee salaries
	 * 
	 * @param listaJornadaTrabajo
	 * @param listaHoraPagos
	 * @param listRegistroEmpleado
	 */
	public void getAllSalaries(List<WorkingHours> listaJornadaTrabajo, List<Payments> listaHoraPagos, List<String> listRegistroEmpleado) {
		// List employee register
		CleanRegister listCleanRegister = new CleanRegister();
		// Validate Overlap
		ValidateOverlap validateOverlap = new ValidateOverlap();
		for (String item : listRegistroEmpleado) {
			List<Employee> listaRegistroTrabajo = listCleanRegister.cleanRegister(item);
			if (validateOverlap.validateInterval(listaRegistroTrabajo, listaJornadaTrabajo)) {
				return;
			}
			// Print salary employee
			System.out.println(getResult(listaRegistroTrabajo, listaHoraPagos));
		}
	}

	/**
	 * Get salary result register
	 *
	 * @return
	 */
	private String getResult(List<Employee> listaRegistroTrabajo, List<Payments> listaHoraPagos) {
		CalculateSalary calculateSalary = new CalculateSalary();
		Integer salarioHoras = calculateSalary.getSalary(listaRegistroTrabajo, listaHoraPagos);
		return "The amount to pay " + listaRegistroTrabajo.get(0).getName() + " is: " + salarioHoras;
	}
}

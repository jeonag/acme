package com.acme.utils;

import com.acme.model.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * This class clears txt file register
 *
 * @author JOG.
 * @version 1.0
 */
public class CleanRegister {

	/**
	 * Remove whitespace and get name, day and working hours
	 *
	 * @param register
	 * @return
	 */
	public List<Employee> cleanRegister(String register) {
		List<Employee> listWorkinghours = new ArrayList<>();
		List<String> listDays = new ArrayList<>();
		List<String> listHoursInterval = new ArrayList<>();

		String registroSinEspacios = register.replace(" ", "");
		String[] registroDivision = registroSinEspacios.split("[=,]");
		String getName = registroDivision[0];

		for (int i = 1; i < registroDivision.length; i++) {
			listDays.add(registroDivision[i].substring(0, 2));
			listHoursInterval.add(registroDivision[i].substring(2, 13));
		}
		for (int i = 0; i < listHoursInterval.size(); i++) {
			Employee employee = new Employee();
			String min = listHoursInterval.get(i).substring(0, 2);
			String max = listHoursInterval.get(i).substring(6, 8);

			if (max.equals("00")) {
				max = "24";
			}
			employee.setName(getName);
			employee.setDay(listDays.get(i));
			employee.setStartTime(min);
			employee.setEndTime(max);
			listWorkinghours.add(employee);
		}
		return listWorkinghours;
	}

	/**
	 * Validate the format of data 
	 * 
	 * @param register
	 * @return
	 */
	public boolean validateFormat(String register) {
		String registroSinEspacios = register.replace(" ", "");
		String[] registroDivision = registroSinEspacios.split("[=,]");
		for (int i = 1; i < registroDivision.length; i++) {
			if (registroDivision[i].length() < 13) {
				System.out.println("Invalid format in user: " + registroDivision[0]);
				return true;
			}
		}
		return false;
	}
}

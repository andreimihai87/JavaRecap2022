package amd.caveofprogramming.section19.l209;

import amd.caveofprogramming.section19.l209.exceptions.TemperatureTooHighException;
import amd.caveofprogramming.section19.l209.exceptions.TemperatureTooLowException;

public class HandlingMultipleExceptions {

	public static void main(String[] args) {

		Thermostat thermostat = new Thermostat();

		try {
			thermostat.setTemperature(40);
		} catch (TemperatureTooLowException e) {
			System.out.println(e.getMessage());
		} catch (TemperatureTooHighException e) {
			System.out.println(e.getMessage());
		}

	}

}

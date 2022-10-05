package amd.caveofprogramming.section19.l210;

import amd.caveofprogramming.section19.l210.exceptions.TemperatureTooHighException;
import amd.caveofprogramming.section19.l210.exceptions.TemperatureTooLowException;

public class CatchingMultipleExceptions {

	public static void main(String[] args) {

		Thermostat thermostat = new Thermostat();

		try {
			thermostat.setTemperature(-40);
		} catch (TemperatureTooLowException | TemperatureTooHighException e) {
			System.out.println(e.getMessage());
		}

		try {
			thermostat.setTemperature(40);
		} catch (TemperatureTooLowException e) {
			System.out.println(e.getMessage());
		} catch (TemperatureTooHighException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

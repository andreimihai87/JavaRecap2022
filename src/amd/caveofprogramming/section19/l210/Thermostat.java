package amd.caveofprogramming.section19.l210;

import amd.caveofprogramming.section19.l210.exceptions.TemperatureTooHighException;
import amd.caveofprogramming.section19.l210.exceptions.TemperatureTooLowException;

public class Thermostat {

	public void setTemperature(double temperature) throws TemperatureTooLowException, TemperatureTooHighException {

		setMachineTemperature(temperature);
		System.out.println("The temperature was set to: " + temperature);
	}

	private void setMachineTemperature(double temperature)
			throws TemperatureTooLowException, TemperatureTooHighException {

		if (temperature < 0) {
			throw new TemperatureTooLowException("Temperature below minimum threshold");
		} else if (temperature > 35) {
			throw new TemperatureTooHighException("Temperature above maximum threshold");
		}

		System.out.println("The machine recived the temperature: " + temperature);

	}

}

package amd.caveofprogramming.section19.l208;
import amd.caveofprogramming.section19.l208.exceptions.TemperatureOutOfRangeException;

public class Thermostat {

	public void setTemperature(double temperature) throws TemperatureOutOfRangeException {

		setMachineTemperature(temperature);
		System.out.println("The temperature was set to: " + temperature);
	}
	
	private void setMachineTemperature(double temperature) throws TemperatureOutOfRangeException {
		
		if (temperature < 0 || temperature > 35) {
			throw new TemperatureOutOfRangeException("Temperature is out of range");
		}
		
		System.out.println("The machine recived the temperature: " + temperature);
		
	}

}

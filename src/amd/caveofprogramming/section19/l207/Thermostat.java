package amd.caveofprogramming.section19.l207;

public class Thermostat {

	public void setTemperature(double temperature) {

		setMachineTemperature(temperature);
		System.out.println("The temperature was set to: " + temperature);
	}
	
	private void setMachineTemperature(double temperature) {
		
		if (temperature < 0 || temperature > 35) {
			throw new RuntimeException("Temperature is out of range");
		}
		
		System.out.println("The machine recived the temperature: " + temperature);
		
	}

}

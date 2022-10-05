package amd.caveofprogramming.section19.l205;

public class Thermostat {

	public void setTemperature(double temperature) throws Exception {

		if (temperature < 0 || temperature > 35) {
			throw new Exception("Temperature is out of range");
		}

		System.out.println("The temperature was set to: " + temperature);
	}

}

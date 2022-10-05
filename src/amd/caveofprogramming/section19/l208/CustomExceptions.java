package amd.caveofprogramming.section19.l208;
import amd.caveofprogramming.section19.l208.exceptions.TemperatureOutOfRangeException;

public class CustomExceptions {

	public static void main(String[] args) {

		Thermostat thermostat = new Thermostat();
		
		try {
			thermostat.setTemperature(40);
		} catch (TemperatureOutOfRangeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}

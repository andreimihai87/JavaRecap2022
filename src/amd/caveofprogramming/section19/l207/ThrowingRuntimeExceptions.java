package amd.caveofprogramming.section19.l207;

public class ThrowingRuntimeExceptions {

	public static void main(String[] args) {

		Thermostat thermostat = new Thermostat();
		
		try {
			thermostat.setTemperature(40);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}

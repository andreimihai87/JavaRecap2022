package amd.caveofprogramming.section19.l206;

public class TheCallStack {

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

package amd.caveofprogramming.section6.agc100;

public class Mountain {

	private String name;
	private int heightMeters;
	private double peakTemperature;

	public Mountain(String name, int heightMeters, double peakTemperature) {
		this.name = name;
		this.heightMeters = heightMeters;
		this.peakTemperature = peakTemperature;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeightMeters() {
		return heightMeters;
	}

	public void setHeightMeters(int heightMeters) {
		this.heightMeters = heightMeters;
	}

	public double getPeakTemperature() {
		return peakTemperature;
	}

	public void setPeakTemperature(double peakTemperature) {
		this.peakTemperature = peakTemperature;
	}

	@Override
	public String toString() {
		return "Mountain [name=" + name + ", heightMeters=" + heightMeters + ", peakTemperature=" + peakTemperature
				+ "]";
	}

}

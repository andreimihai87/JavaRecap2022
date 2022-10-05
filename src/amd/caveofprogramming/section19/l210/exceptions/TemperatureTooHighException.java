package amd.caveofprogramming.section19.l210.exceptions;

public class TemperatureTooHighException extends TemperatureOutOfRangeException {

	private static final long serialVersionUID = 1L;

	public TemperatureTooHighException(String message) {
		super(message);
	}

}

package amd.caveofprogramming.section19.l209.exceptions;

public class TemperatureTooHighException extends TemperatureOutOfRangeException {

	private static final long serialVersionUID = 1L;

	public TemperatureTooHighException(String message) {
		super(message);
	}

}

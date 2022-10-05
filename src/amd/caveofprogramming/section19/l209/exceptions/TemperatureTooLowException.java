package amd.caveofprogramming.section19.l209.exceptions;

public class TemperatureTooLowException extends TemperatureOutOfRangeException {

	private static final long serialVersionUID = 1L;

	public TemperatureTooLowException(String message) {
		super(message);
	}

}

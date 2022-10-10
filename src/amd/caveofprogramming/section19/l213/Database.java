package amd.caveofprogramming.section19.l213;

public class Database implements AutoCloseable {
	
	private String connectionInfo;
	
	public Database(String connectionInfo) {
		System.out.println("Opening connection... ");
		this.connectionInfo = connectionInfo;
	}
	
	public void getData() {
		System.out.println("Getting data from " + connectionInfo);
	}
	
	@Override
	public void close() {
		System.out.println("Closing the connection... ");
	}

}

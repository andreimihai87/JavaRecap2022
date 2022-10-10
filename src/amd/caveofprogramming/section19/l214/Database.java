package amd.caveofprogramming.section19.l214;

public class Database implements AutoCloseable {

	private String connectionInfo;

	public Database(String connectionInfo) throws Exception {
		
		System.out.println("Opening connection... " + connectionInfo);

		if (connectionInfo == null) {
			throw new Exception("Cannot connect to the: " + connectionInfo);
		}

		this.connectionInfo = connectionInfo;
	}

	public void getData() throws Exception {

		if (connectionInfo.length() < 4) {
			throw new Exception("Cannot get the data from: " + connectionInfo);
		}

		System.out.println("Getting data from " + connectionInfo);
	}

	@Override
	public void close() throws Exception {

		if (connectionInfo == null) {
			throw new Exception("Cannot close the connection: " + connectionInfo);
		}

		System.out.println("Closing the connection... " + connectionInfo);
	}

}

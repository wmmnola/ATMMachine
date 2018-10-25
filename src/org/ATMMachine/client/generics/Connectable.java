package org.ATMMachine.client.generics;

import java.io.IOException;

public interface Connectable {
	void createSocket(String ip, int port) throws IOException;
	void writeData(byte type, String data) throws IOException;
	void recieveData() throws IOException;
	void disconnect() throws IOException;
}

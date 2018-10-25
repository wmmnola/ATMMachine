package org.ATMMachine.client.generics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import org.ATMMachine.client.*;

public abstract class Transaction implements Connectable,Transactionable,ActionListener {
	private String type;
	private int ip;
	private Socket socket;
	private int balance;
	
	abstract public void changeBalance();
	
	public Transaction(String type, int ip) {
		this.type = type;
		this.ip = ip;
	}
	public int getBalance() {return balance;}
	public void createSocket(String ip, int port) throws IOException{
		socket = new Socket(ip,port);
	}
	public void writeData(byte type, String data) throws IOException {
		DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());
		dOut.writeByte(type);
		dOut.writeUTF(data);
		dOut.flush();
		
	}
	public void recieveData() throws IOException {
		
	}
	public void disconnect() throws IOException {
		socket.close();
	}
	public void actionPerformed(ActionEvent e) {
		
	}
	
}

package org.ATMMachine.client;

import java.io.IOException;

import org.ATMMachine.client.generics.*;

public class Deposit extends Transaction {
	public Deposit(int ip) {
		super("Deposit", ip);
	}


	public int getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void changeBalance() {
		// TODO Auto-generated method stub
		
	}



}

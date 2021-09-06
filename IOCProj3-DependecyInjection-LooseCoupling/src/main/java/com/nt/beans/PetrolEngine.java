//PetrolEngine.java
package com.nt.beans;

public class PetrolEngine implements Engine {
	
	public PetrolEngine() {
	   System.out.println("PetrolEngine:: 0-param constructor");
	}

	@Override
	public void startEngine() {
		System.out.println("PetrolEngine: started");

	}

	@Override
	public void stopEngine() {
		System.out.println("PetrolEngine: stopped");

	}

}

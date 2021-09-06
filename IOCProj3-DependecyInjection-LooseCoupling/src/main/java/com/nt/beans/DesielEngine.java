//DesielEngine.java
package com.nt.beans;

public class DesielEngine implements Engine {
	public DesielEngine() {
		System.out.println("DieselEngine:: 0-param constructor");
	}

	@Override
	public void startEngine() {
		System.out.println("DesielEngine: started");

	}

	@Override
	public void stopEngine() {
		System.out.println("DieselEngine: stopped");

	}

}

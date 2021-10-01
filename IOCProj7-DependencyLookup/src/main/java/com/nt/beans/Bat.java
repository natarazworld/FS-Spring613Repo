package com.nt.beans;

import java.util.Random;

public class Bat {

	public Bat() {
		System.out.println("Bat:: 0-param constructor");
	}
	
	public  int scoreRuns() {
		return new Random().nextInt(200);
	}
}

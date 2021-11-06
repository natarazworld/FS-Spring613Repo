//target class or service class
package com.nt.service;

import org.springframework.stereotype.Component;

@Component("bankService")
public class BankService {
	
	public double calcSimpleIntrestAmount(double pamt,double rate,double time) {
		System.out.println("BankService.calcSimpleIntrestAmount(-,-) (target method)");
		return  pamt*rate*time/100;
	}
	
	public double calcCompoundIntrestAmount(double pamt,double rate,double time) {
		System.out.println("BankService.calcCompoundIntrestAmount(-,-) (target method)");
		return  (pamt*Math.pow(1+rate/100, time))-pamt;
	}
	
	

}

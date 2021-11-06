package com.nt.service;

import org.springframework.stereotype.Service;

@Service("ecommerceService")
public class EcommerceStore {
	
	public  double  shopping(String items[],double prices[]) {
   System.out.println("EcommerceStore.shopping(-,-)");		
		double billAmt=0;
		if(items!=null) {
			  for(double p:prices)
				  billAmt=billAmt+p;
		}
		return  billAmt;
	}

}

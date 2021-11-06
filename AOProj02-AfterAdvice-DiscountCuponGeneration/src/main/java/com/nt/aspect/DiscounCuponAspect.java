package com.nt.aspect;

import java.io.FileWriter;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("discountAspect")
@Aspect
public class DiscounCuponAspect {
	
	@AfterReturning(value="execution(double  com.nt.service.EcommerceStore.*(..))",
			                   returning="billAmt")
	public void  cupon(JoinPoint jp, double billAmt) throws Exception {
		System.out.println("after advice is applied on"+jp.getSignature()+" with args"+Arrays.deepToString(jp.getArgs()));
		String cuponMsg=null;
		
		if(billAmt>=50000)
			cuponMsg="avail 40% discount on next purchase";
		else if(billAmt>=30000)
			cuponMsg="avail 20% discount on next purchase";
		else if(billAmt>=15000)
			cuponMsg="avail 15% discount on next purchase";
		else
			cuponMsg="avail 5% discount on next purchase";
		//generate cupon
		FileWriter writer=new FileWriter("E:/cupon.txt");
		writer.write(cuponMsg);
		writer.flush();
		writer.close();
		billAmt=billAmt+10000;
	}

}

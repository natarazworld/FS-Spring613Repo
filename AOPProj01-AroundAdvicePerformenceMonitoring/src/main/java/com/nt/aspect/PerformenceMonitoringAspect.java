package com.nt.aspect;
//aspect class
import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("pmAspect")
@Aspect
public class PerformenceMonitoringAspect {
	
	@Around(value = "execution(double com.nt.service.BankService.calc*(..))")
	public  Object performence(ProceedingJoinPoint pjp)throws Throwable{
		long start=System.currentTimeMillis();
		Object retVal=pjp.proceed();
		long end=System.currentTimeMillis();
		System.out.println(pjp.getSignature()+" with args"+Arrays.toString(pjp.getArgs())+" has taken"+(end-start)+" ms to complete the execution");
		return retVal;
	}

}

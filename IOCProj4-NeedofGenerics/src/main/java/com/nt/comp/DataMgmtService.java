package com.nt.comp;

public class DataMgmtService {
	
	public  Person  showData(String type) {
		if(type.equalsIgnoreCase("emp"))
			return new Employee();
		else if(type.equalsIgnoreCase("cust"))
			return new Customer();
		else
			return null;
	}
	
	
	public  <T> T  showData1(String type,Class<T> clazz) {
		if(type.equalsIgnoreCase("emp"))
			return (T) new Employee();
		else if(type.equalsIgnoreCase("cust"))
			return (T) new Customer();
		else
			return null;
	}

}

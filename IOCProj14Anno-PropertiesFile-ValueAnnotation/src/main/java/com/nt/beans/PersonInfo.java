// PersonInfo .java
package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("per")
@PropertySource("com/nt/commons/info.properties")
public class PersonInfo {
	@Value("${per.name}")
	private String name;
	@Value("${per.age}")
	private int age;
	
	//toString
	@Override
	public String toString() {
		return "PersonInfo [name=" + name + ", age=" + age + "]";
	}
	
}

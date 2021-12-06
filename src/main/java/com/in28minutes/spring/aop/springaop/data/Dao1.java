package com.in28minutes.spring.aop.springaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {
	
	public String getSomething() {
		return "DAO 1";
	}

}

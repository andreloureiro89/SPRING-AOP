package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserBeforeAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private Boolean acess = true;
	
	
	@Before("execution(* com.in28minutes.spring.aop.springaop.business.*.*(..))")
	public void before(JoinPoint joinPoint) {
		logger.info("=============== INTERCEPTED METHOD CALL ==> " + joinPoint);
		logger.info("");
		logger.info("=============== CHECK USER ACCESS =============== ");

		if (acess) {
			logger.info("USER CAN ACCESS");
		} else {
			logger.info("USER CANNOT ACCESS");
		}
	}

}

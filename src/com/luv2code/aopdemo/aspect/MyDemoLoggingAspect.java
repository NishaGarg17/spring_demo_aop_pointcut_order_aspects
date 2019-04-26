package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class MyDemoLoggingAspect {

	@Before("com.luv2code.aopdemo.aspect.AopExpressions.forDAOPackageNoGeterSetter()")//give fully qualified name if you want to access pointcut present in different class
	public void beforeAddAccountAdvice() {
		System.out.println("\n==========>>> Executing @Before Advice on addAccount()");
	}

}

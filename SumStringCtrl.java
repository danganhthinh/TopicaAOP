package com.example.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SumStringCtrl {
	@Around("execution(* com.example.demo.*.*(..))")
	public Object sumCtrl(ProceedingJoinPoint point) {
		Object object = null;
		try {
			Object[] objects = point.getArgs();
			String a = objects[0].toString();
			String b = objects[1].toString();

			if (a.matches("[0-9]+") && b.matches("[0-9]+")) {
				object = (String) point.proceed();
				System.out.println(" " + object);
			} else {
				object = "N/A";
			}
		} catch (Throwable e) {

			e.printStackTrace();
		}
		return object;

	}
}

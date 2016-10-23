package com.netease.course;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

	@After(value="execution(* com.netease.course.AdoService.*(..))") 
	private void afterExe(JoinPoint jp) {
		System.out.println("�������ƣ�" + jp.getSignature().getName());
		
		Object[] args = jp.getArgs(); 
		for (int i = 0; i < args.length; i++) {			
			System.out.println( "����" + (i+1) + ": " + args[i].toString());
		}	
		
		System.out.println("��������");
	}	
	
	@AfterReturning(value="execution(* com.netease.course.AdoService.*(..))") 
	private void afterRtExe(JoinPoint jp) {
		System.out.println("�������ƣ�" + jp.getSignature().getName());
		
		Object[] args = jp.getArgs(); 
		for (int i = 0; i < args.length; i++) {			
			System.out.println( "����" + (i+1) + ": " + args[i].toString());
		}	
		
		System.out.println("��������");
	}	
	
	@AfterThrowing(value="execution(* com.netease.course.AdoService.*(..))")
	private void afterThrowingExe(JoinPoint jp) {
		System.out.println("�������ƣ�" + jp.getSignature().getName());
		
		Object[] args = jp.getArgs(); 
		for (int i = 0; i < args.length; i++) {			
			System.out.println( "����" + (i+1) + ": " + args[i].toString());
		}
		
		System.out.println("�׳��쳣");
	}
	
}

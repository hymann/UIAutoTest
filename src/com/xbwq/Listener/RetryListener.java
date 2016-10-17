package com.xbwq.Listener;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.eclipse.jdt.internal.compiler.ast.Annotation;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation annotation, Class arg1, Constructor arg2,
			Method arg3) {
		IRetryAnalyzer retry = annotation.getRetryAnalyzer();
		if(retry == null){
			annotation.setRetryAnalyzer(Retry.class);
		}
	}

}

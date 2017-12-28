package com.learning.Aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LearnAspect
{
    public LearnAspect() {
        System.out.println("LearnAspect ctor");
    }

    @Pointcut("execution(public void com.learning.Aspects.AnyObject.run2(String)) && args(val) ")
    private void savePointcut(String val) { }

    @AfterReturning("savePointcut(val)")
    public void afterReturning(JoinPoint joinPoint, String val){

        System.out.println(String.format("Testing - %s", val));
    }

//    @AfterReturning(pointcut="execution(public void com.learning.Aspects.AnyObject.run2(String))")
//    public void afterReturning() {
//        System.out.println(String.format("AfterReturning executed! %s", value));
//    }

    @Around("execution(public void com.learning.Aspects.AnyObject.run2(String))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Around - before execution");
        Object retVal = pjp.proceed();
        System.out.println("Around - after execution");
        return retVal;
    }
}

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

    @Pointcut("execution(public void com.learning.Aspects.GenericAnyObject+.save(..)) && args(val) ")
    private void savePointcut(AnyObject val) { }

    @AfterReturning("savePointcut(val)")
    public void afterReturning(JoinPoint joinPoint, AnyObject val){
        System.out.println(String.format("AfterReturning aspect - %s", val));
    }

    @Around("savePointcut(val)")
    public Object around(ProceedingJoinPoint pjp, AnyObject val) throws Throwable {
        System.out.println("Around aspect - before execution");
        Object retVal = pjp.proceed();
        System.out.println("Around aspect - after execution");
        return retVal;
    }
}

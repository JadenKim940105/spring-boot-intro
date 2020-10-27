package me.summerbell.springbootintroduction.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeTraceAop {

    @Around("@annotation(me.summerbell.springbootintroduction.aop.TimeTracing)")
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable{
        long begin = System.currentTimeMillis();
        try{
            return joinPoint.proceed();
        } finally {
            System.out.println("측정시간 : " + (System.currentTimeMillis() - begin) + "ms");
        }
    }
}

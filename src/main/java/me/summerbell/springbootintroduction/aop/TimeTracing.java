package me.summerbell.springbootintroduction.aop;

import java.lang.annotation.*;

/*
   메서드 성능을 측정
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface TimeTracing {
}

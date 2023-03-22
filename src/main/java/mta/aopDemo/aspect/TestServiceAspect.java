package mta.aopDemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class TestServiceAspect {
    private Logger logger = LoggerFactory.getLogger(TestServiceAspect.class);

    @Before("execution(* mta.aopDemo.dao.ClassDAO.callDaoSuccess(..))") //Point Cut
    public void before(JoinPoint joinPoint) {

        logger.info("Aspect: before called " + joinPoint.toString());
    }

    @After("execution(* mta.aopDemo.dao.*.*(..))") //Point Cut
    public void after(JoinPoint joinPoint) {
        logger.info("Advice:  after called " + joinPoint.toString());
    }

    @AfterReturning("execution(* mta.aopDemo.dao.*.*(..))")//Point Cut
    public void afterReturning(JoinPoint joinPoint) {
        logger.info("Advice:  afterReturning called " + joinPoint.toString());
    }

    @AfterThrowing("execution(* mta.aopDemo.dao.*.*(..))")//Point Cut
    public void afterThrowing(JoinPoint joinPoint) {
        logger.info("Advice:  afterThrowing called " + joinPoint.toString());
    }

    @Around("execution(* mta.aopDemo.dao.*.*(..))")//Point Cut
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {

        Long startTime = System.currentTimeMillis();
        logger.info("Advice: Start Time Taken by {} is {}", joinPoint, startTime);
        joinPoint.proceed();

        Long timeTaken = System.currentTimeMillis() - startTime;
        logger.info("Advice: Time Taken by {} is {}", joinPoint, timeTaken);
    } 
}

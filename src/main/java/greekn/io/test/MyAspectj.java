package greekn.io.test;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-08 21:05
 * @package: greekn.io.test
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
@Component
@Aspect
public class MyAspectj {

    @Pointcut("execution(* greekn.io.test..*.*(..))")
    public void point(){};

    @Before("point()")
    public void before() {
        System.out.println("before...");
    }

    @AfterReturning("point()")
    public void after() {
        System.out.println("after...");
    }
}

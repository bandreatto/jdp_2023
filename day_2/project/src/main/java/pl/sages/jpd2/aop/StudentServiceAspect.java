package pl.sages.jpd2.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
class StudentServiceAspect {

    @Pointcut("execution(* pl.sages.jpd2.aop.StudentService.*(..))")
    void anyStudentService() {

    }

    @Before("anyStudentService()")
    void beforeServiceCall(JoinPoint joinPoint) {
        log.info("Before service call: " + joinPoint.getSignature().getName());
    }
}

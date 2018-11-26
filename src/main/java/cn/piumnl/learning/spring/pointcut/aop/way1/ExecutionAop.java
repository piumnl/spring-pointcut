package cn.piumnl.learning.spring.pointcut.aop.way1;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import cn.piumnl.learning.spring.pointcut.aop.AbstractAop;

/*************************************************************
 * function - 子包aop代理
 * Copyright(c)
 * @author ex-zhongziqi001 2018/11/23
 * @date 2018/11/23
 * @version 1.0
 *************************************************************/
@Aspect
@Component
public class ExecutionAop implements AbstractAop {

    @Pointcut("execution(* cn.piumnl.learning.spring.pointcut.web..*.*(..))")
    public void pointcut() {
    }

    @After("pointcut()")
    public void executionAfter() {
        print();
    }
}

package cn.piumnl.learning.spring.pointcut.aop.way5;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import cn.piumnl.learning.spring.pointcut.aop.AbstractAop;

/*************************************************************
 * function -
 * Copyright(c)
 * @author ex-zhongziqi001 2018/11/23
 * @date 2018/11/23
 * @version 1.0
 *************************************************************/
@Aspect
@Component
public class ArgsAop implements AbstractAop {

    @Pointcut("args(entity)")
    public void pointcut(ArgsEntity entity) {
    }

    @After(value = "pointcut(entity)", argNames = "entity")
    public void test(ArgsEntity entity) {
        print();
    }
}


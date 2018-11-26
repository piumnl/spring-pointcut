package cn.piumnl.learning.spring.pointcut.aop.way2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import cn.piumnl.learning.spring.pointcut.aop.AbstractAop;

/*************************************************************
 * function - within 语法
 * Copyright(c)
 * @author ex-zhongziqi001 2018/11/23
 * @date 2018/11/23
 * @version 1.0
 *************************************************************/
@Aspect
@Component
public class WithinAop implements AbstractAop {

    @Pointcut("within(cn.piumnl.learning.spring.pointcut.web..*)")
    public void pointcut() {
    }

    @After("pointcut()")
    public void withinAfter() {
        print();
    }

}

package cn.piumnl.learning.spring.pointcut.aop.way3;

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
public class ThisAop implements AbstractAop {

    @Pointcut("this(cn.piumnl.learning.spring.pointcut.aop.way3.ThisInterface)")
    public void pointcut() {
    }

    @After("pointcut()")
    public void thisAfter() {
        print();
    }
}

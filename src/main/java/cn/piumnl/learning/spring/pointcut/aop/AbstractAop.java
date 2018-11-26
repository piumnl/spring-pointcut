package cn.piumnl.learning.spring.pointcut.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*************************************************************
 * function - 
 * Copyright(c)
 * @author ex-zhongziqi001 2018/11/26
 * @date 2018/11/26
 * @version 1.0
 *************************************************************/
public interface AbstractAop {

    Logger logger = LoggerFactory.getLogger(AbstractAop.class);

    default void print() {
        try {
            Method method = this.getClass().getMethod("pointcut");
            Pointcut pointcut = method.getAnnotation(Pointcut.class);
            logger.info("你被 [ {} ] 切入了！", pointcut.value());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}

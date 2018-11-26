package cn.piumnl.learning.spring.pointcut.web.way5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.piumnl.learning.spring.pointcut.aop.way5.ArgsEntity;

/*************************************************************
 * function - 
 * Copyright(c)
 * @author ex-zhongziqi001 2018/11/23
 * @date 2018/11/23
 * @version 1.0
 *************************************************************/
@RestController
public class ArgsController {

    @GetMapping("/level5")
    public String level5(ArgsEntity entity) {
        System.out.println("------------- level5 ----------------");
        return "level5";
    }
}

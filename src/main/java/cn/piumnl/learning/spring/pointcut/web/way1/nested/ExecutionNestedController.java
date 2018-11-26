package cn.piumnl.learning.spring.pointcut.web.way1.nested;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*************************************************************
 * function - 
 * Copyright(c)
 * @author ex-zhongziqi001 2018/11/23
 * @date 2018/11/23
 * @version 1.0
 *************************************************************/
@RestController
public class ExecutionNestedController {

    @GetMapping("/level2")
    public String level2() {
        System.out.println("------------- level2 ----------------");
        return "level2";
    }
}

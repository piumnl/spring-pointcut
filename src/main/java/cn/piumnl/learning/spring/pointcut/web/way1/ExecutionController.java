package cn.piumnl.learning.spring.pointcut.web.way1;

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
public class ExecutionController {

    @GetMapping("/level1")
    public String level1() {
        System.out.println("------------- level1 ----------------");
        return "level1";
    }
}

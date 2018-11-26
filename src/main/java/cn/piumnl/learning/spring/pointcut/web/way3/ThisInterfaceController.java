package cn.piumnl.learning.spring.pointcut.web.way3;

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
public class ThisInterfaceController implements cn.piumnl.learning.spring.pointcut.aop.way3.ThisInterface {

    @GetMapping("/level3")
    public String level3() {
        System.out.println("------------- level3 ----------------");
        return "level3";
    }
}


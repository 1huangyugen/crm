package com.askj.crm.we.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shkstart
 * @date 2023/3/21-15:36
 */
//7
@Controller
public class IndexController {
    /*
    理论上，给controller方法分配url：http://127.0.0.1:8080/crm/
    为了简便，协议://ip:port/应用名称必须省去，用/代表应用根目录下的/
     */

    @RequestMapping("/")
    public String index(){
        //请求转发
        return "index";
    }
}

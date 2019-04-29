package com.lic.webjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author relic
 * @Date 2019/4/29
 * @描述:
 */
@Controller
public class IndexController {
    @RequestMapping("/s")
    public String index(){
        return "index";
    }

    @RequestMapping("/indexs")
    @ResponseBody
    public String index2(){
        return "index";
    }
}

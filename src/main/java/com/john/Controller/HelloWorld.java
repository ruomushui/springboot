package com.john.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloWorld {
    @RequestMapping("/hello")
    @ResponseBody
    public Map hello(){
        Map map = new HashMap();
        map.put("1",321);
        map.put("2",123);
        map.put("3",123);
        map.put("4",123);
        map.put("5",123);
        map.put("6",123);
        map.put("7",123);
        map.put("8",123);


        return map;
    }
}

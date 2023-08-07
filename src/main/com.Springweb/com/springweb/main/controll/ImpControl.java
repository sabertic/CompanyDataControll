package com.springweb.main.controll;

import com.springweb.main.Info.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
public class ImpControl {
    @RequestMapping("" +
            "")
    public String simpleparam (String username, Integer age) {
        System.out.println (username + "   " + age); return "ok";
    }
    
    @RequestMapping("/simplepojo")
    public String simplepojo (User user) {
        System.out.println (user); return "ok";
    }
    
    @RequestMapping("/complexepojo")
    public String complexpojo (User user) {
        System.out.println (user); return "ok";
    }
    
    @RequestMapping("/arrayparam")
    public String arrayparam (String[] hobby) {
        System.out.println (Arrays.toString (hobby)); return "ok";
    }
    
    @RequestMapping("/listparam")
    public String listparam (@RequestParam List<String> hobby) {
        System.out.println (hobby);
        return "ok";
    }
    
    @RequestMapping("/dataparam")
    public String dataparam (@DateTimeFormat (pattern = "yy-MM-dd  HH-mm-ss")LocalDateTime localDateTime) {
        System.out.println (localDateTime);
        return "ok";
    }
    
    @RequestMapping("/json")
    public String json(@RequestBody User user) {
        System.out.println (user);
        return "ok";
    }
}

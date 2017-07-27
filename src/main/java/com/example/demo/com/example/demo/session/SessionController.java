package com.example.demo.com.example.demo.session;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by chai on 17/7/24.
 */
@RestController
public class SessionController {
    @RequestMapping("/tession")
    public String TestSession(HttpServletRequest req, HttpServletResponse resp, String age){
        String a = (String) req.getSession().getAttribute("age");
        return a;
    }
}

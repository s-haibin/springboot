package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@Controller
@WebService
public class LoginController {

    @RequestMapping(value = "hello")
    @ResponseBody
    public String Hello(){
        return "Heoll Spring Boot";
    }

    public String transWords(String words){
        String res ="";
        for(char ch:words.toCharArray()){
            res+=ch+",";
        }
        return res;
    }

    public static void main(String args[]){
        Endpoint.publish("http://localhost:8080/springboot/LoginController", new LoginController());
        System.out.println("发布webservice接口成功");
    }
}

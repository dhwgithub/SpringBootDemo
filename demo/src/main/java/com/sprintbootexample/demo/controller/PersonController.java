package com.sprintbootexample.demo.controller;

import com.sprintbootexample.demo.pojo.Person;
import com.sprintbootexample.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/testSprtingBoot")
//    @ResponseBody //返回的是数值类型的参数，包括string、json等；不加的话返回的是页面
    public String testSprtingBoot(HttpSession session){

//        Person person = new Person();
//        person.setName("测试员");
//        person.setPwd("test");
//        personService.insert(person);

        List<Person> person = personService.selectByName("test");
        session.setAttribute("username",person.get(0));

        return "jsp/test";
    }

}

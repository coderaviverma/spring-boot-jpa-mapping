package com.coderaviverma.spring_jpa_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.LinkedHashMap;

@RestController
public class DBTestController {

    @Autowired
    DemoRepository repository;

    @RequestMapping(value = "dbtest/jsontest", method = RequestMethod.POST)
    public Object requestBodyDemo(@RequestBody Department department) {
        Department department1= repository.save(department);
        System.out.println("department=  "+department);
        System.out.println("department1=  "+department1);
        return department1;
    }


}

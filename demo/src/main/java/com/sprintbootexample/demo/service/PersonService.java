package com.sprintbootexample.demo.service;

import com.sprintbootexample.demo.dao.PersonMapper;
import com.sprintbootexample.demo.pojo.Person;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PersonService {

    @Resource
    private PersonMapper personMapper;

    
    public int insert(Person record) {
        return personMapper.insert(record);
    }

    public List<Person> selectByName(String name) {
        return personMapper.selectByName(name);
    }
}

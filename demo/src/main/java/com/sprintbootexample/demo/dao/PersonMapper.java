package com.sprintbootexample.demo.dao;

import com.sprintbootexample.demo.pojo.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
//@Component
public interface PersonMapper {
    int insert(Person record);

    int insertSelective(Person record);

    List<Person> selectByName(@Param("name")String name);


}
package org.example.controller;

import org.example.entity.Person;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/restful")
public class RestfulController {
    @GetMapping("/request")
    public String doGetRequest(){
        return "{\"message\":\"返回查询结果\"}";
    }
    @PostMapping("/request/{rid}")
    public String doGetRequest(@PathVariable("rid") Integer requestId, Person person){
        System.out.println(person.getName() + ":" + person.getAge());
        return "{\"message\":\"数据新建成功\",\"id\":" + requestId + "}";
    }

    @PostMapping("/request")
    public String doPutRequest(Person person){
        System.out.println(person.getName() + ":" + person.getAge());
        return "{\"message\":\"数据更新成功\"}";
    }

    @DeleteMapping("/request")
    public String doDeleteRequest(){
        return "{\"message\":\"删除数据成功\"}";
    }

    @GetMapping("/person")
    public Person findByPersonId(Integer id){
        Person p = new Person();
        if ( id == 1 ){
            p.setName("lily");
            p.setAge(24);
        } else if ( id == 2 ) {
            p.setName("smith");
            p.setAge(26);
        }
        return p;
    }

    @GetMapping("/persons")
    public List<Person> findPersons(){
        List<Person> list = new ArrayList<>();
        Person p1 = new Person();
        p1.setName("lily");
        p1.setAge(24);
        return list;
    }
}

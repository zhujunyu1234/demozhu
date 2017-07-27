package com.example.demo;

import com.example.demo.com.example.demo.cache.PerRepository;
import com.example.demo.com.example.demo.cache.PerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by chai on 17/7/13.
 * Passw0rd
 */
@RestController
public class DataController {
    @Autowired
    PersonRepository personRepository;

    @Autowired
    PerService perService;

    @RequestMapping("/save")
    public  Person save(String name,int age,String address){
        Person p= personRepository.save(new Person(name,age ,address));
        return p;
    }
//
//    @RequestMapping("/q1")
//    public List<Person> q1(String address){
//        List<Person> persons=personRepository.findByAddress(address);
//        return persons;
//    }
//    @RequestMapping("/q2")
//    public Person q2(String name, String address){
//        Person person =personRepository.findPersonByNameAndAddress(name,address);
//        return person;
//    }
//
//    @RequestMapping("/q3")
//    public Person q3(String name,String address){
//        Person person =personRepository.withNameAndAddressNamedQuery(name,address);
//        return person;
//    }
//
//    @RequestMapping("/q4")
//    public Person q4(String name, String address){
//        Person person = personRepository.withNameAndAddresQuery(name,address);
//        return person;
//    }
//
//    @RequestMapping("/sort")
//    public List<Person> sort(){
//        List<Person> persons = personRepository.findAll(new Sort(Sort.Direction.ASC,"age"));
//        return persons;
//    }
//
//    @RequestMapping("/page")
//    public Page<Person> page(){
//        Page<Person> pagePeople = personRepository.findAll(new PageRequest(1,2));
//        return pagePeople;
//    }

    @RequestMapping("/auto")
    public Page<Person> auto(Person person){
        Page<Person> pagePeople = personRepository.findPersonByAuto(person,new PageRequest(0,10));
        return pagePeople;
    }

    @RequestMapping("/put")
    public Person put(Person person){
        return perService.save(person);
    }

    @RequestMapping("/able")
    public Person cacheable(Person person){
        return perService.findOne(person);
    }

    @RequestMapping("/evit")
    public String evit(int id){
        perService.remove(id);
        return "ok";
    }
}

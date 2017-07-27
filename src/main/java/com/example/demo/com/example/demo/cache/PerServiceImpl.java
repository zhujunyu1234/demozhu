package com.example.demo.com.example.demo.cache;

import com.example.demo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by chai on 17/7/21.
 */
@Service
public class PerServiceImpl implements PerService {
    @Autowired
    PerRepository perRepository;

    @Override
    @CachePut(value = "people", key = "#person.id")
    public Person save(Person person) {
        Person p = perRepository.save(person);
        return p;
    }

    @Override
    @CacheEvict(value = "people")
    public void remove(int id) {
        System.out.println("删除id"+id);
    }

    @Override
    @Cacheable(value = "people",key = "#person.id")
    public Person findOne(Person person) {
        Person p = perRepository.findOne(person.getId());
        return p;
    }
}

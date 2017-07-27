package com.example.demo.com.example.demo.cache;

import com.example.demo.Person;

/**
 * Created by chai on 17/7/21.
 */
public interface PerService {
    public Person save(Person person);
    public void remove(int id);
    public Person findOne(Person person);
}

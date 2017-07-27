package com.example.demo.com.example.demo.cache;

import com.example.demo.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by chai on 17/7/21.
 */
public interface PerRepository extends JpaRepository<Person,Long> {

}

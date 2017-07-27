package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chai on 17/7/13.
 */
public interface PersonRepository extends CustomRepository<Person,Long>{
    List<Person> findByAddress(String name);
  //  Person findPersonByNameAndAddress(String name,String address);
   // Person withNameAndAddressNamedQuery(String name,String address);

//    @Query("select p from Person p where p.name= :name and p.address = :address")
  //  Person withNameAndAddresQuery(@Param("name")String name,@Param("address") String address);
}

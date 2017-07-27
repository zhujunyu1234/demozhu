package com.example.demo;

import org.hibernate.annotations.Table;
import org.hibernate.mapping.Value;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import java.io.Serializable;

import static com.sun.xml.internal.ws.policy.sourcemodel.wspolicy.XmlToken.Name;

/**
 * Created by chai on 17/7/13.
 */
@Entity
@NamedQuery(name ="Person.withNameAndAddressNamedQuery",query="select p from Person p where p.name=?1 and p.address=?2")
public class Person implements Serializable{
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer age;
    private String address;
    public Person(String name,int age,String address){
        super();
        this.name=name;
        this.age=age;
        this.address=address;
    }
    public Person(){

    }
    public Integer getAge() {
        return age;
    }

    public Long getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

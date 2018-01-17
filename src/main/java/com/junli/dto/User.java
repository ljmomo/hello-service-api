package com.junli.dto;

import java.io.Serializable;

/**
 * @author lijun
 * @time 2018-01-16 16:06
 */
public class User implements Serializable{
    private static final long serialVersionUID = -6300526372970181461L;
    String name;
    Integer age;

    public User() {
        super();
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "User{" +
                "                            name:'" + name + '\'' +
                ",                             age:" + age +
                '}';
    }
}

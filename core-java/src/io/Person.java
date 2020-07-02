package io;

import java.io.Serializable;

class Person implements Serializable {
    private String name;
    private int age;
    private transient String ssn;

    public Person(String name, int age , String ssn){
        this.name = name;
        this.age =age;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
package com.melin.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;
import java.util.Map;

public class Person implements InitializingBean, DisposableBean {
    private Integer id;
    private String name;
    private String gender;
    private String birthday;
    private List<String> hobbies;
    private Map<Integer,String> course;
    private Wife wife;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", hobbies=" + hobbies +
                ", course=" + course +
                ", wife=" + wife +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<Integer, String> getCourse() {
        return course;
    }

    public void setCourse(Map<Integer, String> course) {
        this.course = course;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    public Person() {
        System.out.println("load Person default contructor");
    }


    public static Person createPersonFactory(){
        Child child = new Child();
        child.setName("兒子");
        return child;
    }

    public Person(Wife wife9){
        this.wife = wife9;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("實例化Person");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("銷毁Person");
    }


    public void initBean() throws Exception {
        System.out.println("實例化Person 2");
    }

    public void destroyBean() throws Exception {
        System.out.println("銷毁Person 2 ");
    }
}

package com.melin.beans;

/**
 * @author melin
 * @since 2022/7/20
 */
public class PersonFactory {
    public PersonFactory(){
        System.out.println("加載PersonFactory");

    }
    public Person createPersonFactoryMethod(){
        Child child = new Child();
        child.setName("大兒子");
        return child;
    }
}

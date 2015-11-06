package com.neo.hello;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	
	@Autowired
	Eye eye;
	
    public void greet() {
        System.out.println("Hello, World!!");
        eye.open();
    }
}
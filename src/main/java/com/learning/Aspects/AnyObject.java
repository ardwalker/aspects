package com.learning.Aspects;

import javax.annotation.Resource;

@Resource
public class AnyObject {

    public void run1() {
        System.out.println("Inside the run1 method");
    }

    public void run2(String msg) {
        System.out.println(String.format("Inside the run2 method - %s", msg));
    }

    @Override
    public String toString() {
        return "Anyobject::toString called";
    }
}


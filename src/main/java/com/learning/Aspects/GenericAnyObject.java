package com.learning.Aspects;

import javax.annotation.Resource;

@Resource
public class GenericAnyObject<T> {
    public void save(T val) {
        System.out.println("In generic");
    }
}

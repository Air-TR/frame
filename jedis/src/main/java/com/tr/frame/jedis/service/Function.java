package com.tr.frame.jedis.service;

public interface Function<E, T> {
    T callback(E e);
}
 

package com.bilgeadam.utility;

import java.util.List;

public interface ICrud <T>{

    T save(T entity);
    void update(T entity);
    List<T> findAll();
    T findById(Long id);
}

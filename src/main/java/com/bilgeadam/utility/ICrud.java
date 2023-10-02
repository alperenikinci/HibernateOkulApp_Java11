package com.bilgeadam.utility;

import java.util.List;

public interface ICrud <T>{

    List<T> findAll();
    T findById(Long id);
}

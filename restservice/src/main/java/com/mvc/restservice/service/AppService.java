package com.mvc.restservice.service;

import java.util.List;

public interface AppService<T, K> {

    public T add(T t);

    public T update(T t);

    public T get(K ref);

    public List<T> getAll();

    public void delete(K ref);
}

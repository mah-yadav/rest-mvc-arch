package com.mvc.restservice.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public abstract class GenericAppService<T, R> implements AppService<T, R> {

    private final MongoRepository<T, R> mongoRepository;

    public GenericAppService(MongoRepository<T, R> mongoRepository) {
        this.mongoRepository = mongoRepository;
    }

    @Override
    public T add(T t) {
        validateDataForAdd(t);
        return mongoRepository.save(t);
    }

    @Override
    public T update(T t) {
        validateDataForUpdate(t);
        return mongoRepository.save(t);
    }

    @Override
    public T get(R ref) {
        return mongoRepository.findById(ref).get();
    }

    @Override
    public List<T> getAll() {
        return mongoRepository.findAll();
    }

    @Override
    public void delete(R ref) {
        mongoRepository.deleteById(ref);
    }

    public abstract void validateDataForAdd(T t);

    public abstract void validateDataForUpdate(T t);
}

package com.online.banking.Service;

import com.online.banking.Repository.IRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.NoSuchElementException;

public class ServicePattern<T> {
    @Autowired
    IRepository<T> repository;

    public T add(T entity) {
        return repository.save(entity);
    }

    public T get(long id) {
        try {
            return repository.findById(id).get();
        } catch (NoSuchElementException exception) {
            return null;
        }
    }

    public T update(T entity) {
        return repository.save(entity);
    }

    public List<T> all() {
        return repository.findAll();
    }

    public boolean remove(long id) {
        try {
            T entity = repository.findById(id).get();
            if (entity != null) {
                repository.delete(entity);
                return true;
            }
        } catch (NoSuchElementException exception) {
        }
        return false;
    }

}

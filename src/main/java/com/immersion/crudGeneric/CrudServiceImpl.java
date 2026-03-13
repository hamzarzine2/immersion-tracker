package com.immersion.crudGeneric;

import java.util.Optional;

public abstract class CrudServiceImpl<T, ID> implements CrudService<T, ID> {
    private final BaseRepository<T, ID> repository;

    public CrudServiceImpl(BaseRepository<T, ID> repository) {
        this.repository = repository;
    }

    public Iterable<T> getAll() {
        return repository.findAll();
    }


    public Optional<T> getById(ID id) {
        return repository.findById(id);
    }


    public T create(T entity) {
        return repository.save(entity);
    }


    public T update(ID id, T entity) {
        return repository.save(entity);
    }


    public void delete(ID id) {
        Optional<T> object = repository.findById(id);
        repository.delete(object.get());// TODO GET CHECK NULL
    }


}
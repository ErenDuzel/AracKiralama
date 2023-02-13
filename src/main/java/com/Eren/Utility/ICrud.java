package com.Eren.Utility;

import java.util.List;
import java.util.Optional;

public interface ICrud <T,ID> extends IMyRepository<T,ID>{
    /**
     * Musteri musteri = new Musteri("muhammet","0555");
     * save(musteri);
     * save()
     * @param entity
     * @return
     * @param <S>
     */
    <S extends T> S save(S entity);
    <S extends T> Iterable<S> saveAll(Iterable<S> entities);
    <S extends T> S update(S entity);
    <S extends T> Iterable<S> updateAll(Iterable<S> entities);
    void delete(T entity);
    void deleteById(ID id);
    Optional<T> findById(ID id);
    boolean existById(ID id);
    List<T> findAll();

    /**
     * Varligin icinde bulunan herhangi bir alana gore kendisi otomatik olarak sorgulama yapar.
     * @return
     */
    List<T> findById();
    List<T> findAllByColumnNameAndValue(String columnName,String columnValue);

    public List<T> findByEntity(T entity);


}

package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

    TacoOrder save(TacoOrder order);

}
package com.example.demo;

import java.util.Optional;


public interface OrderRepository {

    TacoOrder save(TacoOrder order);

}
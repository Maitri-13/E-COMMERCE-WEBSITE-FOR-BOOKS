package com.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}

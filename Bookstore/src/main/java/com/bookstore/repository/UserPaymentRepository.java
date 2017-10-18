package com.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.UserPayment;

public interface UserPaymentRepository extends CrudRepository<UserPayment, Long>{

}

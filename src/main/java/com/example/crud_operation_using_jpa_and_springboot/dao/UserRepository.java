package com.example.crud_operation_using_jpa_and_springboot.dao;

import com.example.crud_operation_using_jpa_and_springboot.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {

    Optional<User> findAllById(int i);

    void deleteById(Integer id);
}
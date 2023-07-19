package com.example.crud_operation_using_jpa_and_springboot.dao;

import com.example.crud_operation_using_jpa_and_springboot.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
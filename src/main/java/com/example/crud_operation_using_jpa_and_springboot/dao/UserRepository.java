package com.example.crud_operation_using_jpa_and_springboot.dao;

import com.example.crud_operation_using_jpa_and_springboot.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {

    Optional<User> findAllById(int i);

    void deleteById(Integer id);
    public List<User> findByName(String name);
    public List<User> findByNameAndCity(String name, String city);

    @Query("Select u from User u")
    public List<User> getAllUser();

    @Query("Select u from User u where u.name =:n")
    public List<User> getUserByName(@Param("n") String name);

    @Query(
            value = "Select * from User",
            nativeQuery = true
    )
    public List<User> getAllNewUser();
}
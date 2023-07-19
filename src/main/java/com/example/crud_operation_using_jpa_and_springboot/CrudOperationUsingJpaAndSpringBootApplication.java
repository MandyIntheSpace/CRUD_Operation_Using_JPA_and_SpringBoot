package com.example.crud_operation_using_jpa_and_springboot;

import com.example.crud_operation_using_jpa_and_springboot.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.example.crud_operation_using_jpa_and_springboot.dao.UserRepository;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CrudOperationUsingJpaAndSpringBootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CrudOperationUsingJpaAndSpringBootApplication.class, args);
        UserRepository userRepository = context.getBean(UserRepository.class);


//        User user = new User();
//        user.setName("F1Soft Internationals");
//        user.setCity("Lalitpur");
//        user.setStatus("Java Developer");
//
//        User user1 = userRepository.save(user);
//        System.out.println(user);

        User user1 = new User();
        user1.setName("Mandip Timsina");
        user1.setCity("Damak");
        user1.setStatus("Spring Boot Framework Developer");

        User user2 = new User();
        user2.setName("Joel Khadka");
        user2.setCity("Birtamode");
        user2.setStatus("JavaScript Developer");



        List<User> list = List.of(user1, user2);
        Iterable<User> userResult =  userRepository.saveAll(list);

        userResult.forEach(user -> {
            System.out.println(user);
        });

//        User resultuser = userRepository.save(user2);

        System.out.println("The record of the user which are stored in the list are successfully stored in the database");

    }

}

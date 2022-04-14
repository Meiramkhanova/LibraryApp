package com.example.demo.repository;

import model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    // Jpa
    //1. Get users wich email ends with :email
    List<User> findByEmailEndsWith(String task1);
    //2. Get first 2 users which name starts with :name
    List<User> findTop2ByNameStartsWith(String task2);
    //3. Get users which surname contains :surname
    List<User> findBySurnameContaining(String task3);
    //4. Get users sorted by id (ascending order)
    List<User> findByOrderById();
    //5. Get 2 last inserted users from database
    List<User> findTop2ByOrderByIdDesc();
    //6. Get users sorted by name (descending order)
    List<User> findByOrderByNameDesc();  ///ne nado znachenie in skobkah kogda iest order,id
    //7. Get users with not containing :email
    List<User> findByEmailNotContaining(String task7);



    // Native Query


    //8. Get users which name and surname are equal
    @Query(value = "select * from users where name = surname", nativeQuery = true)
    List<User> findAllW();
    //9. Get users which email contains ( narxoz.kz, gmail.com, yandex.ru)
    @Query(value = "select * from users where email like '%gmail.com' or email like '%narxoz.kz' or email like '%yandex.ru'", nativeQuery = true)
    List<User> findAllQ();
    //10. Get users with unique names (if repeated take first)
    @Query(value = "select distinct on (name) * from users", nativeQuery = true)
    List<User> findAllE();
}

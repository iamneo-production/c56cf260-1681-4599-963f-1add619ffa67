package com.examly.springapp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
public interface UserRepository extends CrudRepository<User, Long>{
    List<User> findAll();
}
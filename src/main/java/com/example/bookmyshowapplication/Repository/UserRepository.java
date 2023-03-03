package com.example.bookmyshowapplication.Repository;

import com.example.bookmyshowapplication.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}
